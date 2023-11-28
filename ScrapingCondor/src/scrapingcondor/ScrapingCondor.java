/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrapingcondor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingCondor {

    public static Document getHTML(String URL) {
        Document html = null;
        try {
            html = Jsoup.connect(URL).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3").timeout(100000).get();
        } catch (IOException e) {
            System.out.println("Error para obtener el HTML");
        }
        return html;
    }

    public static void lineas() {
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

 //Vamos a obtener la informacion detalalda,vamos a recibir una URL como parametro para despues invocar nuestro metodo static
    public void scraping(String URL) {
        try {
            //Creamos una vairable de tipo Document donde vamos a guardar la estructura html de la url que le pasemos por parametros
            Document doc = getHTML(URL);
             if (doc.toString().contains("top.location")) {
                // Extraer la nueva URL de la redirección
                String nuevaURL = doc.select("script").html().split("'")[1];

                // Hacer una nueva solicitud a la URL redirigida
                doc = getHTML(nuevaURL);
            }
            
            System.out.println(doc);
            guardarHTML(doc);
           


        } catch (Exception e) {
            System.out.println("No se ha podido hacer scraping de Condor");
        }
    }
    
    private void guardarHTML(Document HTML){
        
        try{
             // Pregunta al usuario utilizando JOptionPane
        int option = JOptionPane.showOptionDialog(
                null, // Componente padre (en este caso, nulo para un cuadro de diálogo independiente)
                "¿Desea guardar el HTML en un archivo de texto?", // Mensaje
                "Confirmación", // Título del cuadro de diálogo
                JOptionPane.YES_NO_OPTION, // Tipo de opciones (Sí y No)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (en este caso, una pregunta)
                null, // Icono personalizado (puedes proporcionar un ImageIcon si lo deseas)
                new Object[]{"Sí", "No"}, // Opciones disponibles
                "Sí" // Opción predeterminada
        );

        // Manejar la respuesta del usuario
        if (option == JOptionPane.YES_OPTION) {
            BufferedWriter outStream = new BufferedWriter(new FileWriter("HTML.txt", true));
            
            outStream.write(HTML+"\n");
            outStream.close();
            JOptionPane.showMessageDialog(null, "HTML guardado exitosamente");
            //System.out.println("\nHTML guardado");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "El usuario seleccionó No.");
            // Realizar acciones relacionadas con la opción No aquí
        } else {
            // El usuario cerró el cuadro de diálogo o presionó el botón de cierre
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
            
            
        }catch(IOException exception){
            System.out.println("No se ha podido guardar el HTML de la pagina");
        }
     }
}
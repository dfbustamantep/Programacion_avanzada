/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrapingcondor;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author DBustamanteP
 */
public class ScrapingCondor {

   //El codigo recibe como parametro la url de una pagina web
    public static Document getHTML(String URL) {
        Document html = null;
        try {
            //extraemos la estructura html de la pagina con ayuda de la libreria Jsoup la cual tenemos que tener agregado el .jar
            html = Jsoup.connect(URL).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3").timeout(100000).get();

        } catch (IOException e) {
            System.out.println("Error para obtener el HTML");
        }
        //retornamos la estructurta html de la pagina
        return html;
    }
    
    //metodo que imprime lineas en la consola para que no quede todo junto
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
            //Elements programas = doc.select("div.encabezado-rojo");//

            //System.out.println("\t\tProgramas de pregrado");
            //lineas();


        } catch (Exception e) {
            System.out.println("No se ha podido hacer scraping de Condor");
        }
    }

}

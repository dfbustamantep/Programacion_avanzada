
package scrapingweb;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author DBustamanteP
 */
public class ScrapingWebPregrado {

    //El codigo recibe como parametro la url de una pagina web
    public static Document getHTML(String URL) {
        Document html = null;
        try {
            //extraemos la estructura html de la pagina con ayuda de la libreria Jsoup la cual tenemos que tener agregado el .jar
            html = Jsoup.connect(URL).userAgent("Brave").timeout(100000).get();
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
            int acum = 0;//acumnulador que usaremos para saber el numero de progrma que es
            Elements programas = doc.select("div.encabezado-rojo");//

            System.out.println("\t\tProgramas de pregrado");
            lineas();

            //Elements son nodos que vamos a estar recorriendo que pertenencen aprogramas
            for (Element p : programas) {
                //en la variable nombrePrograma guardamos el nombre del progrma de pregrado
                String nombrePrograma = p.select("h3.encabezados").text();
                //en la variable informacionPrograma guardamos toda la informacion del progrma que esta contenida en una lista desordenada                 
                String  informacionPrograma = p.select("div.content-box  ").text();
               
                acum++;//acumulador que nos dice el n de profgrma que etsaamos viendo

                //imprimimos las variables con un salto de linea y separamos con lineas
                System.out.println(acum);
                System.out.println(nombrePrograma);
                System.out.println(informacionPrograma);
                System.out.println("\n");
                lineas();

            }

        } catch (Exception e) {
            System.out.println("No se ha podido hacer scraping de los pregrados");
        }
    }

   

}

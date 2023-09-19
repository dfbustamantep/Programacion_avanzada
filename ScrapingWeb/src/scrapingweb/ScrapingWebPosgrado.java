
package scrapingweb;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static scrapingweb.ScrapingWebPregrado.getHTML;
import static scrapingweb.ScrapingWebPregrado.lineas;

/**
 *
 * @author DBustamanteP
 */
public class ScrapingWebPosgrado {
    //Vamos a obtener la informacion detalalda,vamos a recibir una URL como parametro para despues invocar nuestro metodo static

    public void scraping(String URL) {
        try {
            //Creamos una vairable de tipo Document donde vamos a guardar la estructura html de la url que le pasemos por parametros
            Document doc = getHTML(URL);
            int acum = 0;
            Elements programas = doc.select("div.encabezado-rojo");

            System.out.println("\t\tProgramas de posgrado");
            lineas();

            //Elements son nodos que vamos a estar recorriendo que pertenencen aprogramas
            for (Element p : programas) {
                //en la variable nombrePrograma guardamos el nombre del progrma de pregrado
                String nombrePrograma = p.select("h3.encabezados").text();
                //en la variable informacionPrograma guardamos toda la informacion del progrma que esta contenida en una lista desordenada                 
                String informacionPrograma = p.select("div.content-box  ").text();
               
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

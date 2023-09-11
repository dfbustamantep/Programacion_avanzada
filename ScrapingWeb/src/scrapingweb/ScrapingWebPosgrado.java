/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public void scraping(String URL){
        try{
            Document doc = getHTML(URL);
            int acum = 0;
            Elements programas = doc.select("div.encabezado-rojo");


            System.out.println("\t\tProgramas de posgrado");
            lineas();

            //Elements son nodos que vamos a estar recorriendo que pertenencen aprogramas
            for(Element p:programas){

                String nombrePrograma = p.select("h3.encabezados").text();
                //String facultad = p.select("div.content-box ").text();
                String facultad = p.select("div.content-box  ").text();
                acum++;

                System.out.println(acum);

                String li = null;

                 System.out.println(nombrePrograma);
                 System.out.println(facultad);

                System.out.println("\n");
                lineas();

           }
            
        }
        catch(Exception e){
            System.out.println("No se ha podido hacer scraping de los pregrados");     
        }
    }
}

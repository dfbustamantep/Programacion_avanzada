/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrapingweb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author DBustamanteP
 */

public class ScrapingWeb {
    
    //El codigo recibe como parametro la url de una pagina web
    public static Document getHTML(String URL){
        Document html = null;
        try{
            //extraemos la estructura html de la pagina con ayuda de la libreria Jsoup la cual tenemos que tener agregado el .jar
            html = Jsoup.connect(URL).userAgent("Brave").timeout(100000).get();
        }catch(Exception e){
            System.out.println("Error para obtener el HTML");
        }
        return html;
    }
    
    //Vamos a obtener la informacion detalalda,vamos a recibir una URL como parametro para despues invocar nuestro metodo static
    public void scraping(String URL){
        Document doc = getHTML(URL);
        
        Elements programas = doc.select("div.encabezado-rojo");
        //<div class="encabezado-rojo col-sm-12 col-xs-12">
        //Elements programas = doc.select("programas_pregrado");
       // Elements programas = ScrapingWeb.getHTML(URL);
        
        
        System.out.println("\t\tProgramas de pregrado");
        lineas();
        //Elements son nodos que vamos a estar recorriendo que pertenencen aprogramas
        for(Element p:programas){
            
            String nombrePrograma = p.select("h3.encabezados").text();
            String facultad = p.select("div.content-box").text();
            //<div class="content-box lista-none icon-box col-sm-6 col-xs-12 icon-file">
            System.out.println(" Nombre del programa academico "+nombrePrograma);
            System.out.println(facultad);
            System.out.println("\n");
            lineas();
            //System.out.println(nombreCoorinador);
           /*try{
                String nombrePrograma = p.select(".field-title").text();
                System.out.println("Nombre del programa academico "+nombrePrograma);
            }
            catch(Exception e){
                //e.getMessage();
                System.out.println("Error en programas");
            }*/
           
        }
    }
    public static void lineas(){
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
    
}

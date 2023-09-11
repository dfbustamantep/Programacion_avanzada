/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrapingweb;

/**
 *
 * @author DBustamanteP
 */
public class main {
    public static void main(String[] args) {
        ScrapingWebPregrado sw = new ScrapingWebPregrado ();
        String URLPregrados = "https://www.udistrital.edu.co/programas_pregrado";
        //System.out.println(ScrapingWeb.getHTML("https://www.udistrital.edu.co/programas_pregrado"));
       // sw.scraping("https://www.udistrital.edu.co/programas_pregrado");
        
        ScrapingWebPosgrado swP = new ScrapingWebPosgrado ();
        String URLPosgrados ="https://www.udistrital.edu.co/programas_posgrado";
        //swP.scraping("https://www.udistrital.edu.co/programas_posgrado");
        
        Menu m = new Menu(URLPregrados,URLPosgrados,sw,swP);
        m.menu();
    }
    
}

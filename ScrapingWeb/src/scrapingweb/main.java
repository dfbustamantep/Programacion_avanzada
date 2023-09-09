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
        ScrapingWeb sw = new ScrapingWeb ();
        //System.out.println(ScrapingWeb.getHTML("https://www.udistrital.edu.co/programas_pregrado"));
        sw.scraping("https://www.udistrital.edu.co/programas_pregrado");
    }
}

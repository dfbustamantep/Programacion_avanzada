/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrapingweb;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static scrapingweb.ScrapingWebPregrado.lineas;
/**
 *
 * @author DBustamanteP
 */
public class Menu {
    private String URLPregrados;
    private String URLPosgrados;
    private ScrapingWebPregrado sw;
    private ScrapingWebPosgrado swp;

    public Menu(String URLPregrados, String URLPosgrados, ScrapingWebPregrado sw, ScrapingWebPosgrado swp) {
        this.URLPregrados = URLPregrados;
        this.URLPosgrados = URLPosgrados;
        this.sw = sw;
        this.swp = swp;
    }
    
    public void menu() throws IOException, InterruptedException{
        Scanner opc = new Scanner(System.in);
        int opcion;
        
        do{
            //lineas();
           /* System.out.println("\t\tMenu");
            lineas();
            System.out.println("1-Mostrar programas de pregrado de la Universidad Distrital");
            System.out.println("2-Mostrar programas de posgrado de la Universidad Distrital");
            System.out.println("3-Mostrar todos los programas de la Universidad Distrital");
            System.out.println("4-Salir");
            lineas();
            System.out.println("Digite la opcion que desea: ");
            opcion=opc.nextInt();
            */
           opcion=Integer.parseInt(JOptionPane.showInputDialog("\t\tMenu\n1-Mostrar programas de pregrado de la Universidad Distrital\n2-Mostrar programas de posgrado de la Universidad Distrital\n3-Mostrar todos los programas de la Universidad Distrital\n4-Salir\n\nDigite la opcion que desea: "));
            
            switch(opcion){
                case 1:
                    sw.scraping(URLPregrados);
                    break;
                case 2:
                    swp.scraping(URLPosgrados);
                    break;
                case 3:
                    sw.scraping(URLPregrados);
                    lineas();
                    swp.scraping(URLPosgrados);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;
                    
            }
            }while(opcion!=4);
    }
}

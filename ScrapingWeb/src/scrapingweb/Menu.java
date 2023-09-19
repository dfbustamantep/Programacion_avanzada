
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
    //atributos a donde llegan la URL de las paginas web
    private String URLPregrados;
    private String URLPosgrados;
    
    //Instanciamos objetos de nuestras clases de Scraping WEb 
    private ScrapingWebPregrado swPE;
    private ScrapingWebPosgrado swPS;

    public Menu(String URLPregrados, String URLPosgrados, ScrapingWebPregrado sw, ScrapingWebPosgrado swp) {
        this.URLPregrados = URLPregrados;
        this.URLPosgrados = URLPosgrados;
        this.swPE = sw;
        this.swPS = swp;
    }

    public void menu() throws IOException, InterruptedException {
        //Scanner para cuando mostramos el menu por consola
        //Scanner opc = new Scanner(System.in);
        
        //Vatriable que hace refgerencia a la opcion que el usuario escoge del menu
        int opcion;

        //repetimos el mostrar y ejecutar las ocpiones del munu mientras el usuario digite una ocpion difeerente de 4
        do {
            //menu en consola
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

            //menu con JOptionPane
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\t\tMenu\n1-Mostrar programas de pregrado de la Universidad Distrital\n2-Mostrar programas de posgrado de la Universidad Distrital\n3-Mostrar todos los programas de la Universidad Distrital\n4-Salir\n\nDigite la opcion que desea: "));
            
            //Switch con respecto a la opcion que dijite el usuario
            switch (opcion) {
                case 1:
                    swPE.scraping(URLPregrados);
                    break;
                case 2:
                    swPS.scraping(URLPosgrados);
                    break;
                case 3:
                    swPE.scraping(URLPregrados);
                    lineas();
                    swPS.scraping(URLPosgrados);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;

            }
        } while (opcion != 4);
    }
}


package scrapingweb;

import java.io.IOException;

/**
 *
 * @author DBustamanteP
 */
public class main {

    public static void main(String[] args) throws IOException, InterruptedException {
        //instanciamos un objeto de scraping web pregrado
        ScrapingWebPregrado sWPe = new ScrapingWebPregrado();
        //en una vairable string guardamos la UTL de la pagian de pregrados
        String URLPregrados = "https://www.udistrital.edu.co/programas_pregrado";

        //instanciamos un objeto de scraping web posgrado
        ScrapingWebPosgrado sWPs = new ScrapingWebPosgrado();
        //en una vairable string guardamos la UTL de la pagian de psgrados
        String URLPosgrados = "https://www.udistrital.edu.co/programas_posgrado";

        //instanciamos un objeto de tipo menu y pasamos por parametros al constructor las variables creadas anterirmente
        Menu m = new Menu(URLPregrados, URLPosgrados, sWPe, sWPs);
        //llamamos al metodo menu de la clase menu
        m.menu();
    }

}

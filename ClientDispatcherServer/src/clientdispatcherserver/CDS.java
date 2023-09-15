/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdispatcherserver;

//herdamos de la clase printService
public class CDS extends PrintService {

    public CDS(String srv, String svc) {
        super(srv, svc);
    }

    public static Dispatcher disp;

    public static void main(String[] a) {
        disp = new Dispatcher();
        Client c1 = new Client();
        // Service svc1 = new PrintService("empanada", "luis");
        // Service svc2 = new PrintService("empanada", "carlos");
        Service svc3 = new PrintService("merengue", "juan");
        c1.doTask();
    }
}

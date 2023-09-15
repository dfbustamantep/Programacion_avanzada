/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdispatcherserver;

import javax.print.PrintService;

class Client {
    public Dispatcher dispatcher;
    public PrintService printService ;

    public void setPrintService(PrintService thePrintService) {
        printService = thePrintService;
    }

    //obetenemos el servicio
    public void doTask() {
        Service s;
        try {
            s = CDS.disp.locateServer("empanada");
            s.runService();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            s = CDS.disp.locateServer("merengue");
            s.runService();
        } catch (Exception e) {
            System.out.println("Not Found ");
        }
    }
}

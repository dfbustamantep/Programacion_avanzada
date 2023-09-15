/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdispatcherserver;

/**
 *
 * @author DBustamanteP
 */
//hereda de la clase service
public class PrintService extends Service {

    public PrintService(String srv, String svc) {
        super(srv, svc);
    }

    @Override
    public void runService() {
        System.out.println("Service : " + super.getNameofservice() + " ran by " + getNameofserver());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdispatcherserver;

/**
 *
 * @author DBustamanteP
 */

//clase abstracta,la cual no puede ser instanciada pero si heredada
public abstract class Service {
    private String nameofservice;
    private Object nameofserver;

    public String getNameofservice() {
        return nameofservice;
    }

    public Object getNameofserver() {
        return nameofserver;
    }

    public Service(String svc, String srv) {
        nameofservice = svc;
        nameofserver = srv;
        CDS.disp.registerService(nameofservice, this);
    }

    public void runService() {
    }
}

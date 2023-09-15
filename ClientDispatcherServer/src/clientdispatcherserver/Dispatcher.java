/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdispatcherserver;

import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author DBustamanteP
 */
class Dispatcher {

    public Client client;
    public Hashtable registry = new Hashtable();
    private Random rnd = new Random(123456);

    public void registerService(String svc, Service obj) {
        Vector v = (Vector) registry.get(svc);
        if (v == null) {
            v = new Vector();
            registry.put(svc, v);
        }
        v.addElement(obj);
    }
//con este metodo localizamos el servicio por su nombre

    public Service locateServer(String svc) {
        Vector v = (Vector) registry.get(svc);
        if (v == null || v.size() == 0) {
            try {
                throw new NotFound();
            } catch (NotFound e) {
                e.printStackTrace();
            }
        }
        int i = (rnd.nextInt()) % (v.size());
        return (Service) v.elementAt(i);
    }
}

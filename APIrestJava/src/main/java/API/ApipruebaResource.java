/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package API;

import com.api.bean.Gson;
import com.api.bean.Json;
import com.api.bean.Persona;
import com.api.bean.Telefono;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author DBustamanteP
 */
@Path("apiprueba")
@RequestScoped
public class ApipruebaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApipruebaResource
     */
    public ApipruebaResource() {
    }

    /**
     * Retrieves representation of an instance of API.ApipruebaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String consultaPErsona(@QueryParam("cedula") String cedula,
                                  @QueryParam("nombre") String nombre,                  
                                  @QueryParam("telefono") String telefono,
                                  @QueryParam("operador") String operador) {
        Persona persona = new Persona();
        Telefono tel = new Telefono();
        
        tel.setTelefono(telefono);
        tel.setOperador(operador);
        
        persona.setCedula(cedula);
        persona.setNombre(nombre);
        
        persona.setTelefono(tel);
        
        Json obj = new Json();
        obj.setPersona(persona);
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(obj);
        
        return jsonString;
    }

    /**
     * PUT method for updating or creating an instance of ApipruebaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.ws;

import java.util.Calendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author Rafael
 */
@WebService(serviceName = "hello")
public class hello {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saludo")
    public String saludo(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return "Hola " + nombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "edad")
    public int edad(@WebParam(name = "nacimiento") int nacimiento) {
        try {
            Calendar hoy = Calendar.getInstance();
            int anio = hoy.get(Calendar.YEAR);
            int res = anio  - nacimiento  ;
            if (res < 0) {
                return 0;
            } else {
                return res;
            }
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass) throws Exception {
       
        String us=desencriptar.Desencriptar(usuario);
        String ps=desencriptar.Desencriptar(pass);
        System.out.println("usuario desencriptado: " + us+" clave desencriptada: "+ps);
        if(us.equals("holger")&& ps.equals("1234")){
            return "correcto";
        }else{
            return "incorrecto";
        }
        
        
    }

    
    

}

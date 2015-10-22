/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Ras_ot
 */
import java.io.*;

public class ProbarSerializacion {
     public static void main(String[] args) {
        Direccion d1=new Direccion();
                 d1.setCalle("Calle 13");
                 d1.setColonia("Colonia Sanborns");
                 d1.setCp(55130);
                 d1.setMunicipio("Ecatepunk");
       Usuario u=new Usuario();
               u.setDireccion(d1);
               u.setLogin("campitos");
               u.setPassword("yo-Homero");
           //Ahora fijense bien como usamos la clase Persistencia
           PersistenciaUsuario2 p2=new PersistenciaUsuario2();
           try{
             p2.guardar(u);
             System.out.println("Este usuario se guardo con exito!");
             
           }catch(Exception e){
               System.out.println(e.getMessage()); 
           }
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-107
 */
import java.util.*;
public class PersistenciaUsuarios {
    public ArrayList <Usuario> obtenerUsuario(){
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        //Empesamos a llenar el ArrayList generico a la clase usuario
        Direccion d1=new Direccion ();
                  d1.setCalle("Av. Mexico");
                  d1.setColonia("Ejidos Tulpetlac");
                  d1.setCp (55130);
                  d1.setMunicipio("Eatepec");
        
        Usuario u1=new Usuario();
                u1.setDireccion(d1);
                u1.setLogin("otniel");
                u1.setPassword("algo");
        usuarios.add(u1);
        
        
        Direccion d2=new Direccion();
                  d2.setCalle("Calle la Viga");
                  d2.setColonia("Jajalpa");
                  d2.setCp(55123);
                  d2.setMunicipio("Ecatepec");
                  
                  Usuario u2=new Usuario();
                          u2.setDireccion(d2);
                          u2.setLogin(null);
                          u2.setPassword(null);
         usuarios.add(u2);  
         
         Direccion d3=new Direccion();
                   d3.setCalle("Suer 44");
                   d3.setColonia("San Agustin");
                   d3.setCp(55234);
                   d3.setMunicipio("Ecatepec");
                   
                   Usuario u3=new Usuario();
                           u3.setDireccion(d3);
                           u3.setLogin(null);
                           u3.setPassword(null);
         usuarios.add(u3);
         
          Direccion d4=new Direccion();
                    d4.setCalle("Sur 22");
                    d4.setColonia("San Pedro");
                    d4.setCp(50090);
                    d4.setMunicipio("Acolman");
                    
           Usuario u4=new Usuario();
                   u4.setDireccion(d4);
                   u4.setLogin("panfilo");
                   u4.setPassword("nose");
            usuarios.add(u4);       
         
                  
        return usuarios;
}
}
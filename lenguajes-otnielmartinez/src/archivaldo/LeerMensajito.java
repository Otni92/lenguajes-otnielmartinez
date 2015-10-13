/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

import java.io.*;

/**
 *
 * @author T-107
 */
public class LeerMensajito {
    public static void main(String[] args)throws Exception {
        //Ahora vamos a Leer ESTS ES OTRA CLASE 
        // EL PRIMER PASO ES OBTENER EL ARCHIVO QUE SE GUARDO 
        File file=new File ("D:\\sucio.xxx");
        //el segundo paso es establecer la direccion de la informacion 
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fis);
      String mensaje=  (String) inputStream.readObject();
        System.out.println(mensaje);
    }
}

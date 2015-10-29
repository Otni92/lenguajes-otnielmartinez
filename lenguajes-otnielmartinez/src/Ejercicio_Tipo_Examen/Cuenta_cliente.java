/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Tipo_Examen;

/**
 *
 * @author T-10A
 */
import java.util.ArrayList;
import java.io.*;
public class Cuenta_cliente {
      ArrayList<Carrito_Electronico> carrito;
    public Cuenta_cliente(){
        carrito=new java.util.ArrayList<Carrito_Electronico>();
    }
    
  public void guardar( )throws Exception{
        //este es el mas difiicl por que este usa el de abajo
      Carrito_Electronico carro =new Carrito_Electronico();
        File f=new File ("C:\\examen.ett");
        if(f.exists())carrito=buscartodos();
        FileOutputStream  fos=new FileOutputStream(f);
        ObjectOutputStream oss=new ObjectOutputStream (fos);
        carrito.add(carro);
        oss.writeObject(carrito);
        
     }
    
     public java.util.ArrayList<Carrito_Electronico> buscartodos()throws Exception {
         File file=new File ("C:\\examen.ett");
          FileInputStream  fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream (fis);
        carrito=(java.util.ArrayList<Carrito_Electronico>) ois.readObject();
       
        return carrito;
    }
}

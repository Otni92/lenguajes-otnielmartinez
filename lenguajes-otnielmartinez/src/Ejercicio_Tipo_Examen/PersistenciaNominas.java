/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Tipo_Examen;

/**
 *
 * @author T-107
 */
import java.util.ArrayList;
import java.io.*;
public class PersistenciaNominas    
 {
      ArrayList<Nomina> nominas;
    public PersistenciaNominas(){
        nominas=new java.util.ArrayList<Nomina>();
    }
    
  public void guardar( )throws Exception{
        //este es el mas difiicl por que este usa el de abajo
      Nomina nomina=new Nomina();
        File f=new File ("C:\\examen.ett");
        if(f.exists())nominas=buscartodos();
        FileOutputStream  fos=new FileOutputStream(f);
        ObjectOutputStream oss=new ObjectOutputStream (fos);
        nominas.add(nomina);
        oss.writeObject(nominas);
        
     }
    
     public java.util.ArrayList<Nomina> buscartodos()throws Exception {
         File file=new File ("C:\\examen.ett");
          FileInputStream  fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream (fis);
        nominas=(java.util.ArrayList<Nomina>) ois.readObject();
       
        return nominas;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

/**
 *
 * @author T-107
 */
import java.io.*;
public class Galeria implements Serializable{
    private String titulo; 
     private String descripcion; 
 
 
     public Galeria(String titulo, String descripcion) { 
         this.titulo = titulo; 
         this.descripcion = descripcion; 

    } 
      
 
 
     public String getTitulo() { 
         return titulo; 
     } 
 
 
     public void setTitulo(String titulo) { 
         this.titulo = titulo; 
     } 
 
 
     public String getDescripcion() { 
         return descripcion; 
     } 
 
 
     public void setDescripcion(String descripcion) { 
         this.descripcion = descripcion; 
     } 

}

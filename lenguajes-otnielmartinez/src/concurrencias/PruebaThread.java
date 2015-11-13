/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencias;

/**
 *
 * @author T-107
 */
public class PruebaThread implements Runnable{
    public static void main(String[] args) {
        //primer paso creado 
        PrimerThread t1=new PrimerThread();
        //segundo paso creado 
      
        
        Runnable r2=new PruebaThread();
        Thread t2=new Thread(r2);
        
        //tercer forma de crear thread esta es la mera neta 
        //usando clases internas anonimas
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Yo soy un thread como clase interna anonima");
            }
            
        });
        t1.start();
        t2.start();
        t3.start();
    }  
    public void run (){
        System.out.println("Soy el segundo threadsito");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Senebal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */

    /*
    Desarrollar el siguiente programa:
    Crear una ventana JFreme con un JLabel que al ejecutarse aparesca en el 
    label un contador que inicie desde 30 y que aga un conteo en retroceso.
    Al llegar al numero 20 se deve cerrar una ventana y abrirse automaticamente
    una segunda ventana con otro JLabel qu contenga el contador desde el 19 al 
    llegar al 10 debe de cerrarse dicha ventana y debe de aparecer una tercera
    JFreme igual que las anteriores y el jLabel debe de continuar
    el conteo hasta llegar al cero y alli debe quedarse dicha ventana con el 
    contador en cero  el decremento en todo el es de 1 segundo 
    
    */




public class Examentiposenebal {
    static int  inicio30=30;
    
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                inicio30 c3=new inicio30();
                inicio19 c2=new inicio19();
                inicio10 c1=new inicio10();
                
                while(true){
                    if(inicio30>20){
                      c1.setVisible(true);
                    inicio10.ETIQUETA1.setText(""+inicio30);
                     
                       
                    }//termina if del primero
                    if(inicio30<=20 &&inicio30>10){
                        
                        c1.setVisible(true);
                        inicio10.ETIQUETA1.setText(""+inicio30);
                    }
                    
                    if(inicio30<=10 &&inicio30>=0){
                         c1.setVisible(false);
                        c2.setVisible(true);
                       inicio19.ETIQUETA2.setText(""+inicio30);
                    }
                     try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        
                        }
                     inicio30--;
                }
        
            }
            
        });
        t1.start();
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas{
public static float apertura=0.01f;
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
      g.setColor(Color.white);
      g.fillRect(0, 0, getWidth(), getWidth());
      g.setColor(Color.black);
      //Eje x
      g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
      //Eje y
      g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
      
      g.translate(getWidth()/2, getHeight()/2);
      

      
      //Vamos a Graficar una Parabloa Simple
      
     
      Thread t1=new Thread(new Runnable(){
          float x0=-100;
      float x1=-99;
      float y0;
      float y1;
       public void run(){
              
        while (x0<400){      
      
    
        
      y0=-apertura*x0*x0+10;
      y1=-apertura*x1*x1+10;
      g.drawLine((int) x0,(int) y0,(int) x1, (int) y1);
        g.drawString("origen de cordenadas", 0, 0);
       Graphics gg=getGraphics();
       
      
      try{
          
      Thread.sleep(300);
          System.err.println("la idea es esa ");
      } catch (InterruptedException ex) {
        
      }
      
      x0++;
      x1++;
              }
       }
          
      
      });
      t1.start();
      //Vamos a graficar la funcion seno
      
     /* double xseno0=-100*Math.PI-1;
      double xseno1=-100*Math.PI;
      double yseno0;
      double yseno1;
      for(int i=0; i<=500; i++){
      yseno0=50*Math.sin(xseno0*25);
      yseno1=50*Math.sin(xseno1*25);
      g.drawLine((int) xseno0, (int)yseno0, (int)xseno1, (int)yseno1);
      xseno0++;
      xseno1++;
             
      }*/
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        int posx=0;
        int posy=0;
        System.out.println("Haz echo click sobre la grafica ");
        System.out.println("posicion es : ("+x+","+y+")");
        Graphics g=getGraphics();
        
        g.translate(getWidth()/2, getHeight()/2);
      
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
    
    
}

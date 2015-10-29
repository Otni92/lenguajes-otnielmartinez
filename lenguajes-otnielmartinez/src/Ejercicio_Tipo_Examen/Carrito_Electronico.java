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
public class Carrito_Electronico {
  public ArrayList<Cliente> cliente(){
      ArrayList<Cliente> cliente1=new ArrayList <Cliente>();
      Productos p1=new Productos();
      p1.setCosto(52);
      p1.setDepartamento("bebidas");
      p1.setNombre("coca");
      Cliente c1=new Cliente();
      c1.setMail("ot_niel@hotmasil.com");
      c1.setProducto(p1);
      c1.setTipo_pago("terjeta");
      cliente1.add(c1);
      return cliente1;
  }
}

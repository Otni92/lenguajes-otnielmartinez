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
public class Empleados {
  
    private String Nombre;
    private String ApellidoPaterno;
    private String Seguro_Social;
    private float Sueldo_base;
    private int Horas_Extras;

    public Empleados(String Nombre, String ApellidoPaterno, String Seguro_Social, float Sueldo_base, int Horas_Extras) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.Seguro_Social = Seguro_Social;
        this.Sueldo_base = Sueldo_base;
        this.Horas_Extras = Horas_Extras;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getSeguro_Social() {
        return Seguro_Social;
    }

    public void setSeguro_Social(String Seguro_Social) {
        this.Seguro_Social = Seguro_Social;
    }

    public float getSueldo_base() {
        return Sueldo_base;
    }

    public void setSueldo_base(float Sueldo_base) {
        this.Sueldo_base = Sueldo_base;
    }

    public int getHoras_Extras() {
        return Horas_Extras;
    }

    public void setHoras_Extras(int Horas_Extras) {
        this.Horas_Extras = Horas_Extras;
    }
}

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
public class Nomina {
    private String trabajador;
    private String departamento;

    public Nomina(String trabajador, String departamento) {
        this.trabajador = trabajador;
        this.departamento = departamento;
    }

    Nomina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_claudiohernandez;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author Claudio Hernandez
 */
public class usuarios {
    /*
    
    Los usuarios tienen atributos de: código (Es un número con formato ####),primer nombre,
    primer apellido, edad, 
    libros prestados e
    historial de préstamosdeestos se pueden modificar todos exceptuando la lista de libros prestados 
    y el historial ya que esta se genera a lo largo del tiempo.
    
    */
    private String codigo,nombre,apellido;
    private int edad;
    private ArrayList<libros> librosPrestados =  new ArrayList();
    private ArrayList<libros> Historial =  new ArrayList();

    public usuarios() {
    }

    public usuarios( String nombre, String apellido, int edad,String codigo) {
        this.codigo  =codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
       
       
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<libros> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<libros> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public ArrayList<libros> getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList<libros> Historial) {
        this.Historial = Historial;
    }

    @Override
    public String toString() {
        return "usuarios{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", librosPrestados=" + librosPrestados + ", Historial=" + Historial ;
    }
    
    
}

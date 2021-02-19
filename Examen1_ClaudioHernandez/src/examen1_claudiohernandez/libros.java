/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_claudiohernandez;

import java.security.SecureRandom;
import java.util.Date;

/**
 *
 * @author Claudio Hernandez
 */
public class libros {

    /*
    
    Los libros tienen los siguientes atributos: autores, 
    titulo , genero , Editoriales, idioma,
    año que se escribió, ISBN(International Standard Book Number,este es un númeroúnico para cada libro en la librería y 
    tiene que tener la siguiente estructura para que sea válido: ####-#### -####-####) , año que ingresa en la librería, 
    estado del libro (Prestado , disponible y fuera de inventario), 
    nombre de la persona prestado(Si no estáprestado a nadie solo se pondra “-----“) , 
    númerode cuenta de la persona prestada(Si no estáprestado se usara 0000) 
    
    
     */
    private String autor, titulo, genero, Editoriales, idioma, codigoISBN, estadoLibro = "Disponible", nombreAprestado = "-----";
    private String CodigodePersona;
    private Date anioEscribio, anioEntroALibreria;

    public libros() {
    }

    public libros(String autor, String titulo, String genero, String Editoriales, String idioma,   Date anioEscribio, Date anioEntroALibreria) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.Editoriales = Editoriales;
        this.idioma = idioma;
        this.setCodigoISBN();
        this.anioEscribio = anioEscribio;
        this.anioEntroALibreria = anioEntroALibreria;
    }

    public String getCodigodePersona() {
        return CodigodePersona;
    }

    public void setCodigodePersona(String CodigodePersona) {
        this.CodigodePersona = CodigodePersona;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return Editoriales;
    }

    public void setEditoriales(String Editoriales) {
        this.Editoriales = Editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN() {
        String codigo = "";
        SecureRandom c = new SecureRandom();
        for (int i = 1; i <= 19; i++) {
             if (i==5||i==10||i==15) {
                codigo += "-";
            } else {
                codigo += "" + c.nextInt(9);
            }
            
        }
        this.codigoISBN = codigo;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getNombreAprestado() {
        return nombreAprestado;
    }

    public void setNombreAprestado(String nombreAprestado) {
        this.nombreAprestado = nombreAprestado;
    }

    public Date getAnioEscribio() {
        return anioEscribio;
    }

    public void setAnioEscribio(Date anioEscribio) {
        this.anioEscribio = anioEscribio;
    }

    public Date getAnioEntroALibreria() {
        return anioEntroALibreria;
    }

    public void setAnioEntroALibreria(Date anioEntroALibreria) {
        this.anioEntroALibreria = anioEntroALibreria;
    }

    @Override
    public String toString() {
        return "libros" + "autor" + autor + ", titulo=" + titulo + ", genero=" + genero + ", Editoriales=" + Editoriales + ", idioma=" + idioma + ", codigoISBN=" + codigoISBN + ", estadoLibro=" + estadoLibro + ", nombreAprestado=" + nombreAprestado + "Codigo de persona" + CodigodePersona + ", anioEscribio=" + anioEscribio + ", anioEntroALibreria=" + anioEntroALibreria;
    }

}

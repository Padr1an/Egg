/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Entidad;

/**
 *
 * @author Pablo
 */
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int nropag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nropag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nropag = nropag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNropag() {
        return nropag;
    }

    public void setNropag(int nropag) {
        this.nropag = nropag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nropag=" + nropag + '}';
    }
    
    
    
}

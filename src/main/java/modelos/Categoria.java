/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Categoria {
    private final int id;
    private final String nombre;
    private List<Libro> libros;

    public Categoria(final int id, final String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    void agregarLibro(Libro L){
        libros.add(L);
    }
    
}

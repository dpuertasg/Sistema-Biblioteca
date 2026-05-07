/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author USER
 */
public class Prestamo {
    private final int id;
    private Libro libro;
    private String usuario;
    private int dia;
    private int mes;
    private int anio;

    public Prestamo(final int id, Libro libro, String usuario, int dia, int mes, int anio) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}

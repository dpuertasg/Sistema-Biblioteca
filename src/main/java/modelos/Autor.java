/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author USER
 */
public class Autor {
    private int id;
    private final String nombre;
    private final int anioNacimiento;

    public Autor(int id, final String nombre, final int anioNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema.biblioteca;
import java.awt.BorderLayout;
import modelos.Biblioteca;
import modelos.Categoria;
import modelos.Libro;
import vista.sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SistemaBiblioteca {
   List<Categoria> categorias = new ArrayList<>();
   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
        sistema sistema = new sistema();
        sistema.setVisible(true);
       
    }
    
//crear categoria y agregar categorias
        void agregarCategoria(){
        //pedir datos
        System.out.println("digite el id de la categoria que desea agregar o crear");
        int id = sc.nextInt();
        System.out.println("digite el nombre de la categoria que desea agregar o crear");
        String nombre = sc.nextLine();
        //validacion de la exitencia de la categoria 
        boolean existe = false;
        for(int i = 0; i < categorias.size(); i++){
            if(nombre == categorias.get(i).getNombre()){
                System.out.println("esta categoria ya existe, por favor revise correctamente");
                existe = true;
            }else if(id == categorias.get(i).getId()){
                System.out.println("esta categoria ya existe, por favor revise correctamente");
                existe = true;
            }
        }
        if (existe == false){
            
        }
        
    }
}

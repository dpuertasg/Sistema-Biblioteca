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
import modelos.Autor;
/**
 *
 * @author USER
 */
public class SistemaBiblioteca {
   List<Categoria> categorias = new ArrayList<>();
   List<Libro> libros = new ArrayList<>();
   List<Autor> autores = new ArrayList<>();
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
        //crear categoria
        Categoria categoria = new Categoria(id,nombre);
        categorias.add(categoria);
        //agregar libros a dicha categoria para que no se inicalize vacia
        if (existe == false){
            //ahora usaremos la variable existe para avergiguar si ya hay un libro o autor con dicho id 
            boolean deseaRegistrar = false;
            String nombreL;
            int isbn;
            do{
               do{ System.out.println("digite el nombre del libro:");
                nombreL = sc.nextLine(); //en reerencia al nombre del libro
                System.out.println("digite el isbn del libro");
                isbn = sc.nextInt();
                sc.nextLine();
                //solo existe un unico isbn, si hay dos o mas iguales hay datos erroneos
                for(int i = 0; i < libros.size(); i++){
                    if(libros.get(i).getIsbn() == isbn){
                        System.out.println("ya se registra un libro con dicho isbn, por favor vuelva a registrar");
                        existe = true;
                    }
                }
               }while(existe == true);
               existe = false; // lo pongo por si acaso jaja
               String nombreA; // nombre del autor
               int idA;
               do{
                System.out.println("digite el nombre del autor del libro");
                nombreA = sc.nextLine();
                System.out.println("digite el id del autor");
                idA = sc.nextInt(); // id Autor
                sc.nextLine();
                for(int i = 0; i < autores.size(); i++){
                    if(autores.get(i).getId() == idA){
                        System.out.println("ya se registra un autor con dicho id, por favor vuelva a registrar");
                        existe = true;
                    }
                }
               }while(existe == true);
               System.out.println("digite el anio de nacimiento del autor");
               int anio = sc.nextInt();
               //agregar autor
               Autor autor = new Autor(idA,nombreA,anio);
               autores.add(autor);
               //agregar libro
                Libro libro = new Libro(isbn, nombreL ,autor ,categoria);
                libros.add(libro);
                System.out.println("ha concluido con los datos del libro, desea continuar registrando?\n presione 0 para no y 1 para si");
                int elegir = sc.nextInt();
                sc.nextLine();
                switch (elegir){
                    case 0:{
                        System.out.println("se ha registrado el libro correctamente en la categoria " + nombre);
                        deseaRegistrar = true;
                        break;
                    }
                    case 1:{
                        System.out.println("agregue datos para el proximo libro en la categoria " + nombre);
                        deseaRegistrar = false;
                        break;
                    }
                    default:{
                        System.out.println("no selecciono ninguna de las opciones presentadas, por favor vuelva a digitar");
                    }
            }
            }while(deseaRegistrar == false);
        }
        
    }
        void agregarAutor(){
            boolean existe = false;//sera verdadero si si existe
             String nombreA; // nombre del autor
               int idA;
               do{
                System.out.println("digite el nombre del autor del libro");
                nombreA = sc.nextLine();
                
                System.out.println("digite el id del autor");
                idA = sc.nextInt(); // id Autor
                sc.nextLine();
                for(int i = 0; i < autores.size(); i++){
                    if(autores.get(i).getId() == idA){
                        System.out.println("ya se registra un autor con dicho id, por favor vuelva a registrar");
                        existe = true;
                    }
                }
               }while(existe == true);
               System.out.println("digite el anio de nacimiento del autor");
               int anio = sc.nextInt();
               //agregar autor
               Autor autor = new Autor(idA,nombreA,anio);
               autores.add(autor);
        }
        
        void agregarLibro(){
             //ahora usaremos la variable existe para avergiguar si ya hay un libro o autor con dicho id 
            boolean deseaRegistrar = false;
            String nombreL;
            int isbn;
            boolean existe = false;
            Autor autor = null;
            Categoria categoria = null;
               do{ System.out.println("digite el nombre del libro:");
                nombreL = sc.nextLine(); //en reerencia al nombre del libro
                System.out.println("digite el isbn del libro");
                isbn = sc.nextInt();
                sc.nextLine();
                //solo existe un unico isbn, si hay dos o mas iguales hay datos erroneos
                for(int i = 0; i < libros.size(); i++){
                    if(libros.get(i).getIsbn() == isbn){
                        System.out.println("ya se registra un libro con dicho isbn, por favor vuelva a registrar");
                        existe = true;
                    }else{
                        existe = false;
                    }
                }
               }while(existe == true);
               existe = false; // lo pongo por si acaso jaja
               //ya existe el autor del libro?
               int idA;
               String nombreA; // nombre del autor
               System.out.println("registre el id del autor del libro");
               idA = sc.nextInt();
               sc.nextLine();
               for(int i = 0; i < autores.size(); i++){
                   if(autores.get(i).getId() == idA){
                       System.out.println("se encontro al autor del libro, registrado con nombre: " + autores.get(i).getNombre());
                       autor = autores.get(i);
                       existe = true;
                   }
               }
               if(existe == false){
                System.out.println("digite el nombre del autor del libro");
                nombreA = sc.nextLine();
                System.out.println("digite el anio de nacimiento del autor");
               int anio = sc.nextInt();
               sc.nextLine();
                //agregar autor
                autor = new Autor(idA,nombreA,anio);
               autores.add(autor);
               }
               existe = false;
              System.out.println("digite el nombre de la categoria");
              String nombreC = sc.nextLine(); // nombre categoria
                int id; //para categoria
              for(int i = 0; i < categorias.size(); i++){
                  if(categorias.get(i).getNombre().equalsIgnoreCase(nombreC)){
                    categoria = categorias.get(i);
                    existe = true;
                  }
              }
              if(existe == false){
               System.out.println("digite el id de la categoria que desea agregar o crear");
               id = sc.nextInt();
                //crear categoria
               categoria = new Categoria(id,nombreC);
               categorias.add(categoria);
               //agregar libro
              }
                Libro libro = new Libro(isbn, nombreL ,autor ,categoria);
                libros.add(libro);
             
        }
}

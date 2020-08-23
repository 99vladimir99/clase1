/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02;

/**
 *
 * @author Vladimir
 */
public class claseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libros objetolibro1 = new libros(1, "PROGRAMACION JAVA", 100, "DEITEL");
        libros objetoLibro2 = new libros(2, "PROGRAMACION PHP", 600, "DEITEL");

//   System.out.println(libro.toString());
        if (objetolibro1.getNumeroPaginas() < objetoLibro2.getNumeroPaginas()) {

            System.out.println("El libro 2 es mayor que el libro 1, el libro 2 tiene un numero de paginas de "+objetoLibro2.getNumeroPaginas());
            System.out.println("la informacion del libro 2 es "+objetoLibro2.toString());
        } else {
            System.out.println("El libro 1 es mayor que el libro 2, el libro 1 tiene un numero de paginas de "+objetolibro1.getNumeroPaginas());
            System.out.println("la informacion del libro 1 es "+objetolibro1.toString());
        }

    }

}

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
public class libros {

   private int Id;
   private String NombreLibro;
   private int NumeroPaginas;
   private String Autor;
   
    public libros(int pId,String pNombreLibro,int pNumeroPaginas,String pAutor){
    
    Id = pId;
    NombreLibro = pNombreLibro;
    NumeroPaginas = pNumeroPaginas;
    Autor = pAutor;
   
    }
//get se utiliza paraq recuperar informacion
    public int getId() {
        return Id;
    }
//set se utiliza para modificar informacion
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "libros{" + "Id=" + Id + ", NombreLibro=" + NombreLibro + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }
   
   
    
    
    
}

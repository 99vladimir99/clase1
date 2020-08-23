/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Vladimir
 */
public class clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
    coche micarro = new coche("TOYOTA",2019,"ROJO");
    coche tucarro = new coche("Nissan",2019,"Azul");
    coche carroconparametros = new coche("Nissan",2019,"Azul",4);
    System.out.println(micarro.toString());
    System.out.println(tucarro.toString());           
    System.out.println(carroconparametros.toString());            
    }
    
}    


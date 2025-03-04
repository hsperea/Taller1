
package com.uniajc.programacion;


public class Herencia {
    

   
    public static void main(String[] args) {
        Abuelo abuelo = new Abuelo();
        Hija hija = new Hija();
        Padre padre = new Padre();
        
        abuelo.metodoAbuelo();
        System.out.println("");
        padre.metodoPadre();
        System.out.println("");
        hija.metodoHijo();
        System.out.println("");
        
        

    }
    
}
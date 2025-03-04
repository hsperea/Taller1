
package com.uniajc.programacion;


public class Hija extends Padre{
    String varHijo = "Hijo";
    
    public void metodoHijo(){
        metodoPadre();
        System.out.println("varHijo");
        
    }
    
}
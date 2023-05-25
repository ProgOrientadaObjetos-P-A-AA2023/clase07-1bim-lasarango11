/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ciudad {
    private String nombre;
    private String barrio;
    public Ciudad (String n,String b) {
     nombre = n;
     barrio = b;
    }
    public  void establecerNombre (String n ) {
        nombre = n;
       
    }
     public  void establecerBarrio (String b ) {
        barrio = b ;
       
    }
     public  String obtenerNombre (  ) {
        return nombre  ;
       
    }
     public  String obtenerBarrio ( ) {
        return barrio ;
       
    }
    @Override
    public String toString(){
        String valor = String.format("%s-%s\n", obtenerNombre(), 
                obtenerBarrio());
        return valor;
    }
}

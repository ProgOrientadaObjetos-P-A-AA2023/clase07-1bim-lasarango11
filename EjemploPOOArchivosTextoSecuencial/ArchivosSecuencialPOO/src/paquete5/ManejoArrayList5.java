/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author SALA H
 */
public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] Lineas = {"Trara|Contratado|30", "Luis Andrade|factura|35",
            "Ana Juarez|nombreamiento|40"};
        /*
        split(",")
        split(";")
        split("\\|")
        split("\\*")
         */
        for (int i = 0; i < Lineas.length; i++) {
            String c = Lineas[i];
            System.out.printf("%s\n", c);
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(Lineas[i].split("\\|"))
            );
            String nombre = linea_partes.get(0);
            String tipo = linea_partes.get(1);
            String edad = linea_partes.get(2);
            int edad2 =Integer.parseInt(edad);
               Profesor2     profesor = new Profesor2(nombre,tipo,edad2);
            System.out.printf("%s\n",profesor);
        }
    }

}

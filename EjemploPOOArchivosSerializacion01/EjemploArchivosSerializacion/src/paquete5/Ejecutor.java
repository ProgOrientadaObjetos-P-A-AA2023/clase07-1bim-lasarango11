/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        // nombre del archivo
        String nombreArchivo = "Hospitales.data";

        Ciudad c1 = new Ciudad("Loja", "San Sebastian");
        Ciudad c2 = new Ciudad("Loja", "Sagrario");
        Ciudad c3 = new Ciudad("Quito", "Carcelen");
        Ciudad c4 = new Ciudad("Quito", "Calderon");
        Ciudad c5 = new Ciudad("Guayaquil", "Centenario");

        Hospital h1 = new Hospital("Isisdro Ayora", 200, 20000, c1);
        Hospital h2 = new Hospital("San Agustin", 100, 15000, c2);
        Hospital h3 = new Hospital("San Ines", 250, 25000, c3);
        Hospital h4 = new Hospital("San Gerardo", 200, 30000, c4);
        Hospital h5 = new Hospital("San Cayetano", 300, 40000, c5);

        Hospital[] lista = {h1, h2, h3, h4, h5};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistroHospital(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}

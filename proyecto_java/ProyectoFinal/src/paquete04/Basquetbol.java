/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Basquetbol {
    public static String registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        
        try {
            System.out.print("Ingrese el nombre del participante: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Ingrese la edad del participante: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Ingrese la posición preferida: ");
            String posicion = entrada.nextLine();

            System.out.print("Ingrese la estatura: ");
            String estatura = entrada.nextLine();

            System.out.print("Ingrese la ciudad: ");
            String ciudad = entrada.nextLine();

            cadena = "Registro - Básquetbol:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Posición preferida: " + posicion + "\n"
                    + "Estatura: " + estatura + "\n"
                    + "Ciudad: " + ciudad + "\n\n";
                    
        } catch (Exception e) {
            cadena = "Error en el registro de participante: " + e.getMessage();
        }

        return cadena;
    }
}
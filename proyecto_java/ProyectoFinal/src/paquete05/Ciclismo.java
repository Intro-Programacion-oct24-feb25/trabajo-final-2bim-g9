/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ciclismo {
    public static String registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        
        try {
            System.out.print("Ingrese el nombre del participante: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Ingrese la edad del participante: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Ingrese el tipo de ciclismo (montaña, ruta, urbano): ");
            String tipoCiclismo = entrada.nextLine();

            System.out.print("Ingrese la ciudad: ");
            String ciudad = entrada.nextLine();

            System.out.print("Ingrese la marca de bicicleta preferida: ");
            String marcaBicicleta = entrada.nextLine();

            cadena = "Registro - Ciclismo:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Tipo de ciclismo: " + tipoCiclismo + "\n"
                    + "Ciudad: " + ciudad + "\n"
                    + "Marca de bicicleta preferida: " + marcaBicicleta + "\n\n";
                    
        } catch (Exception e) {
            cadena = "Error en el registro de participante: " + e.getMessage();
        }

        return cadena;
    }
}
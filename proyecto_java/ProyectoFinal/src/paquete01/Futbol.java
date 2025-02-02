/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Futbol {
    public static String registrarParticipanteFutbol() {
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

            System.out.print("Ingrese la ciudad: ");
            String ciudad = entrada.nextLine();

            System.out.print("Ingrese el equipo favorito: ");
            String equipoFavorito = entrada.nextLine();

            cadena = "Registro - Fútbol:\n" +
                     "Nombre: " + nombre + "\n" +
                     "Edad: " + edad + "\n" +
                     "Posición preferida: " + posicion + "\n" +
                     "Ciudad: " + ciudad + "\n" +
                     "Equipo favorito: " + equipoFavorito + "\n\n";

        } catch (Exception e) {
            cadena = "Error en el registro de participante: " + e.getMessage();
        }

        return cadena;
    }
}
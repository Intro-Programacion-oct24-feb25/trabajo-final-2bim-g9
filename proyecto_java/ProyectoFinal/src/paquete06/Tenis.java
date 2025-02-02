/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Tenis {
    public static String registrarParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";

        try {
            System.out.print("Ingrese el nombre del participante: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese la edad del participante: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Ingrese el nivel (principiante, intermedio, avanzado): ");
            String nivel = entrada.nextLine();

            System.out.print("Ingrese la ciudad: ");
            String ciudad = entrada.nextLine();

            System.out.print("Ingrese la mano hábil (derecha/izquierda): ");
            String manoHabil = entrada.nextLine();

            cadena = "Registro - Tenis:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Nivel: " + nivel + "\n"
                    + "Ciudad: " + ciudad + "\n"
                    + "Mano hábil: " + manoHabil + "\n\n";

        } catch (Exception e) {
            cadena = "Error en el registro de participante: " + e.getMessage();
        }

        return cadena;
    }
}
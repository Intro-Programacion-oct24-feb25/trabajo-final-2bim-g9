/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Atletismo {

    public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";

        try {
            System.out.print("Ingrese el nombre del participante: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese la edad del participante: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Ingrese la especialidad (carreras, salto, lanzamiento): ");
            String especialidad = entrada.nextLine();

            System.out.print("Ingrese la ciudad: ");
            String ciudad = entrada.nextLine();

            System.out.print("Ingrese el récord personal: ");
            String recordPersonal = entrada.nextLine();

            cadena = "Registro - Atletismo:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Especialidad: " + especialidad + "\n"
                    + "Ciudad: " + ciudad + "\n"
                    + "Récord personal: " + recordPersonal + "\n\n";

        } catch (Exception e) {
            cadena = "Error en el registro de participante: " + e.getMessage();
        }

        return cadena;
    }

}

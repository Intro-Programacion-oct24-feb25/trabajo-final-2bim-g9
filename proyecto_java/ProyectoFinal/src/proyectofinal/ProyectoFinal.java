/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;
import paquete01.Futbol;
import paquete02.Natacion;
import paquete03.Atletismo;
import paquete04.Basquetbol;
import paquete05.Ciclismo;
import paquete06.Tenis;
import paquete07.Yoga;
import paquete08.Reporte;

/**
 *
 * @author utpl
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    static String resumenRegistro = "";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;
        int opcion;
        int totalParticipantes = 0;
        int[] participantesRegistrados = new int[7];
        String[] actividades = {"Fútbol", "Natación", "Atletismo", "Básquetbol",
            "Ciclismo", "Tenis", "Yoga"};

        do {
            try {
                System.out.println("Menú:");
                for (int i = 0; i < actividades.length; i++) {
                    System.out.println((i + 1) + ". " + actividades[i]);
                }

                System.out.println("Ingrese la actividad en la que desea registrar un nuevo participante:");
                opcion = entrada.nextInt();
                entrada.nextLine();  // Limpiar el buffer

                if (opcion == 1) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Futbol.registrarParticipanteFutbol());
                    participantesRegistrados[0]++;
                } else if (opcion == 2) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Natacion.registrarParticipanteNatacion());
                    participantesRegistrados[1]++;
                } else if (opcion == 3) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Atletismo.registrarParticipanteAtletismo());
                    participantesRegistrados[2]++;
                } else if (opcion == 4) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Basquetbol.registrarParticipanteBasquetbol());
                    participantesRegistrados[3]++;
                } else if (opcion == 5) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Ciclismo.registrarParticipanteCiclismo());
                    participantesRegistrados[4]++;
                } else if (opcion == 6) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Tenis.registrarParticipanteTenis());
                    participantesRegistrados[5]++;
                } else if (opcion == 7) {
                    resumenRegistro = String.format("%s%s", resumenRegistro,
                            Yoga.registrarParticipanteYoga());
                    participantesRegistrados[6]++;
                } else {
                    System.out.println("Lo sentimos, el club no tiene esa opción.");
                }

                System.out.print("¿Desea registrar otro participante? (S/N): ");
                continuar = entrada.nextLine().toUpperCase();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                entrada.nextLine();  // Limpiar el buffer en caso de una entrada inválida
                continuar = "S";  // Continuar el ciclo para corregir la entrada
            }
        } while (continuar.equals("S"));

        for (int i = 0; i < participantesRegistrados.length; i++) {
            totalParticipantes += participantesRegistrados[i];
        }

        String cadenaInformacion = Reporte.ObtenerInformacion(totalParticipantes);
        System.out.println(cadenaInformacion);

        String cadenaReporte = Reporte.obtenerReporte(actividades, participantesRegistrados);
        System.out.println(cadenaReporte);

        System.out.println("Resumen de los registros: ");
        System.out.println(resumenRegistro);
    }
}

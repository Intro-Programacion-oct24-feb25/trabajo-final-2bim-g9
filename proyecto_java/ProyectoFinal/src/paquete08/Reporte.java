/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author villa
 */
public class Reporte {

   public static String ObtenerInformacion(int totalParticipantes) {
        String cadena = "";

        try {
            if (totalParticipantes >= 1 && totalParticipantes <= 5) {
                cadena = "Poca participación en el club, hay que mejorar.";
            } else if (totalParticipantes >= 6 && totalParticipantes <= 15) {
                cadena = "Buena participación, sigan así.";
            } else if (totalParticipantes >= 16) {
                cadena = "Excelente campaña del club.";
            } else {
                cadena = "Mala campaña, debemos mejorar.";
            }
        } catch (Exception e) {
            cadena = "Error al obtener la información: " + e.getMessage();
        }

        return cadena;
    }

    public static String obtenerReporte(String[] actividades, int[] participantesRegistrados) {
        String reporte = "Las actividades ingresadas son:\n";

        try {
            for (int contador = 0; contador < 7; contador++) {
                reporte += (contador + 1) + ". Número de Participantes de "
                        + actividades[contador] + ": " + participantesRegistrados[contador] + "\n";
            }
        } catch (Exception e) {
            reporte = "Error al generar el reporte: " + e.getMessage();
        }

        return reporte;
    }
}
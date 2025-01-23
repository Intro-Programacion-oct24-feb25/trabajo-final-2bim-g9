/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String continual;
        int[] participantes = new int[7];
        String cadena = "";
        do {
            System.out.printf("MENU:\n1.Futbol\n2.Natacion\n3.Atletismo\n"
                    + "4.Baquetbol\n5.Ciclismo\n6.Tenis\7.Yoga");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                //registrarParticipantesFulbol();
            } else {
                if (opcion == 2) {
                    //registrarParticipantesNatacion();
                } else {
                    if (opcion == 3) {
                        //registrarParticipantesAtletismo();
                    } else {
                        if (opcion == 4) {
                            //registrarParticipantesBasquetbol();
                        } else {
                            if (opcion == 5) {
                                //registrarParticipantesCiclismo();
                            } else {
                                if (opcion == 6) {
                                    //registrarParticipantesTenis();
                                } else {
                                    if (opcion == 7) {
                                        //registrarParticipantesYoga();
                                    } else {
                                        System.out.println("Lo sentimos, el "
                                                + "club no tiene esta opcion");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (true);

    }

}

from funciones import (
    registrarParticipanteFutbol,
    registrarParticipanteNatacion,
    registrarParticipanteAtletismo,
    registrarParticipanteBasquetbol,
    registrarParticipanteCiclismo,
    registrarParticipanteTenis,
    registrarParticipanteYoga,
    obtenerInformacion,
    obtenerReporte
)

def main():
    resumenRegistro = ""
    continuar = 'S'
    totalParticipantes = 0
    participantesRegistrados = [0, 0, 0, 0, 0, 0, 0]
    actividades = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]

    while continuar == 'S':
        print("Menú:")
        for i in range(len(actividades)):
            print(f"{i + 1}. {actividades[i]}")

        try:
            opcion = int(input("Ingrese la actividad en la que desea registrar un nuevo participante: "))

            if opcion == 1:
                resumenRegistro += registrarParticipanteFutbol()
                participantesRegistrados[0] += 1
            elif opcion == 2:
                resumenRegistro += registrarParticipanteNatacion()
                participantesRegistrados[1] += 1
            elif opcion == 3:
                resumenRegistro += registrarParticipanteAtletismo()
                participantesRegistrados[2] += 1
            elif opcion == 4:
                resumenRegistro += registrarParticipanteBasquetbol()
                participantesRegistrados[3] += 1
            elif opcion == 5:
                resumenRegistro += registrarParticipanteCiclismo()
                participantesRegistrados[4] += 1
            elif opcion == 6:
                resumenRegistro += registrarParticipanteTenis()
                participantesRegistrados[5] += 1
            elif opcion == 7:
                resumenRegistro += registrarParticipanteYoga()
                participantesRegistrados[6] += 1
            else:
                print("Lo sentimos, el club no tiene esa opción.")

            continuar = input("¿Desea registrar otro participante? (S/N): ").upper()

        except Exception as e:
            print(f"Ha ocurrido un error: {e}")
            continuar = 'S'  # Si ocurre un error, restablecemos para continuar el ciclo

    totalParticipantes = sum(participantesRegistrados)

    info = obtenerInformacion(totalParticipantes)
    print(info)

    reporte = obtenerReporte(actividades, participantesRegistrados)
    print(reporte)

    print("Resumen de los registros: ")
    print(resumenRegistro)

if __name__ == "__main__":
    main()

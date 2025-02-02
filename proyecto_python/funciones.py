def registrarParticipanteFutbol():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        posicion = input("Ingrese la posición preferida: ")
        ciudad = input("Ingrese la ciudad: ")
        equipoFavorito = input("Ingrese el equipo favorito: ")

        cadena = f"Registro - Fútbol:\nNombre: {nombre}\nEdad: {edad}\nPosición preferida: {posicion}\nCiudad: {ciudad}\nEquipo favorito: {equipoFavorito}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Fútbol: {e}")
        return ""


def registrarParticipanteNatacion():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        nivel = input("Ingrese el nivel (principiante, intermedio, avanzado): ")
        ciudad = input("Ingrese la ciudad: ")
        estiloFavorito = input("Ingrese el estilo favorito: ")

        cadena = f"Registro - Natación:\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo favorito: {estiloFavorito}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Natación: {e}")
        return ""


def registrarParticipanteAtletismo():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        especialidad = input("Ingrese la especialidad (carreras, salto, lanzamiento): ")
        ciudad = input("Ingrese la ciudad: ")
        recordPersonal = input("Ingrese el récord personal: ")

        cadena = f"Registro - Atletismo:\nNombre: {nombre}\nEdad: {edad}\nEspecialidad: {especialidad}\nCiudad: {ciudad}\nRécord personal: {recordPersonal}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Atletismo: {e}")
        return ""


def registrarParticipanteBasquetbol():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        posicion = input("Ingrese la posición preferida: ")
        estatura = input("Ingrese la estatura: ")
        ciudad = input("Ingrese la ciudad: ")

        cadena = f"Registro - Básquetbol:\nNombre: {nombre}\nEdad: {edad}\nPosición preferida: {posicion}\nEstatura: {estatura}\nCiudad: {ciudad}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Básquetbol: {e}")
        return ""


def registrarParticipanteCiclismo():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        tipoCiclismo = input("Ingrese el tipo de ciclismo (montaña, ruta, urbano): ")
        ciudad = input("Ingrese la ciudad: ")
        marcaBicicleta = input("Ingrese la marca de bicicleta preferida: ")

        cadena = f"Registro - Ciclismo:\nNombre: {nombre}\nEdad: {edad}\nTipo de ciclismo: {tipoCiclismo}\nCiudad: {ciudad}\nMarca de bicicleta preferida: {marcaBicicleta}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Ciclismo: {e}")
        return ""


def registrarParticipanteTenis():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        nivel = input("Ingrese el nivel (principiante, intermedio, avanzado): ")
        ciudad = input("Ingrese la ciudad: ")
        manoHabil = input("Ingrese la mano hábil (derecha/izquierda): ")

        cadena = f"Registro - Tenis:\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nMano hábil: {manoHabil}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Tenis: {e}")
        return ""


def registrarParticipanteYoga():
    try:
        nombre = input("Ingrese el nombre del participante: ")
        edad = int(input("Ingrese la edad del participante: "))
        nivel = input("Ingrese el nivel (principiante, intermedio, avanzado): ")
        ciudad = input("Ingrese la ciudad: ")
        estiloYoga = input("Ingrese el estilo de yoga preferido: ")

        cadena = f"Registro - Yoga:\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo de yoga preferido: {estiloYoga}\n\n"
        return cadena
    except Exception as e:
        print(f"Error al registrar en Yoga: {e}")
        return ""
def obtenerInformacion(totalParticipantes):
    try:
        if 1 <= totalParticipantes <= 5:
            cadena = "Poca participación en el club, hay que mejorar."
        elif 6 <= totalParticipantes <= 15:
            cadena = "Buena participación, sigan así."
        elif totalParticipantes >= 16:
            cadena = "Excelente campaña del club."
        else:
            cadena = "Mala campaña, debemos mejorar."
    except Exception as e:
        cadena = f"Error al obtener la información: {e}"

    return cadena


def obtenerReporte(actividades, participantesRegistrados):
    try:
        reporte = "Las actividades ingresadas son:\n"
        for contador in range(7):
            reporte += f"{contador + 1}. Número de Participantes de {actividades[contador]}: {participantesRegistrados[contador]}\n"
    except Exception as e:
        reporte = f"Error al generar el reporte: {e}"

    return reporte

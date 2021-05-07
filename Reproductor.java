import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Reproductor{
	public static void main(String[] args) {
		System.out.println("  _ _  _ __ __ __ __ _  _ __ __  _  _ _  _   ");
		System.out.println(" / _) )( (  _) _) _|_  ) )( (  _) _)/  \\(  ( \\/ __) ");
		System.out.println("( (_ ) \\/ () )\\_ \\_ \\ )( ) _ () )\\_ (  O )    ( ( \\ ");
		System.out.println(" \\__|_(_|_(_/()\\)((_|_/\\/\\)_)\\__/ " );

		AnsiConsole.systemInstall();
    	Audio audio = new Audio();
    	int centinela = 0;

    	String [] canciones = ConsoleFile.read ("recursos/letras.csv");
    	String [][] info_canciones = ConsoleData.dataList(canciones);
	
		System.out.println("Ingrese una opcion asi:");
		System.out.println("1. Buscar canción");
		System.out.println("2. Reproducir canción");
		System.out.println("3. Activar Letra");
		System.out.println("4. Detener Canción");
		System.out.println("5. Imprimir lista de Canciones");
		System.out.println("6. Salir");
    	centinela = ConsoleInput.getInt();


			if(centinela == 2)
			{
				//TODO: Controlar que el archivo de la cancion exista
				audio.seleccionarCancion(info_canciones[1][ConsoleData.RUTA_CANCION]);
				audio.reproducir();
			}

			if(centinela == 3)
			{
				//TODO: Ojo, falta validar el valor ingresado
				//TODO: Falta darle formato amigable de lectura al usuario 
				imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
				indice_cancion = ConsoleInput.getInt();

				inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
				fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);
				
				letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);

				imprimir(letra_cancion.toString());
			}

			if(centinela == 4)
			{
				audio.detener();
			}

			if(centinela==5)
			{
				/* La informacion de las canciones esta
				en la matriz info_canciones, acá un ejemplo de como imprimir
				el nombre de la primer canción y su autor */
				
				//TODO: Ojo, falta validar el valor ingresado
				imprimir("Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1));
				indice_cancion = ConsoleInput.getInt();

				inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
				fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);

				System.out.println();
				imprimir("Inicio letra "+inicio_letra);
				imprimir("Fin letra "+fin_letra);
				imprimir("Nombre "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]);
				imprimir("Autor "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
				imprimir("Archivo "+info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);

				imprimir("Primera estrofa: "+canciones[inicio_letra]);
				imprimir("Última estrofa: "+canciones[fin_letra]);
				
				//TODO:Convertir a unicode mayúsculas y caracteres especiales
				//TODO:Explicar como funciona el archivo y como se analiza cada línea
				//TODO:Imprimir la lista completa
			}

	

	}
}
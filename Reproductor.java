import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Reproductor{
	public static void main(String[] args) {
		System.out.println("         ;               ___                   ___         ___  ");            
		System.out.println("         ;;             /\\  \\        ___      /\\__\\       /\\  \\                ");
		System.out.println("         ;';.          /::\\  \\      /\\  \\    /::|  |     /::\\  \\               ");
		System.out.println("         ;  ;;        /:/\\ \\  \\     \\:\\  \\  /:|:|  |    /:/\\:\\  \\           ");
		System.out.println("         ;   ;;      _\\:\\~\\ \\  \\    /::\\__\\/:/|:|  |__ /:/  \\:\\  \\         ");
		System.out.println("         ;    ;;    /\\ \\:\\ \\ \\__\\__/:/\\/__/:/ |:| /\\__/:/__/_\\:\\__\\       ");
		System.out.println("         ;    ;;    \\:\\ \\:\\ \\/__/\\/:/  /  \\/__|:|/:/  \\:\\  /\\ \\/__/       ");
		System.out.println("         ;   ;'      \\:\\ \\:\\__\\ \\::/__/       |:/:/  / \\:\\ \\:\\__\\         ");
		System.out.println("         ;  '         \\:\\/:/  /  \\:\\__\\       |::/  /   \\:\\/:/  /             ");
		System.out.println("    ,;;;,;              \\::/  /    \\/__/       /:/  /     \\::/  /                 ");
		System.out.println("    ;;;;;;  ___         _\\___/__         ___   \\/__/ ___   \\/__/ ;;;;;;;;;;       ");
		System.out.println("    `;;;;' /\\  \\       /\\__\\/\\  \\       /\\__\\       /\\  \\        ;;;;;;;;;;");
		System.out.println("          /::\\  \\     /:/  /::\\  \\     /::|  |     /::\\  \\       ;             ");
		System.out.println("         /:/\\:\\  \\   /:/  /:/\\:\\  \\   /:|:|  |    /:/\\:\\  \\      ;          ");
		System.out.println("        /::\\~\\:\\  \\ /:/  /:/  \\:\\  \\ /:/|:|  |__ /:/  \\:\\  \\     ;         ");
		System.out.println("       /:/\\:\\ \\:\\__/:/__/:/__/ \\:\\__/:/ |:| /\\__/:/__/_\\:\\__\\    ;         ");
		System.out.println("       \\/__\\:\\/:/  \\:\\  \\:\\  \\ /:/  \\/__|:|/:/  \\:\\  /\\ \\/__/    ;      ");
		System.out.println("            \\::/  / \\:\\  \\:\\  /:/  /    |:/:/  / \\:\\ \\:\\__\\ ,;;;;;         ");
		System.out.println("            /:/  /   \\:\\  \\:\\/:/  /     |::/  /   \\:\\/:/  / ;;;;;;             ");
		System.out.println("           /:/  /     \\:\\__\\::/  /      /:/  /     \\::/  /  `;;;;'               ");
		System.out.println("           \\/__/       \\/__/\\/__/       \\/__/       \\/__/                       ");

		AnsiConsole.systemInstall();
    	Audio audio = new Audio();
    	int centinela = 0;
		StringBuilder letra_cancion;
		
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
				centinela = ConsoleInput.getInt();
			}

			if(centinela == 4)
			{
				audio.detener();
				centinela = ConsoleInput.getInt();
			}

	}
}
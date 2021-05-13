import java.util.Scanner;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

    public class Ensayo{
    public static void menu(){
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
        System.out.println("     ¡Bienvenido a SingAlong!");
        System.out.println("       Creditos del 1 al 19");
        
    }
    public static String convertirUnicode(String letra,String cadena){
		
		StringBuilder str = new StringBuilder(cadena);
		int indice = -1;
		char caracter = 0;
		indice = str.lastIndexOf(letra);
		
		if(indice>=0 )
		{
			switch(letra){
				case "á": caracter = '\u00E1';
					      break;
				case "é": caracter = '\u00E9';
					      break;
				case "í": caracter = '\u00ED';
					      break;
		        case "ó": caracter = '\u00F3';
					      break;
			    case "ú": caracter = '\u00FA';
					      break;
				case "ñ": caracter = '\u00F1';
					      break;
			}
			str.replace(indice,indice+1,""+caracter);
		}

		return str.toString();
	}

    public static void imprimir(String cadena)
	{
		String str; 
		str = convertirUnicode("á",str);
		str = convertirUnicode("é",str);
		str = convertirUnicode("í",str);
		str = convertirUnicode("ó",str);
		str = convertirUnicode("ú",str);
		str = convertirUnicode("ñ",str);

		System.out.println(str); 
	}

    public static StringBuilder obtenerLetraCancion(int inicio,int fin, String[]data)
	{
		StringBuilder str = new StringBuilder();

		for(int i = inicio; i<=fin; i++)
		{
			str.append(data[i]+"\n");
		}

		return str;
	}
    public static int numero_canciones(){
        Scanner datos = new Scanner(System.in);
        imprimir("Ingresa el número de créditos que desea para su lista de reproducción: ");
        int numero_canciones_lista = datos.nextInt();
        return numero_canciones_lista;
    }
    public static int peticiondecanciones(){
        Scanner datos = new Scanner(System.in); 
        System.out.println("         Lista de Canciones");     
        System.out.println("          1. Rosas");
        System.out.println("          2. Me gustas tu");
        System.out.println("          3. Rayando el sol");
        System.out.println("          4. A Dios le pido");
        System.out.println("          5. La camisa negra");
        System.out.println("          6. Vivo por ella");
        System.out.println("          7. Maldito duende");
        System.out.println("          8. En algun lugar");
        System.out.println("          9. Como camaron");
        System.out.println("          10. La Gasolina");
        System.out.println("          11. Dame amor");
        System.out.println("          12. Laura");
        System.out.println("          13. Nada valgo sin tu amor");
        System.out.println("          14. Vinotinto");
        System.out.println("          15. Cuando sea grande");
        System.out.println("          16. Cielo");
        System.out.println("          17. La raja de tu falda");
        System.out.println("          18. Viva la vida");
        System.out.println("          19. Lobo lobo hombre en Paris");
        imprimir("Ingrese el numero de la canción que desee escuchar: ");  
        int numero_de_cancion = datos.nextInt();
        return numero_de_cancion;
	}

    public static String preguntar_segun_canciones_que_quiere(){
        String canciones_que_quiere = "";
        menu();
        int numero_canciones_lista = numero_canciones();
        for(int i=0;i<numero_canciones_lista;i++){
            int numero_de_cancion = peticiondecanciones();
            switch (numero_de_cancion) {

                case 1:
                    canciones_que_quiere = canciones_que_quiere.concat("0 ");
                    break;
                case 2:
                    canciones_que_quiere = canciones_que_quiere.concat("1 ");
                    break;
                case 3:
                    canciones_que_quiere = canciones_que_quiere.concat("2 ");
                    break;
                case 4:
                    canciones_que_quiere = canciones_que_quiere.concat("3 ");
                    break;
                case 5:
                    canciones_que_quiere = canciones_que_quiere.concat("4 ");
                    break;
                case 6:
                    canciones_que_quiere = canciones_que_quiere.concat("5 ");
                    break;
                case 7:
                    canciones_que_quiere = canciones_que_quiere.concat("6 ");
                    break;
                case 8:
                    canciones_que_quiere = canciones_que_quiere.concat("7 ");
                    break;
                case 9:
                    canciones_que_quiere = canciones_que_quiere.concat("8 ");
                    break;
                case 10:
                    canciones_que_quiere = canciones_que_quiere.concat("9 ");
                    break;
                case 11:
                    canciones_que_quiere = canciones_que_quiere.concat("10 ");
                    break;
                case 12:
                    canciones_que_quiere = canciones_que_quiere.concat("11 ");
                    break;
                case 13:
                    canciones_que_quiere = canciones_que_quiere.concat("12 ");
                    break;
                case 14:
                    canciones_que_quiere = canciones_que_quiere.concat("13 ");
                    break;
                case 15:
                    canciones_que_quiere = canciones_que_quiere.concat("14 ");
                    break;
                case 16:
                    canciones_que_quiere = canciones_que_quiere.concat("15 ");
                    break;
                case 17:
                    canciones_que_quiere = canciones_que_quiere.concat("16 ");
                    break;
                case 18:
                    canciones_que_quiere = canciones_que_quiere.concat("17 ");
                    break;
                case 19:
                    canciones_que_quiere = canciones_que_quiere.concat("18 ");
                    break;
                
               default:
                    System.out.println("Esta cancion no existe");
                    i--;
                    break;
            }
        }
        return canciones_que_quiere;
    }

    public static String[] lista_canciones(){
        String lista = preguntar_segun_canciones_que_quiere();
        String[] lista_de_canciones = lista.split(" ",0);
        return lista_de_canciones;
    }

    public static void randomizar(String[] lista){
        int numero_de_elementos = lista.length;
        for(int i=0;i<numero_de_elementos;++i){
            int numero_random = i+(int)(Math.random() * (numero_de_elementos-i));
            String temporal = lista[numero_random];
            lista[numero_random] = lista[i];
            lista[i] = temporal;
        }
    }

    public static String[] preguntar_con_randomizacion(){
        String[] lista=lista_canciones();
        Scanner datos = new Scanner(System.in);
        System.out.print("Desea el modo shuffle(si/no): ");
        String respuesta = datos.nextLine();
        respuesta = respuesta.toLowerCase();
        if(respuesta.equals("si")){
            randomizar(lista);
        }
        return lista;

    }

    public static int[] convertir_lista_a_int(String[] lista){
        int[] listaint = new int[lista.length];
        for(int i=0;i<lista.length;i++){
            listaint[i] = Integer.parseInt(lista[i]);
        }
        return listaint;
    }

    public static void audiolist(){
        String [] canciones;
        int inicio_letra = 0, fin_letra = 0;
        canciones = ConsoleFile.readBigFile("recursos/letras.csv");
        String [][] info_canciones;
        StringBuilder letra_cancion;
        info_canciones = ConsoleData.dataList(canciones);
        String[] lista= preguntar_con_randomizacion();
        int[] listaint = convertir_lista_a_int(lista);
        Audio audio = new Audio();
        try {
            for(int i=0;i<listaint.length;i++){
                audio.seleccionarCancion(info_canciones[listaint[i]][ConsoleData.RUTA_CANCION]);
                audio.reproducir();
                if(i<listaint.length-1){
                    imprimir("Al terminarse esta canción, tu siguiente canción se reproducirá en unos segundos");
                }
                Scanner datos = new Scanner(System.in);
                System.out.print("desea ver la letra de la canción(si/no): ");
                String respuesta = datos.nextLine();
                respuesta = respuesta.toLowerCase();
                if(respuesta.equals("si")){
                    inicio_letra = ConsoleInput.stringToInt(info_canciones[listaint[i]][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[listaint[i]][ConsoleData.FIN_CANCION]);
					
					letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);

					imprimir(letra_cancion.toString());

                }

                Thread.sleep(1000*290);
                audio.detener();
        }}
        catch (Exception e) {
        imprimir("este ha sido el error de ejecución del programa: "+e);
    }
    }


    public static void main(String[] args){
        audiolist();
        
    }
}
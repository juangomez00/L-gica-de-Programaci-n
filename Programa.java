import java.util.Scanner;

public class Programa{
    public static void menu() {
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
        System.out.println("                                 ¡Bienvenido a SingAlong!");
        System.out.println("                             Una rocola de tan solo un crédito");
        
 }

    public static String convertirUnicode(String letra,String cadena){
        
        StringBuilder str = new StringBuilder(cadena);
        int indice = -1;
        char caracter = 0;
        indice = str.lastIndexOf(letra);
        
        if(indice>=0 )
        {
            switch(letra)
            {
                //case "a tildada mayuscula": caracter = '\u00C1';  Este case no nos funciona en nuestro ordenador.
                          //break;
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
            str.replace(indice,indice+2,""+caracter);
        }
        return str.toString();
    }

    public static void imprimir(String cadena)
    {
        String str; 
        //str = convertirUnicode("a tiltada mayuscula",cadena); No nos funciona en nuestro ordenador.
        str = convertirUnicode("á",cadena);
        str = convertirUnicode("é",str);
        str = convertirUnicode("í",str);
        str = convertirUnicode("ó",str);
        str = convertirUnicode("ú",str);
        str = convertirUnicode("ñ",str);

        System.out.println(str);
    }
    public static StringBuilder letraCancion(int inicio,int fin, String[]data)
    {
        StringBuilder str = new StringBuilder();  //Construye un StringBuilder vacío y con una capacidad por defecto de 16 carácteres.
        for(int i = inicio; i<=fin; i++)
        {
            str.append(data[i]+"\n"); //Append:agrega los caracteres al final de builder.
        }
        return str;
    }

    public static int creditos()
    {
        Scanner datos = new Scanner(System.in);
        imprimir("Ingresa el número 1 de créditos para empezar con tu lista de reproducción: ");
        int creditos_lista = datos.nextInt();
        return creditos_lista;
    }
    public static int peticion(){
        Scanner datos = new Scanner(System.in); 
        System.out.println(" ___|)________________________________________________________ ");
        System.out.println("|___/____________________________|___________________________||   Lista de Canciones ");
        System.out.println("|__/|_______/|____/|_____/|______|___________________________||    1. Rosas ");
        System.out.println("|_/(|,\\____/_|___/_|____/_|______|___________________________||    2. Me gustas tu ");
        System.out.println("|_\\_|_/___|__|__|__|___|__|___|__|___________________________||    3. Rayando el sol ");
        System.out.println("|   |     | ()  | ()   | ()   |  |                           ||    4. A Dios le pido ");
        System.out.println("| (_|   -()-  -()-   -()-   -()- | -()-  -()-  -()-   -()-   ||    5. La camisa negra ");
        System.out.println("|________________________________|__|__()_|__()_|__()__|_____||    6. Vivo por ella ");
        System.out.println("|__/___\\_________________________|__|__|__|__|__|__|___|_____||    7. Maldito duende ");
        System.out.println("|__\\___|_________________________|___\\_|___\\_|___\\_|___|_____||    8. En algun lugar ");
        System.out.println("|_____/__________________________|____\\|____\\|____\\|_________||    9. Como camaron ");
        System.out.println("|____/___________________________|___________________________||   10. La Gasolina ");
        System.out.println("           _______       __                                       11. Dame amor ");
        System.out.println("         /   ------.   / ._`_                                     12. Laura ");
        System.out.println("        |  /         ~--~    \\                                    13. Nada valgo sin tu amor ");
        System.out.println("        | |             __    `.____________________ _^-----^     14. Vinotinto ");
        System.out.println("        | |  I=|=======/--\\=========================| o o o |     15. Cuando sea grande ");
        System.out.println("        \\ |  I=|=======\\__/=========================|_o_o_o_|     16. Cielo ");
        System.out.println("         \\|                   /                       ~    ~      17. La raja de tu falda ");
        System.out.println("           \\       .---.    .                                     18. Hijo de la luna ");
        System.out.println("             -----'     ~~''                                      19. Musica Ligera ");
        System.out.println("                                                                  20. Oye mi amor ");
        System.out.println(" ");
        imprimir("                Ingrese el numero de la canción que desee escuchar: ");  
        int numero = datos.nextInt();
        return numero;
    } 
    public static String Canciones(){
        String cancion = "";
        menu();
        int creditos_lista = creditos();
        for(int i=0;i<creditos_lista;i++){
            int numero = peticion();
            switch (numero)    //switch es una instrucción de múltiples vías para concatenar cada canción con la opción del número.
            {
                case 1:
                    cancion = cancion.concat("0 ");
                    break;
                case 2:
                    cancion = cancion.concat("1 ");
                    break;
                case 3:
                    cancion = cancion.concat("2 ");
                    break;
                case 4:
                    cancion = cancion.concat("3 ");
                    break;
                case 5:
                    cancion = cancion.concat("4 ");
                    break;
                case 6:
                    cancion = cancion.concat("5 ");
                    break;
                case 7:
                    cancion = cancion.concat("6 ");
                    break;
                case 8:
                    cancion = cancion.concat("7 ");
                    break;
                case 9:
                    cancion = cancion.concat("8 ");
                    break;
                case 10:
                    cancion = cancion.concat("9 ");
                    break;
                case 11:
                    cancion = cancion.concat("10 ");
                    break;
                case 12:
                    cancion = cancion.concat("11 ");
                    break;
                case 13:
                    cancion = cancion.concat("12 ");
                    break;
                case 14:
                    cancion = cancion.concat("13 ");
                    break;
                case 15:
                    cancion = cancion.concat("14 ");
                    break;
                case 16:
                    cancion = cancion.concat("15 ");
                    break;
                case 17:
                    cancion = cancion.concat("16 ");
                    break;
                case 18:
                    cancion = cancion.concat("17 ");
                    break;
                case 19:
                    cancion = cancion.concat("18 ");
                    break;
               case 20:
                    cancion = cancion.concat("19 ");
                    break;
                case 21:
                    cancion = cancion.concat("20 ");
                    break;
                default:
                    System.out.println("Esta cancion no existe");
                    i--;
                    break;
            }
        }
        return cancion;
    }
    public static String[] repertorio(){         
        String lista = Canciones();        //Declarar e inicializar el repertorio de las canciones.
        String[] listacanciones = lista.split(" ",0);
        return listacanciones;
    }

    public static void randomizar(String[] lista){
        int numerodecanciones = lista.length;
        for(int i=0;i<numerodecanciones;++i){
            int numero_random = i+(int)(Math.random() * (numerodecanciones-i));  //Establecer la lista de las canciones con la ayuda del math.random.
            String temporal = lista[numero_random];
            lista[numero_random] = lista[i];
            lista[i] = temporal;
        }
    }
    public static String[] randomizacion(){
        String[] lista=repertorio();
        return lista;
    } 

    public static int[] listaint(String[] lista){        //Convertir la lista a un tipo de dato int.
        int[] listaint = new int[lista.length];
        for(int i=0;i<lista.length;i++){
            listaint[i] = Integer.parseInt(lista[i]);   // La función parseInt comprueba la una cadena e intenta devolver un entero de la base especificada.
        }
        return listaint;
    }

    public static void SingAlong()
    {
        String [] canciones;
        int inicioletra = 0, finletra = 0;
        canciones = ConsoleFile.readBigFile("recursos/letras.csv");  //Para leer la ruta de las letras de las canciones.
        String [][] datocancion;
        StringBuilder letracancion;   //Sirve para almacenar cadenas de caracteres.
        datocancion = ConsoleData.dataList(canciones);
        String[] lista= randomizacion();
        int[] listaint = listaint(lista);
        Audio audio = new Audio();
        int centinela = 0;

        try {
            for(int i=0;i<listaint.length;i++)
            {
                audio.seleccionarCancion(datocancion[listaint[i]][ConsoleData.RUTA_CANCION]);
                audio.reproducir();

                Scanner datos = new Scanner(System.in);
                System.out.print("Deseas ver la letra de la cancion(si o no): ");
                String respuesta = datos.nextLine();
                respuesta = respuesta.toLowerCase();
                if(respuesta.equals("si")){
                    inicioletra = ConsoleInput.stringToInt(datocancion[listaint[i]][ConsoleData.INICIO_CANCION]);
                    finletra = ConsoleInput.stringToInt(datocancion[listaint[i]][ConsoleData.FIN_CANCION]);
                    letracancion = letraCancion(inicioletra,finletra,canciones);
                    imprimir(letracancion.toString());}
                    System.out.println("Digita 1 para detener la cancion");
                    centinela = ConsoleInput.getInt();
                
                if(centinela==1)
                {
                 audio.detener(); 
                //Thread.sleep(5000);     //Detiene la canción pasados dos minutos de reproducción.
                audio.detener();
                System.out.println("                .            .--.  ");
                System.out.println("     Tu         \\\\          //\\\\ \\  ");
                System.out.println("reproduccion    .\\\\        ///_\\\\\\\\ ");
                System.out.println(" fue exitosa.   :/>`      /(| `|'\\\\\\ ");
                System.out.println(" Esperamos       Y/\\      )))\\_-_/((\\  ");
                System.out.println(" que hayas        \\ \\    ./'_/   \\_`\\)  ");
                System.out.println(" disfrutado        \\ \\.- ._ \\   /   \\  ");
                System.out.println("de la cancion       \\ _.-  (_ \\Y/ _) | ");
                System.out.println("que escogiste.              )  |   /|| ");
                System.out.println("                         .-'  .'  / || ");
                System.out.println("                        /    `   /  || ");
                System.out.println("Vuelve pronto!         |    __  |   ||_ ");
                System.out.println("                       |   / \\   \\ '|\\` ");
                System.out.println("                       |  |   \\   \\     ");
                System.out.println("                       |  |    `.  \\   ");
                System.out.println("                       |  |      \\  \\  ");
                System.out.println("                       |  |       \\  \\ "); 
                System.out.println("                       /__\\        |__\\ ");
                System.out.println("                       /.|          |.\\_ "); 
                System.out.println("                      `-''          ``-- "); 
                 

                }

            }
        
    }
        catch (Exception e) {            // Flujo de excepciones que solo entra cuando hay un error de ejecución del programa.
        imprimir("Error de ejecución del programa: "+e);
        }
    }
    public static void main(String[] args){
        SingAlong();
        
    }
}
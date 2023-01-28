package pruebaprogramacion;

/**
 *      Funciones y parametros tipo String
 *      cadenas de texto.
 * 
 *      Funcion, son agrupaciones de sentencias que van a poder ser
 *      utilizadas desde cualquier punto de la aplicacion.
 */

 /**
 *  Modificador	La misma clase	Mismo paquete	Subclase	Otro paquete
 *  private	    Sí	            No	            No	        No
 *  default	    Sí	            Sí	            No	        No
 *  protected	Sí	            Sí	            Sí/No	    No
 *  public	    Sí	            Sí	            Sí	        Sí
*/

public class EquipoCs {
 
/**
 *  1.  Nombre del Equipo eSport.
 *  2.  Nombre de jugadores.
 *  3.  Website Link (Opcional text).
 *  4.  Sponsord (Opcional text).
 */

    public static void main(String[] args) {
    // 1. Crea funcion "Equipo"
         teamCounterStrike();

    // 2. Funcion return(devuelve porque es String) Jugadores
         String players = tagNames();
         System.out.println(players);

    // 3. Crea funcion "Website"
         webSiteLink();

    // 4. Crea funcion concatenar Sponsord
        sponsord("EVGA LatinoAmerica & Razer");
    }

/**
 *      Estructura de un metodo o funcion:
 *      Metodos cuando hablamos de objetos y programacion orientada a objetos.
 *      Funciones cuando NO estemos hablando de un objeto o su comportamiento.
 */

    // 4. Concatenar Texto String name
    private static void sponsord(String name){
        System.out.println("Sponsored by: " + name);
    }

    // 3. Metodo tipo funcion (el nombre debe coincidir con el identificador)
    private static void webSiteLink() {
            System.out.println("www.SickGamers.com.ar");
    }

    // 2. Devuelve un tipo de dato en cadena de texto.
    // 2.1 void no devuelve return, String devuelve texto, int un numero entero, double un numero decimal.
    private static String tagNames() {
             return " jSk \n danhiz \n Rusty \n kazz \n thomz";
    }

    // 1. Llamo a la funcion teamCounterStrike e imprimo el mensaje.
    private static void teamCounterStrike() {
            System.out.println("---------------------------------\nSickGamers - eSports Organitation\n---------------------------------");
    }
}

package com.javabasic.tiposdatos;

/**
 * 
 *      Tipo de datos mas comunes:
 *      int, long, double, boolean, String
 * 
 */

 /**
  * --------------------
  * Palabras reservadas:
  *---------------------
abstract	continue	for	        new	        switch
assert***	default	    goto*	    package	    synchronized
boolean	    do	        if	        private	    this
break	    double	    implements	protected	throw
byte	    else	    import	    public	    throws
case	    enum****	instanceof	return	    transient
catch	    extends	    int	        short	    try
char	    final	    interface	static	    void
class	    finally	    long	    strictfp**	volatile
const*	    float	    native	    super	    while
  */

public class Tipos {
    public static void main(String[] args) {

/**
*      tipo identificador = 30;
*      tipo identificador;
*      identificador = 30;
*/
        
        // 1. Numeros
        // 1.1 Enteros
        byte variable1 = 5; // 1 byte
        short variable2 = 10; // 2 byte
        int variable3 = 30; // 4 byte
        long variable4 = 100; // 8 byte

        // 1.2 Decimales (puntos flotantes)
        float decimal1 = 5.5f;
        double decimal2 = 10.5d;

        // 2. Booleano
        boolean falso = false;
        boolean verdadero = true;

        // 3. Caracter
        char caracter1 = 'a';

        // 4. Cadena de texto (tipo primitivo)
        String nombre = "Texto";
        String apellido = "Texto2";

        // 5. Tipos envoltorio (base de datos)
        Integer numero1 = null;
        Long numero2 = 2L;

    }
}
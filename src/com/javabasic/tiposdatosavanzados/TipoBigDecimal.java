package com.javabasic.tiposdatosavanzados;

import java.math.BigDecimal;

/**
 * 
 *      Cuando usar BigDecimal? cuando se trabaje con resultados financieros.
 * 
 *      Cuando se opera con una variable BigDecimal utilizar los metodos
 *      apropiados para manipularla.
 */

public class TipoBigDecimal {
    public static void main(String[] args) {
        
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        // Suma del BigDecimal "valorB" a "valorA".
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());
    }
}

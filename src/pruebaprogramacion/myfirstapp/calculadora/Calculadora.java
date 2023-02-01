package pruebaprogramacion.myfirstapp.calculadora;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Primer NUMERO: ");
        double num1 = input.nextDouble();
        
        System.out.print("Segundo NUMERO: ");
        double num2 = input.nextDouble();
        
        System.out.print("Selecciona el OPERADOR (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        double result;
        
        switch(operator) {
          case '+':
            result = num1 + num2;
            break;
          case '-':
            result = num1 - num2;
            break;
          case '*':
            result = num1 * num2;
            break;
          case '/':
            result = num1 / num2;
            break;
          default:
            System.out.println("UPS! OPERADOR INVALIDO!");
            return;
        }
        
        System.out.println("Resultado: " + result);
    }
  }
}

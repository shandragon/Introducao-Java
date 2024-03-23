package roteiro3.parte2;

import java.util.Scanner;

/**
 * Este programa simula uma calculadora com operações básicas de soma, subtração, multiplicação e divisão.
 * 
 */
public class Programa13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        double x = entrada.nextDouble();

        System.out.println("Informe a operação (+, -, *, /): ");
        String operacao = entrada.next();

        System.out.println("Informe o valor de y: ");
        double y = entrada.nextDouble();

        switch (operacao) {
            case "+":
                Programa13.soma(x, y);
                break;
            case "-":
                Programa13.subtracao(x, y);
                break;
            case "*":
                Programa13.multiplicacao(x, y);
                break;
            case "/":
                Programa13.divisao(x, y);
                break;
            default:
                System.out.println("Operação invalida!");
                break;
        }

        entrada.close();
    }

    public static void soma(double x, double y) {
        System.out.println("Resultado: " + (x + y));
    }

    public static void subtracao(double x, double y) {
        System.out.println("Resultado: " + (x - y));
    }

    public static void multiplicacao(double x, double y) {
        System.out.println("Resultado: " + (x * y));
    }

    public static void divisao(double x, double y) {
        System.out.println("Resultado: " + (x / y));
    }
}

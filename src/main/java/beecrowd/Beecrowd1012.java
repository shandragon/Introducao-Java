package beecrowd;

import java.util.Scanner;

/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.

 * Entrada
    O arquivo de entrada contém três valores com um dígito após o ponto decimal.

 * Saída
    O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */
public class Beecrowd1012 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        double pi = 3.14159;
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        
        // Realizando os calculos das areas
        // Area do triângulo: A=(b*h)/2
        double triangulo = (A*C)/2;

        // Area do círculo: A=pi*R^2
        double circulo = pi*C*C;

        // Area do trapézio: A=(a+b)h/2
        double trapezio = (A + B)*C/2;

        // Area do quadrado: A=L^2
        double quadrado = B*B;

        // Area do retângulo: A=b*h
        double retangulo = A * B;

        System.out.println("TRIANGULO: " + String.format( "%.3f", triangulo));
        System.out.println("CIRCULO: " + String.format( "%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format( "%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format( "%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format( "%.3f", retangulo));

        entrada.close();
    }
}

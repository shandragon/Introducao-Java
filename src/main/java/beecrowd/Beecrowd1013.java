package beecrowd;

import java.util.Scanner;

/**
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
 * Utilize a fórmula: maior = (a + b + abs(a - b))/2
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

 * Entrada
    O arquivo de entrada contém três valores inteiros.

 * Saída
    Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */
public class Beecrowd1013 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();

        // Usando a formula do maior valor
        int maior = (A + B + Math.abs(A - B))/2;
        
        if (C > maior) {
            maior = C;
        }

        System.out.println(maior + " eh o maior");

        entrada.close();
    }
}

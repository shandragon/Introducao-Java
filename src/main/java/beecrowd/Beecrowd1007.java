package beecrowd;

import java.util.Scanner;

/**
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

 * Entrada
    O arquivo de entrada contém 4 valores inteiros.

 * Saída
    Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 *
 */
public class Beecrowd1007 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        // Realizando o calculo da diferença
        int diferenca = (A * B) - (C * D);

        // Apresentando a saída solicitada
        System.out.println("DIFERENCA = " + diferenca);

        entrada.close();
    }
}

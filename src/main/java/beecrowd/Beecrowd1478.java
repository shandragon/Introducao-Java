package beecrowd;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

 * Entrada
    A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

 * Saída
    Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados por espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.
 *
 */
public class Beecrowd1478 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Criando variável de entrada N
        int N = -1; 
        
        while (N != 0) {
            // Coletando o valor de N
            N = entrada.nextInt();

            if (N > 0 && N <= 100) {
                for (int i = 1; i <= N; i++) {
                    int aux = i;
                    String strLinha = "";
                    for (int j = 1; j <= N; j++) {
                        // Se coluna for igual linha o valor de aux é 1
                        if (i == j){
                            aux = 1;
                        }
                        
                        strLinha += String.format("%3d", aux);
                        if (j < N) {
                            strLinha += " ";
                        }

                        /*
                         * Se a coluna for maior que a linha
                         * é realizado o incremento em aux
                         * caso contrario é realizado um decremento
                         */
                        if (j >= i) {
                            aux++;
                        } else {
                            aux--;
                        }
                    }
                    System.out.println(strLinha);
                }
                System.out.println();
            }
        }

        entrada.close();
    }
}

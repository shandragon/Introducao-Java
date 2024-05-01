package beecrowd;

import java.util.Scanner;

/**
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

 * Entrada
    O arquivo de entrada contém 1 valor inteiro qualquer.

 * Saída
    Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 *
 */
public class Beecrowd1067 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        int X = entrada.nextInt();

        // Iniciando o laço de repetição
        for (int i = 1; i <= X; i++) {
            // Verificando se o número não é par
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}

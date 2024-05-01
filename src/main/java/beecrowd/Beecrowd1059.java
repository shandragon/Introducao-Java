package beecrowd;

/**
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.

 * Entrada
    Neste problema extremamente simples de repetição não há entrada.

 * Saída
    Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 */
public class Beecrowd1059 {
    public static void main(String[] args) {

        // Criando a estrutura de repetição para contar de 1 até 100
        for (int i = 1; i <= 100; i++) {
            // Verificando se o número é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

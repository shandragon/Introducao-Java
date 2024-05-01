package beecrowd;

/**
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

 * Entrada
    Não há nenhuma entrada neste problema.

 * Saída
    Imprima a sequencia conforme exemplo abaixo:
    I=1 J=60
    I=4 J=55
    I=7 J=50
    ...
    I=? J=0
 */
public class Beecrowd1095 {
    public static void main(String[] args) {
        // Iniciando as variaveis I e J
        int j = 60;
        int i = 1;

        // Iniciando o laço de repetição
        while (j >= 0) {
            System.out.println("I=" + i + " J=" + j);

            // Realizando o decremento e incremento
            j -= 5;
            i += 3;
        }
    }
}

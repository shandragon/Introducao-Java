package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Informe um número:");
            int numero = entrada.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if ( numero > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("O número secreto é maior.");
            }
        }

        entrada.close();
    }
}
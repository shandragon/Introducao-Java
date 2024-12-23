package roteiros.roteiro02.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = 0;
        while (nota != -1) {
            System.out.println("Informe uma nota ou -1 para encerrar");
            nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else if (nota >= 0) {
                System.out.println("Reprovado");
            }
        }
        System.out.println("Programa encerrado.");

        entrada.close();
    }
}

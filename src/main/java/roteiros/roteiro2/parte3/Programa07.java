package roteiros.roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = 0;
        double media = 0;
        int cont = 0;
        while (nota != -1) {
            System.out.println("Informe uma nota ou -1 para encerrar");
            nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado");
                media += nota;
                cont++;
            } else if (nota >= 0) {
                System.out.println("Reprovado");
                media += nota;
                cont++;
            }
        }
        media /= cont;
        System.out.println("Media final: " + media);
        System.out.println("Programa encerrado.");

        entrada.close();
    }
}

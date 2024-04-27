package beecrowd;

import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

 * Entrada
    O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

 * Saída
    Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 *
 */
public class Beecrowd1006 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        // Validando os limites das notas
        if ((A >= 0 && A <= 10) && (B >= 0 && B <= 10)  && (C >= 0 && C <= 10)) {
            // Realizando o calculo da média
            double media = ((A*2) + (B*3) + (C*5)) / 10;

            // Apresentando a saída solicitada
            System.out.println("MEDIA = " + String.format( "%.1f", media ));
        }

        entrada.close();
    }
}

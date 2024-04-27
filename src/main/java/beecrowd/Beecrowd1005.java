package beecrowd;

import java.util.Scanner;

/**
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

 * Entrada
    O arquivo de entrada contém 2 valores com uma casa decimal cada um.

 * Saída
    Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class Beecrowd1005 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();

        // Validando os limites das notas
        if ((notaA >= 0 && notaA <= 10) && (notaB >= 0 && notaB <= 10) ) {
            // Realizando o calculo da média
            double media = ((notaA*3.5) + (notaB*7.5)) / 11;

            // Apresentando a saída solicitada
            System.out.println("MEDIA = " + String.format( "%.5f", media ));
        }

        entrada.close();
    }
}

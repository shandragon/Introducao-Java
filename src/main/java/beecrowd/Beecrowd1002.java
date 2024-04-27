package beecrowd;

import java.util.Scanner;

/**
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
   - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
   Saída deve ser "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
 */
public class Beecrowd1002 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        double pi = 3.14159;

        // Coletando os valores
        double raio = entrada.nextDouble();

        // Realizando o cálculo da área
        double area = pi*raio*raio;

        // Apresentando a saída solicitada
        System.out.println("A=" + String.format( "%.4f", area ));

        entrada.close();
    }
}

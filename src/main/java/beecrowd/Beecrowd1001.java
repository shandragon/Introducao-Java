package beecrowd;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 * Efetue a soma de A e B atribuindo o seu resultado na variável X.
 * Imprima X conforme exemplo: "X = " (letra X maiúscula) 
 * Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class Beecrowd1001 {
    public static void main(String[] args) {
        // Iniciando nosso leitor de teclado
        Scanner entrada = new Scanner(System.in);

        // Coletando os valores
        int A = entrada.nextInt();
        int B = entrada.nextInt();

        // Realizando a operação
        int X = A + B;

        // Apresentando a saída solicitada
        System.out.println("X = " + X);

        entrada.close();
    }
}

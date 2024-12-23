package roteiros.roteiro03.parte1;

import java.util.Scanner;

public class Programa10 {

    /**
     * Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber.
     * Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário -base
     *  e paga imposto de 7% também sobre o salário-base.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioReceber;

        System.out.println("Informe o Salário Base: ");
        salarioBase = entrada.nextDouble();

        gratificacao = salarioBase * 5/100;
        imposto = salarioBase * 7/100;
        salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("Salário a receber: " + salarioReceber);

        entrada.close();
    }
}

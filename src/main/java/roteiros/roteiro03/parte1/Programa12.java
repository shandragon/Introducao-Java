package roteiros.roteiro03.parte1;

import java.util.Scanner;

public class Programa12 {

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

        gratificacao = Programa12.calcularModificador(salarioBase, 5);
        imposto = Programa12.calcularModificador(salarioBase, 7);
        salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("Salário a receber: " + salarioReceber);

        entrada.close();
    }

    public static double calcularModificador(double salario, double percentual) {
        return salario * percentual/100;
    }
}

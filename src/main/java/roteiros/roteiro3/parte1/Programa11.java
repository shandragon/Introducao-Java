package roteiros.roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {

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

        gratificacao = Programa11.calcularGratificacao(salarioBase);
        imposto = Programa11.calcularImposto(salarioBase);
        salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("Salário a receber: " + salarioReceber);

        entrada.close();
    }

    public static double calcularGratificacao(double salario) {
        return salario * 5/100;
    }

    public static double calcularImposto(double salario) {
        return salario * 7/100;
    }
}

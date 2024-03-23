package roteiro1.parte2;

public class Exercicio01 {

    /**
     * Escreva um programa em Java para calcular o salário total de um funcionário.
     * O programa deve conter o valor do salário-base mensal que compreende um total de 160 horas.
     * O programa também deve conter o número de horas extra trabalhadas no mês.
     * Em seguida, calcule o salário total considerando que cada hora extra trabalhada vale o mesmo que uma hora regular.
     * Por fim, exiba o salário total na tela. 
     *
     */
    public static void main(String[] args) {
        // Definindo as variáveis bases
        double salarioBase = 2500;
        int totalHoraMes = 160;
        int numHorasExtra = 10;

        // Calculando o valor da hora
        double valorHora = salarioBase/totalHoraMes;

        // Calculando o valor total da hora extra
        double salarioExtra = valorHora / numHorasExtra;

        salarioBase += salarioExtra;

        System.out.println("Salario base: " + salarioBase);
    }
}
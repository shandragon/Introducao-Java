package roteiro1.parte2;

public class Exercicio01 {

    public static void main(String[] args) {
        double salarioBase = 2500;
        int numHorasExtra = 10;

        double salarioExtra = salarioBase / numHorasExtra;

        salarioBase += salarioExtra;

        System.out.println("Salario base: " + salarioBase);
    }
}
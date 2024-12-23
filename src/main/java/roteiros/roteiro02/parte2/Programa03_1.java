package roteiros.roteiro02.parte2;

import javax.swing.JOptionPane;

public class Programa03_1 {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome");

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        System.out.println("Nome informado: " + nome);

        String strIdade = JOptionPane.showInputDialog("Informe seu nome");
        int idade = Integer.parseInt(strIdade);
        System.out.println("Idade informado: " + idade);
    }
}

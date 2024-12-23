package roteiros.roteiro02.parte2;

import javax.swing.JOptionPane;

public class Programa03_2 {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome");

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);

        String strIdade = JOptionPane.showInputDialog("Informe seu nome");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null, "Idade informado: " + idade);
    }
}

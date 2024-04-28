package roteiros.roteiro10.parte1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela02 extends JFrame {

    private int largura;
    private int altura;
    private JButton btn01;
    private JButton btn02;

    public Janela02() {
        this.largura = 300;
        this.altura = 300;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.largura, this.altura);
        this.setTitle("Janela02");

        this.setLayout(null);

        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");

        // Informando as dimensões dos buttons
        btn01.setBounds(20, 50, 100, 40);
        btn02.setBounds(130, 50, 100, 40);

        // Adicionando os buttons a janela
        this.add(btn01);
        this.add(btn02);

        this.setVisible(true);
    }
}

package roteiros.roteiro10.parte1;

import javax.swing.JFrame;

public class Janela01 extends JFrame {
    
    private int largura;
    private int altura;

    public Janela01() {
        this.largura = 600;
        this.altura = 500;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.largura, this.altura);
        this.setVisible(true);
        this.setTitle("Janela01");
    }
}

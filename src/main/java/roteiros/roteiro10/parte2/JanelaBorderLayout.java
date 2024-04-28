package roteiros.roteiro10.parte2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBorderLayout extends JFrame {

    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;

    public JanelaBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());

        this.iniciarComponentes();

        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");

        this.add(btn01, BorderLayout.PAGE_START);
        this.add(btn02, BorderLayout.PAGE_END);
        this.add(btn03, BorderLayout.LINE_START);
        this.add(btn04, BorderLayout.LINE_END);
        this.add(btn05, BorderLayout.CENTER);
    }
}

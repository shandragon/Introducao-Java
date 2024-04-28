package roteiros.roteiro10.parte4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaSemLayout extends JFrame implements ActionListener {

    private int largura;
    private int altura;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        this.altura = 500;
        this.largura = 500;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.largura, this.altura);
        this.setTitle("Janela Sem Layout");

        this.setLayout(null);

        this.iniciarComponentes();

        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

        btn01.setBounds(20, 50, 100, 30);
        btn02.setBounds(130, 50, 100, 30);
        btn03.setBounds(30, 90, 100, 30);
        btn04.setBounds(140, 90, 100, 30);
        btn05.setBounds(40, 130, 100, 30);
        btn06.setBounds(150, 130, 100, 30);

        btn01.addActionListener(this);
        btn02.addActionListener(this);

        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object objeto = event.getSource();
        JButton button = (JButton) objeto;
        String nome = button.getText();

        System.out.println("O botão " + nome + " foi acionado por " + objeto.getClass());
    }
}

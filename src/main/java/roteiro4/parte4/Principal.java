package roteiro4.parte4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a matricula:");
            int matricula = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite o nome:");
            String nome = entrada.nextLine();
            System.out.println("Digite o curso:");
            String curso = entrada.nextLine();
            System.out.println("Digite o ano de ingresso:");
            int anoIngresso = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite a quantidade de disciplina:");
            int qtdeDisciplinas = Integer.parseInt(entrada.nextLine());

            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);

            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
            System.out.println("Quantidade de Disciplina: " + aluno.getQtdeDisciplinas());
            System.out.println("Situação: " + aluno.getSituacao());
            System.out.println();
        }

        entrada.close();
    }
}

package roteiros.roteiro07.parte1_1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criando meu vetor
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
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

            // Criando e armazenando os alunos no vetor
            alunos[i] = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);
        }

        //Imprimindo os dados criados
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Matricula: " + alunos[i].getMatricula());
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Curso: " + alunos[i].getCurso());
            System.out.println("Ano de Ingresso: " + alunos[i].getAnoIngresso());
            System.out.println("Quantidade de Disciplina: " + alunos[i].getQtdeDisciplinas());
            System.out.println("Situação: " + alunos[i].getSituacao());
            System.out.println();
        }

        entrada.close();
    }
}

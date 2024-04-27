package roteiros.roteiro7.parte2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando meu vetor
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();;

        // Criando os alunos para armazenar no vetor
        Aluno aluno1 = new Aluno(111, "Adailton", "Sistema de Informação", 2006, 5);
        Aluno aluno2 = new Aluno(222, "Camila", "Ciencia da Computação", 2006, 5);
        Aluno aluno3 = new Aluno(333, "Augusto", "Analise de Sistema", 2006, 4);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Matricula: " + alunos.get(i).getMatricula());
            System.out.println("Nome: " + alunos.get(i).getNome());
            System.out.println("Curso: " + alunos.get(i).getCurso());
            System.out.println("Ano de Ingresso: " + alunos.get(i).getAnoIngresso());
            System.out.println("Quantidade de Disciplina: " + alunos.get(i).getQtdeDisciplinas());
            System.out.println("Situação: " + alunos.get(i).getSituacao());
            System.out.println();
        }
    }
}

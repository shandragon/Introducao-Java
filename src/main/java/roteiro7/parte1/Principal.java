package roteiro7.parte1;

public class Principal {
    public static void main(String[] args) {
        // Criando meu vetor
        Aluno[] alunos = new Aluno[3];

        // Criando e armazenando os alunos no vetor
        alunos[0] = new Aluno(111, "Adailton", "Sistema de Informação", 2006, 5);
        alunos[1] = new Aluno(222, "Camila", "Ciencia da Computação", 2006, 5);
        alunos[2] = new Aluno(333, "Augusto", "Analise de Sistema", 2006, 4);

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Matricula: " + alunos[i].getMatricula());
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Curso: " + alunos[i].getCurso());
            System.out.println("Ano de Ingresso: " + alunos[i].getAnoIngresso());
            System.out.println("Quantidade de Disciplina: " + alunos[i].getQtdeDisciplinas());
            System.out.println("Situação: " + alunos[i].getSituacao());
            System.out.println();
        }
    }
}

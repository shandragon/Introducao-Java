package roteiros.roteiro4.parte2;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(20061, "João", "Sistema de Informação", 2006);

        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de Ingresso: " + aluno01.anoIngresso);
        System.out.println();

        Aluno aluno02 = new Aluno(20111, "Maria", "Ciência da Computação", 2011);

        System.out.println("Matricula: " + aluno02.matricula);
        System.out.println("Nome: " + aluno02.nome);
        System.out.println("Curso: " + aluno02.curso);
        System.out.println("Ano de Ingresso: " + aluno02.anoIngresso);
    }
}

package roteiros.roteiro4.parte1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.matricula = 20061;
        aluno01.nome = "João";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2006;

        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de Ingresso: " + aluno01.anoIngresso);
        System.out.println();

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 20111;
        aluno02.nome = "Maria";
        aluno02.curso = "Ciência da Computação";
        aluno02.anoIngresso = 2011;

        System.out.println("Matricula: " + aluno02.matricula);
        System.out.println("Nome: " + aluno02.nome);
        System.out.println("Curso: " + aluno02.curso);
        System.out.println("Ano de Ingresso: " + aluno02.anoIngresso);
    }
}

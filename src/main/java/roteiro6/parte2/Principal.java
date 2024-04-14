package roteiro6.parte2;

public class Principal {
    public static void main(String[] args) {
        Ligacao ligacao = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 15, 02));
        ligacao.setHoraFim(new Tempo(10, 20, 57));

        System.out.println("Ligação de origem: " + ligacao.getNumOrigem());
        System.out.println("Local de origem: " + ligacao.getLocalOrigem());
        System.out.println("Ligação de destino: " + ligacao.getNumDestino());
        System.out.println("Local de destino: " + ligacao.getLocalDestino());

        System.out.println("Data inicio: " + ligacao.getHoraInicio().toString());
        System.out.println("Data final: " + ligacao.getHoraFim().toString());

        System.out.println("Duração: " + ligacao.getDuracao());
    }
}

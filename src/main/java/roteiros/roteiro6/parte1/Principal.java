package roteiros.roteiro6.parte1;

public class Principal {
    public static void main(String[] args) {
        Ligacao ligacao = new Ligacao("121212", "565656", "A", "B", "10:15:02");
        ligacao.setHoraFim("10:20:03");

        System.out.println("Ligação de origem: " + ligacao.getNumOrigem());
        System.out.println("Local de origem: " + ligacao.getLocalOrigem());
        System.out.println("Ligação de destino: " + ligacao.getNumDestino());
        System.out.println("Local de destino: " + ligacao.getLocalDestino());

        System.out.println("Data inicio: " + ligacao.getHoraInicio());
        System.out.println("Data final: " + ligacao.getHoraFim());

        System.out.println("Duração: " + ligacao.getDuracao());
    }
}

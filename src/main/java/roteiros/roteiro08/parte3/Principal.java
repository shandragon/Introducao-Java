package roteiros.roteiro08.parte3;

public class Principal {
    public static void main(String[] args) {

        VeiculoPasseio veiculo = new VeiculoPasseio("BAS-1111", 2010, 4);
        Cliente cliente = new Cliente("111.111.111-11", "Adailton Cerqueira Jr", "Rua", "adailton@email.com", "71999999999", veiculo);        
        System.out.println("Placa: " + cliente.getVeiculo().getPlaca());
        System.out.println("Ano Fabricação: " + cliente.getVeiculo().getAnoFabricacao());
        System.out.println("Pedágio: " + cliente.getVeiculo().calcPedagio());
        System.out.println();

        Cliente cliente2 = new Cliente("222.222.222-22", "Camila Pimentel", "Rua", "camila@email.com", "71988888888", new VeiculoPasseio("BAS-3333", 2012, 5));
        System.out.println("Placa: " + cliente2.getVeiculo().getPlaca());
        System.out.println("Ano Fabricação: " + cliente2.getVeiculo().getAnoFabricacao());
        System.out.println("Pedágio: " + cliente2.getVeiculo().calcPedagio());
        System.out.println();
    }
}

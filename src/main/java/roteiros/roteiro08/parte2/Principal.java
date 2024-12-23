package roteiros.roteiro08.parte2;

public class Principal {
    public static void main(String[] args) {
        VeiculoPasseio v01 = new VeiculoPasseio("BAS-1111", 2010, 5);
        System.out.println("Placa: " + v01.getPlaca());
        System.out.println("Ano Fabricação: " + v01.getAnoFabricacao());
        System.out.println("Passageiros: " + v01.getQntMaxPassageiros());
        System.out.println("Pedágio: " + v01.calcPedagio());
        System.out.println();

        VeiculoCarga v02 = new VeiculoCarga("BAS-2222", 2010, 5000);
        System.out.println("Placa: " + v02.getPlaca());
        System.out.println("Ano Fabricação: " + v02.getAnoFabricacao());
        System.out.println("Peso Maximo: " + v02.getPesoMax());
        System.out.println("Pedágio: " + v02.calcPedagio());
        System.out.println();

        VeiculoPasseio v03 = new VeiculoPasseio("BAS-3333", 2012, 5);
        System.out.println("Placa: " + v03.getPlaca());
        System.out.println("Ano Fabricação: " + v03.getAnoFabricacao());
        System.out.println("Passageiros: " + v03.getQntMaxPassageiros());
        System.out.println("Pedágio: " + v03.calcPedagio());
        System.out.println();

        VeiculoPequeno v04 = new VeiculoPequeno("BAS-4444", 2012, "moto");
        System.out.println("Placa: " + v04.getPlaca());
        System.out.println("Ano Fabricação: " + v04.getAnoFabricacao());
        System.out.println("Modelo: " + v04.getModelo());
        System.out.println("Pedágio: " + v04.calcPedagio());
        System.out.println();
    }
}

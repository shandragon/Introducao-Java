package roteiros.roteiro8.parte2;

public class VeiculoCarga extends Veiculo {

    private int pesoMax;

    public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
        this.taxaPedagio = 2.0;
    }

    public double calcPedagio() {
        return this.taxaPedagio * this.pesoMax;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
}

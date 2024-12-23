package roteiros.roteiro08.parte2;

public class VeiculoPasseio extends Veiculo {

    private int qntMaxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricacao, int qntMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qntMaxPassageiros = qntMaxPassageiros;
        this.taxaPedagio = 5.0;
    }


    public double calcPedagio() {
        return this.taxaPedagio * this.qntMaxPassageiros;
    }

    public int getQntMaxPassageiros() {
        return qntMaxPassageiros;
    }

    public void setQntMaxPassageiros(int qntMaxPassageiros) {
        this.qntMaxPassageiros = qntMaxPassageiros;
    }
}

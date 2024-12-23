package roteiros.roteiro08.parte1;

public class VeiculoPasseio extends Veiculo {

    private int qntMaxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricacao, int qntMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qntMaxPassageiros = qntMaxPassageiros;
    }

    public int getQntMaxPassageiros() {
        return qntMaxPassageiros;
    }

    public void setQntMaxPassageiros(int qntMaxPassageiros) {
        this.qntMaxPassageiros = qntMaxPassageiros;
    }
}

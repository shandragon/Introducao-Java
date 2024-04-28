package roteiros.roteiro8.parte3;

public abstract class Veiculo {

    private String placa;
    private int anoFabricacao;
    protected double taxaPedagio;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.taxaPedagio = 6.0;
    }

    public double calcPedagio() {
        return this.taxaPedagio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

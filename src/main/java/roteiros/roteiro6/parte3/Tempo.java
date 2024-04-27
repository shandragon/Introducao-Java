package roteiros.roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public int totalSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

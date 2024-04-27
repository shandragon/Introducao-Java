package roteiros.roteiro6.parte2;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    public String getDuracao() {
        // Convertendo as horas para segundos
        int inicio = horaInicio.totalSegundos();
        int fim = horaFim.totalSegundos();

        // Calculando a diferença em segundos
        int segundos = fim - inicio;

        // Convertendo a diferença de volta para horas, minutos e segundos
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        return String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundosRestantes);
    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    
}

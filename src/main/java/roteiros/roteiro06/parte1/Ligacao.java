package roteiros.roteiro06.parte1;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horaInicio;
    private String horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = "";
    }

    public String getDuracao() {
        // Extraindo a hora, minuto e segundo da string
        String[] strInicio = horaInicio.split(":");
        String[] strFim = horaFim.split(":");

        // Convertendo as horas para segundos
        int inicio = Integer.parseInt(strInicio[0]) * 3600 + Integer.parseInt(strInicio[1]) * 60 + Integer.parseInt(strInicio[2]);
        int fim = Integer.parseInt(strFim[0]) * 3600 + Integer.parseInt(strFim[1]) * 60 + Integer.parseInt(strFim[2]);

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

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    
}

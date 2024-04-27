package roteiros.roteiro5.exercicio1;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    public Loja(String nome, String razao, String cnpj) {
        this.nomeFantasia = nome;
        this.razaoSocial = razao;
        this.cnpj = cnpj;
    }

    public Loja(String nome, String cnpj) {
        this(nome, nome, cnpj);
    }

    public static String compararFat_static(Loja loja1, Loja loja2) {
        if (loja1.getValorFat() > loja2.getValorFat()) {
            return loja1.nomeFantasia;
        } else {
            return loja2.nomeFantasia;
        }
    }

    public String compararFat_noStatic(Loja loja) {
        if (this.getValorFat() > loja.getValorFat()) {
            return this.nomeFantasia;
        } else {
            return loja.nomeFantasia;
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public double getValorFat() {
        return valorFat;
    }
    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
}

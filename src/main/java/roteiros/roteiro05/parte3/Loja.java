package roteiros.roteiro05.parte3;

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

    public static void compararFat_static(Loja loja1, Loja loja2) {
        if (loja1.getValorFat() > loja2.getValorFat()) {
            System.out.println("Loja de maior faturamento: " + loja1.nomeFantasia);
        } else {
            System.out.println("Loja de maior faturamento: " + loja2.nomeFantasia);
        }
    }

    public void compararFat_noStatic(Loja loja) {
        if (this.getValorFat() > loja.getValorFat()) {
            System.out.println("Loja de maior faturamento: " + this.nomeFantasia);
        } else {
            System.out.println("Loja de maior faturamento: " + loja.nomeFantasia);
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

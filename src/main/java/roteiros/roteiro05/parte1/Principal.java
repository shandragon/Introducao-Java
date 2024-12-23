package roteiros.roteiro05.parte1;

public class Principal {
    public static void main(String[] args) {
        Loja  loja = new Loja("Lojão de Roupas", "Lojão de Roupas LTDA", "11223344");
        System.out.println("Nome: " + loja.getNomeFantasia());
        System.out.println("Razão: " + loja.getRazaoSocial());

        Loja  loja2 = new Loja("Roupas Chiques", "", "55667788");
        System.out.println("Nome: " + loja2.getNomeFantasia());
        System.out.println("Razão: " + loja2.getRazaoSocial());
    }
}

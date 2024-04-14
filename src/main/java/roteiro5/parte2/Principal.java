package roteiro5.parte2;

public class Principal {
    public static void main(String[] args) {
        Loja  loja1 = new Loja("Lojão de Roupas", "Lojão de Roupas LTDA", "11223344");
        Loja  loja2 = new Loja("Roupas Chiques", "55667788");
        Loja  loja3 = new Loja("Lojão de Roupas", "Lojão de Roupas LTDA", "11223344-1");
        
        loja1.setValorFat(1000);
        loja2.setValorFat(2000);
        loja3.setValorFat(1000);

        System.out.println(" ****** Teste 1 ****** ");
        if (loja1.getNomeFantasia() == loja3.getNomeFantasia()) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }
        System.out.println();

        System.out.println(" ****** Teste 2 ****** ");
        if (loja1.getNomeFantasia().equals(loja3.getNomeFantasia())) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }
        System.out.println();

        System.out.println(" ****** Teste 3 ****** ");
        if (loja1 == loja3) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }
        System.out.println();

        System.out.println(" ****** Teste 4 ****** ");
        if (loja1.equals(loja3)) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }
        System.out.println();

        System.out.println(" ****** Teste 5 ****** ");
        if (loja1.getValorFat() == loja3.getValorFat()) {
            System.out.println("Faturamento iguais");
        } else {
            System.out.println("Faturamento diferentes");
        }
    }
}

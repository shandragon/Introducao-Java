package roteiros.roteiro05.exercicio1;

public class Principal {
    public static void main(String[] args) {
        Loja  loja1 = new Loja("Lojão de Roupas", "Lojão de Roupas LTDA", "11223344");
        Loja  loja2 = new Loja("Roupas Chiques", "55667788");
        Loja  loja3 = new Loja("Lojão de Roupas", "Lojão de Roupas LTDA", "11223344-1");
        
        loja1.setValorFat(1000);
        loja2.setValorFat(2000);
        loja3.setValorFat(1000);

        String nomeFantasia;
        System.out.println(" ****** Comparação com método estático ****** ");
        nomeFantasia = Loja.compararFat_static(loja1, loja2);
        System.out.println("Loja de maior faturamento: " + nomeFantasia);
        System.out.println();

        System.out.println(" ****** Comparação com método não estático ****** ");
        nomeFantasia = loja1.compararFat_noStatic(loja2);
        System.out.println("Loja de maior faturamento: " + nomeFantasia);
        System.out.println();

        System.out.println(" ****** Comparação com método não estático ****** ");
        nomeFantasia = loja2.compararFat_noStatic(loja1);
        System.out.println("Loja de maior faturamento: " + nomeFantasia);
        System.out.println();
    }

}

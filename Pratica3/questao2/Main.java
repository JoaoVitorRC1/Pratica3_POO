package Pratica3.questao2;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1, "Joao", 2000);
        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2, "Carla", 3000, 5, 10000);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(3, "Pedro", 2000, 4000, 100);
        System.out.println(fpr.toString());

    }
}
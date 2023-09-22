package Pratica3.questao3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe os dados do Ônibus:");

        String placaOnibus = "ABC123";
        int anoOnibus = 2023;
        int assentosOnibus = 50;
        Onibus onibus = new Onibus(placaOnibus, anoOnibus, assentosOnibus);
        onibus.exibirDados();


        System.out.println("\nInforme os dados do Caminhão:");

        String placaCaminhao = "XYZ789";
        int anoCaminhao = 2022;
        int eixosCaminhao = 4;
        Caminhao caminhao = new Caminhao(placaCaminhao, anoCaminhao, eixosCaminhao);
        caminhao.exibirDados();
    }
}
package Pratica3.questao3;

public final class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {

        System.out.println("Dados do Ônibus:");
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Assentos: " + assentos);
    }
}

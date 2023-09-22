package Pratica3.questao3;

public final class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {

        System.out.println("Dados do Caminhão:");
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Eixos: " + eixos);
    }
}

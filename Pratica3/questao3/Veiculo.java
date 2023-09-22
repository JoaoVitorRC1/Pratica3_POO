package Pratica3.questao3;

public abstract class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo() {
        this.placa = "ABC-1000";
        this.ano = 0;
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract void exibirDados();
}
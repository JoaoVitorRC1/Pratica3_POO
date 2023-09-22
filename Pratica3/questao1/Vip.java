package Pratica3.questao1;

public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeVIP(){
        System.out.println("Ingresso VIP. Valor normal: "+getValorIngresso());
        setValorIngresso(valorAdicional+getValorIngresso());
        System.out.println("Valor com o adcional: R$"+getValorIngresso());

}
}

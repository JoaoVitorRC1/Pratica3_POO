package Pratica3.questao1;

public class Normal extends Ingresso{

    public Normal(double valorIngresso) {

        super(valorIngresso);
    }

    public void imprimeNormal(){
        System.out.println("Ingresso Normal. Valor do ingresso R$"+getValorIngresso()
                +"\nIngresso nao possui adicional");
    }

}
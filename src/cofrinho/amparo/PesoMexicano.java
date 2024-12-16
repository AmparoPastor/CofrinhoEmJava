package cofrinho.amparo;

public class PesoMexicano extends Coin {
    private final double taxaConversao = 0.3; // Taxa de conversão 1 peso mexicano é 0,30 real

    public PesoMexicano(double valor) {
        super(valor);
    }

    @Override
    public String info() {  //sobrescrevendo o método da classe mãe (Coin) para devolver as informações sobre a moeda em especifico
        return "Peso Mexicano - Valor: MXN " + valor;
    }

    @Override //sobrescrevendo o método da classe mãe (Coin)
    public double converter() {
        return valor * taxaConversao; //fazendo a conversão para real
    }
}

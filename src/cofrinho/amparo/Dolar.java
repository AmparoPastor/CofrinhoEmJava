package cofrinho.amparo;

public class Dolar extends Coin {
    private final double taxaConversao = 6.1; // Exemplo: 1 Dólar = 6,1 Reais

    public Dolar(double valor) {
        super(valor);
    }

    @Override //sobrescrevendo o método da classe mãe (Coin) para devolver as informações sobre a moeda em especifico
    public String info() {
        return "Dólar - Valor: $ " + valor;
    }

    @Override //sobrescrevendo o método da classe mãe (Coin)
    public double converter() {
        return valor * taxaConversao;  //fazendo a conversão para real
    }
}

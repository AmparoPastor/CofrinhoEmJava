package cofrinho.amparo;

public class Real extends Coin {
    public Real(double valor) {
        super(valor);
    }

    @Override  //sobrescrevendo o método da classe mãe (Coin) para devolver as informações sobre a moeda em especifico
    public String info() {
        return "Real - Valor: R$ " + valor;
    }

    @Override //sobrescrevendo o método da classe mãe(Coin)
    public double converter() {
        return valor; // Já em Real
    }
}

package cofrinho.amparo;

//clase mãe
public abstract class Coin {
    protected double valor;

    public Coin(double valor) {
        this.valor = valor;
    }

    public abstract String info();
    public abstract double converter();
}

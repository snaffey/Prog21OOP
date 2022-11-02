package prog21oop.composicao;

public class ContaPoupanca extends Conta {
    private float taxa;

    public ContaPoupanca(float saldo, String nome, float tx) {
        super(saldo, nome);
        this.taxa = tx;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}

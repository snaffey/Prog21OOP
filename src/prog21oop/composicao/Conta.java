package prog21oop.composicao;

public class Conta {
    protected float saldo;
    protected String nome;

    public Conta(float saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void levantar(float valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta{" + "saldo=" + this.getSaldo() + ", nome=" + this.getNome() + '}';
    }
}

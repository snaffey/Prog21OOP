package prog21oop.Exemplo3;

public class Pessoa {

    protected String nome;
    protected String nif;
    protected double salario;

    Pessoa(String n, String nf, double s) {
        this.nome = n;
        this.nif = nf;
        this.salario = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.10f;
    }
}

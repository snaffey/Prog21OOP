package prog21oop.Exemplo3;

public class Funcionario {
    protected String nome;
    protected String nif;
    protected double salario;

    Funcionario(String n, String nif, double s) {
        this.nome = n;
        this.nif = nif;
        this.salario = s;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNif() {
        return this.nif;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

    public double getBonificacao() {
        return this.salario * 0.10f;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " NIF: " + getNif() + " Salario: " + getSalario() + " Bonificacao: " + getBonificacao();
    }
}

package prog21oop.intabs;

public abstract class EmpregadoAbstrato {
    private String nome;
    protected double salario;

    public EmpregadoAbstrato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract double getSalario();


}

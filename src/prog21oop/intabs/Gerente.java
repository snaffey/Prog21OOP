package prog21oop.intabs;

public class Gerente extends EmpregadoAbstrato {
    private double comissao;

    public Gerente(String nome, double comissao) {
        super(nome);
        this.comissao = comissao;
    }

    @Override
    double getSalario() {
        return this.salario + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}

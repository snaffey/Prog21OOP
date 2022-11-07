package prog21oop.intabs;

public class EmpregadoBalcao extends EmpregadoAbstrato {
    private double comissao;

    public EmpregadoBalcao(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    double getSalario() {
        return this.salario + comissao;
    }

}
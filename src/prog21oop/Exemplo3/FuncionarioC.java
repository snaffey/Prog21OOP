package prog21oop.Exemplo3;

public class FuncionarioC extends Pessoa {

    public FuncionarioC(String n, String nf, double s) {
        super(n, nf, s);
    }

    @Override
    public String toString() {
        return "Func." + this.getNome();
    }
}
package prog21oop.Exemplo3;

public class GerenteC extends Pessoa{
    private int senha;
    private int numeroFuncionariosGerenciados;

    public GerenteC(String n, String nf, double s, int senha, int nFG) {
        super(n, nf, s);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = nFG;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public String toString() {
        return "Gerente " + this.getNome();
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao()+1000;
    }
    
}

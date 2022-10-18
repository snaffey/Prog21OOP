package prog21oop.Exemplo3;

public class Gerente {
    private String nome;
    private String nif;
    private double salario;
    private int senha;
    private int numeroFuncionariosGerenciados;

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

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int s) {
        this.senha = s;
    }

    public int getNumeroFuncionariosGerenciados() {
        return this.numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int n) {
        this.numeroFuncionariosGerenciados = n;
    }

    Gerente(String n, String nif, double s) {
        this.nome = n;
        this.nif = nif;
        this.salario = s;
    }

    Gerente(String n, String nif, double s, int senha, int nFG) {
        this.nome = n;
        this.nif = nif;
        this.salario = s;
        this.senha = senha;
        this.numeroFuncionariosGerenciados = nFG;
    }

    public double getBonificacao() {
        return this.salario * 0.30f;
    }

    public boolean autenticar(int senha) {
        /*
         * if (this.senha == senha) {
         * return true;
         * return false; }
         */
        return (this.senha == senha);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Gerente" + getNome() + " NIF: " + getNif() + " Salario: " + getSalario() + " Bonificacao: "
                + getBonificacao() + " Numero de Funcionarios Gerenciados: " + getNumeroFuncionariosGerenciados();
    }
}

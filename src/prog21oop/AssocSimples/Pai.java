package prog21oop.AssocSimples;

public class Pai {
    private String nome;
    private Filho filho;

    public Pai(String nome, Filho f) {
        this.nome = nome;
        this.filho = f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.filho.getNome();
    }

}

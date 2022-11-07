package prog21oop.Desafio07112022;

public class Professor extends Pessoa {
    // Professor tem nif, tem funçao para contratar e para demitir

    private int nif;

    public Professor(String nome, int nif) {
        super(nome);
        this.nif = nif;
    }
}
package prog21oop.Exemplo2;

public class Pessoa {
    private int id;
    protected String nome;
    private String[] tel;

    public Pessoa() {
        this.id = 1000;
        this.nome = "Sem nome";
        this.tel = null;
    }

    public Pessoa(int idA, String nA) {
        this.id = idA;
        this.nome = nA;
    }

    public Pessoa(int idA, String nA, String[] tA) {
        this(idA, nA);
        this.tel = tA;
    }

}

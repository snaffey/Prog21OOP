package prog21oop.testejava;

public class Jogador {
    // Guardar o nome do jogador e o id
    private String nome;
    protected int id;

    public Jogador(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

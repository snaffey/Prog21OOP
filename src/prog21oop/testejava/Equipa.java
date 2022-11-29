package prog21oop.testejava;

public class Equipa {
    // Guardar o nome da equipa e o id
    private String nome;
    protected int id;

    // Array de jogadores
    private Jogador[] jogadores;
    // Maximo de jogadores
    private int maxJogadores = 11;

    // Array de treinadores
    private Treinador[] treinadores;

    public Equipa(String nome, int id) {
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

    // Adicionar um jogador verificando se o array esta cheio
    public void addJogador(Jogador jogador) {
        if (jogadores == null) {
            jogadores = new Jogador[maxJogadores];
        }
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null) {
                jogadores[i] = jogador;
                break;
            }
        }
    }

}

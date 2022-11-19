package prog21oop.DesafioParque;

public class aluno {
    // Criação de aluno para integrar com a classe Exame

    private String nome;
    private int id;
    public int plafondMin = 25;
    public float plafond;

    public aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPlafondMin() {
        return plafondMin;
    }

    public void setPlafondMin(int plafondMin) {
        this.plafondMin = plafondMin;
    }

    // Adicionar plafond, so pode ser adicionado 25€ por vez
    public void AddPlafond() {
        plafond += plafondMin;
        System.out.println("O aluno " + getNome() + " tem " + plafond + "€");
    }

    public void consumoPlafond() {
        this.plafond -= plafondMin;
    }

    
}

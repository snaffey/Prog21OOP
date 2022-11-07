package prog21oop.Desafio07112022;

public class Aluno extends Pessoa{
    private int matricula;
    private Curso c;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void matricular(Curso c) {
        this.c = c;
    }
}

package prog21oop.Desafio07112022;

public class Curso {
    // Curso tem nome, duracao e informa os alunos
    public String nome;
    public int duracao;
    public Disciplina[] disciplinas;
    private int numProximaDisc = 0;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void associarDisciplina(Disciplina d) {
        this.disciplinas[numProximaDisc++] = d;
    }

    public void inscreverAlunos(Aluno a) {
        a.matricular(this);
    }
}

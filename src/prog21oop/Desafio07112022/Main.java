package prog21oop.Desafio07112022;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[2];
        alunos[0] = new Aluno();
        alunos[1] = new Aluno();
        Curso curso = new Curso("Java", 3, alunos);
        System.out.println(curso);
        Professor professor = new Professor("João", true, 0);
        Disciplina disciplina = new Disciplina("Java", curso, professor);
        System.out.println(disciplina);
    }
}

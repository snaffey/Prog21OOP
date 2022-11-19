package prog21oop.DesafioParque;

public class main {
    public static void main(String[] args) {
        // Main para testar a classe Exame e aluno
        Exame exame = new Exame("João", 1);
        Exame exame2 = new Exame("Maria", 2);
        exame.AddPlafond();
        exame.AddPlafond();
        exame.AddExame();
        exame.AddExame();
        exame.AddExame();
        exame.AddExame();

        exame2.AddPlafond();
        exame2.AddPlafond();
        exame2.AddPlafond();
        exame2.AddExame();
        exame2.AddExame();
        exame2.AddExame();

        System.out.println("O aluno " + exame.getNome() + " realizou " + exame.getExames() + " exames");
        System.out.println("O aluno " + exame2.getNome() + " realizou " + exame2.getExames() + " exames");
    }
}

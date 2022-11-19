package prog21oop.DesafioParque;

public class Exame extends aluno {

    public Exame(String nome, int id) {
        super(nome, id);
        // TODO Auto-generated constructor stub
    }

    public int exames = 0;

    // Adicionar exames, verificar se o aluno pode realizar o exame, e quantos mais
    // exames pode realizar sabendo que cada um custa 25€
    public void AddExame() {
        if (plafond < plafondMin) {
            System.out.println("O aluno " + getNome() + " não pode realizar o exame");
        } else {
            exames++;
            plafond -= plafondMin;
            System.out.println("O aluno " + getNome() + " pode realizar o exame");
        }
    }

    // Saber quantos exames foram feitos
    public int getExames() {
        return exames;
    }

}

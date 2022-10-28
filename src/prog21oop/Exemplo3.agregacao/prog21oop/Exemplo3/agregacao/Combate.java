package prog21oop.Exemplo3.agregacao;

import java.util.Random;

public class Combate {
    private int rounds;
    private boolean estadoLuta;
    private Lutador desafiado;
    private Lutador desafiante;

    public void marcaCombate(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.estadoLuta = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.estadoLuta = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.estadoLuta) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
            case 0:
                System.out.println("Empatou!");
                this.desafiado.empatarCombate();
                this.desafiante.empatarCombate();
                break;
            case 1:
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganhaCombate();
                this.desafiante.perdeCombate();
                break;
            case 2:
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiado.perdeCombate();
                this.desafiante.ganhaCombate();
                break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}

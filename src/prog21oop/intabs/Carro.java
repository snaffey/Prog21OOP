package prog21oop.intabs;

public class Carro implements Veiculo {
    private boolean motorLigado = false;
    private int velocidade = 0;

    public void ligar() {
        this.motorLigado = true;
    }

    public void desligar() {
        this.motorLigado = false;
    }

    public void acelerar() {
        this.velocidade++;
    }

    public void reduzir() {
        this.velocidade -= 20;
    }
}
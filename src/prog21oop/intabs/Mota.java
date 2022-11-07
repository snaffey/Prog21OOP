package prog21oop.intabs;

public class Mota implements Veiculo {
    private boolean motorLigado = false;
    private int velocidade = 0;
    private int nRodas;

    public Mota(int nR) {
        this.nRodas = nR;
    }

    public void ligar() {
        this.motorLigado = true;
    }

    public void desligar() {
        this.motorLigado = false;
    }

    public void acelerar() {
        this.velocidade += 30;
    }

    public void reduzir() {
        this.velocidade -= 20;
    }

    public boolean estadoligado() {
        return motorLigado;
    }

    

    
}
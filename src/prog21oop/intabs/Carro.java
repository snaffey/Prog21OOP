package prog21oop.intabs;

public class Carro implements Veiculo {
    private boolean motorLigado = false;
    private int velocidade = 0;
    private int nRodas;

    public Carro(int nR) {
        this.nRodas = nR;
    }

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

    public boolean estadoligado() {
        return motorLigado;
    }

    // SetMOtorLigado
    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    // getvelocidade

    public int getVelocidade() {
        return velocidade;
    }

    
}

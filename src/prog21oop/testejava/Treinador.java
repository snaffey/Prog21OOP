package prog21oop.testejava;

public class Treinador extends pessoa {

    public String estado;

    public Treinador(String nome, String estado) {
        super(nome);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Treinar a equipa

}

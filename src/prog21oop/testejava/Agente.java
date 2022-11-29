package prog21oop.testejava;

public class Agente extends pessoa {
    public Agente (String nome) {
        super(nome);
    }

    // Guardar o pais do agente
    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}

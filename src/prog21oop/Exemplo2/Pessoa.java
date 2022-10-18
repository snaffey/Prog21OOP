package prog21oop.Exemplo2;

public class Pessoa {
    private int id;
    protected String nome;
    private String[] tel;

    public Pessoa() {
        this.id = 1000;
        this.nome = "Sem nome";
        this.tel = null;
    }

    public Pessoa(int idA, String nA) {
        this.id = idA;
        this.nome = nA;
    }

    public Pessoa(int idA, String nA, String[] tA) {
        this(idA, nA);
        this.tel = tA;
    }

    public void setId(int idA) {
        this.id = idA;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nA) {
        this.nome = nA;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTel(String[] tA) {
        this.tel = tA;
    }

    public String[] getTel() {
        String res = "";
        if (this.tel != null) {
            for (String i : this.tel)
                res += i + " ";
        }
        return tel;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Nome: " + getNome();
    }

}

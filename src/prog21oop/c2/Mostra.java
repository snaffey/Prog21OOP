package prog21oop.c2;

public class Mostra {
    public Pessoa pessoa;
    public String nome;

    public Mostra(String nome) {
        this.nome = nome;
        pessoa = new Pessoa();
    }

    public void mostrar() {
        System.out.println(this.pessoa.configurar(this.nome));
    }
}

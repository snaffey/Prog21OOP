package prog21oop.Desafio08112022;

public class Item {
    final int TAM = 5;
    public Produto[] produtos = new Produto[TAM];
    int pos;
    public void adiciona (Produto p){
        if (pos < TAM)
            this.produtos[pos++] = p;
    }
}

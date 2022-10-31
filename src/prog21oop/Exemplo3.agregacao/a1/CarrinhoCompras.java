package a1;

public class CarrinhoCompras {
    final int TAM = 5;

    public produto[] produtos = new produto[TAM];

    int pos;

    public void adiciona(produto p) {
        if (pos < TAM) {
            this.produtos[pos++] = p;
        }
    }

    public produto remover() {
        produto rem = null;
        if (pos > 0) {
            rem = this.produtos[--pos];
            this.produtos[pos] = null;
        }
        return rem;
    }

    public String listar(int p) {
        return this.produtos[p].getNome();
    }

    public void listaTodos() {
        if (this.produtos != null)
            for (produto produto : this.produtos) {
                if (produto != null)
                    System.out.println(produto.getNome());
            }
    }
}

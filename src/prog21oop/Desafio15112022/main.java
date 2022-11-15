package prog21oop.Desafio15112022;

public class main {
    public static void main(String[] args) {
        CarrinhoCompras cp = new CarrinhoCompras();
        cp.adicionarProduto(new produto("pc1", 100));
        cp.adicionarProduto(new produto("pc2", 200));
        cp.adicionarProduto(new produto("pc3", 300));
        cp.adicionarProduto(new produto("pc4", 400));
        cp.adicionarProduto(new produto("pc5", 500));

        cp.listarProdutos();
        System.out.println("Um ->" + cp.listarUmProduto(1));
        produto prem = cp.removerProduto("pc1");
        System.out.println("R>" + prem.getNome());
        produto pR1 = cp.removerProduto();
        System.out.println("R>" + pR1.getNome());
        cp.listarProdutos();
    }
}

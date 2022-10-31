package a1;

public class main {
    public static void main(String[] args) {
        CarrinhoCompras cp = new CarrinhoCompras();
        cp.adiciona(new produto("pc1", 100));
        cp.adiciona(new produto("pc2", 200));
        cp.adiciona(new produto("pc3", 300));
        cp.adiciona(new produto("pc4", 400));
        cp.adiciona(new produto("pc5", 500));

        cp.listaTodos();
        System.out.println("->" + cp.listar(1));
        produto prem = cp.remover();
        System.out.println("R>" + prem.getNome());
        produto pR1 = cp.remover();
        System.out.println("R>" + pR1.getNome());
        cp.listaTodos();
    }
}

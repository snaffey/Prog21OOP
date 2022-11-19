package prog21oop.Desafio15112022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoCompras {

    private ArrayList<produto> produtos = new ArrayList<produto>();

    public void adicionarProduto(produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(produto produto) {
        produtos.remove(produto);
    }

    public boolean isEmpty() {
        return produtos.isEmpty();
    }

    public int size() {
        return produtos.size();
    }

    public void listarProdutos() {
        Iterator<produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            produto produto = iterator.next();
            System.out.println(produto.getNome());
        }
    }

    public void listarProdutosForEach() {
        produtos.forEach(produto -> {
            System.out.println(produto.getNome());
        });
    }

    public void listarUmProduto(int index) {
        System.out.println(produtos.get(index).getNome());
    }
}

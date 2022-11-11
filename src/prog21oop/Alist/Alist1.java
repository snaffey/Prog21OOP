package prog21oop.Alist;

import java.util.List;
import java.util.ArrayList;

public class Alist1 {
    /*
     * ArrayLIst -> coleção de dados dinamicos, sem tamanho fixo, alterado em tempo
     * de execução.
     * Implementa a interface List.
     * Não podem implementar tipos primitivos: int, double, float, char, etc.
     * Podem ter valora nulos, e valores duplicados.
     */

    // Main
    public static void main(String[] args) {

        // Criação de um ArrayList
        List<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("PHP");
        lista.add("Java");
        lista.add("C#");
        lista.add("Python");
        lista.add("C++");

        // Sera invocado o toString() do ArrayList
        System.out.println(lista);

        // Adicionando elementos em uma posição especifica
        lista.add(2, "JavaScript");
        System.out.println(lista);

        // Exemplo 2
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(12);
        listaInteiros.add(13);
        listaInteiros.add(0, 14);
        listaInteiros.add(15);
        listaInteiros.add(16);

        System.out.println(listaInteiros);

        // Lista criada via lista ex.
        List<Integer> lIntCont = new ArrayList<>(listaInteiros);
        System.out.println(lIntCont);
        lIntCont.add(17);
        System.out.println(lIntCont);

        // Add em todos em função do tipo
        lIntCont.addAll(listaInteiros);
        System.out.println(lIntCont);

        // Exemplo 3
        /*
         * Aceder aos elementos de um ArrayList isEmpty() - Verifica se um array está
         * vazio, retorna um boolean
         * size() - Retorna o tamanho do ArrayList, retorna um int
         * get() - Retorna o elemento de uma posição especifica, retorna um Object
         * set() - Altera o valor de um elemento de uma posição especifica, retorna um
         */

        int tamArrayIntCont = lIntCont.size();
        System.out.println("Tamanho do ArrayList: " + tamArrayIntCont);

        boolean StIntCont = lIntCont.isEmpty();
        System.out.println("ArrayList vazio: " + StIntCont);

    }
}

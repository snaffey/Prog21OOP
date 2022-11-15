package prog21oop.Alist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String[] args) {
        // Iterar o arrayList

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("Pedro");
        listaNomes.add("Ana");
        listaNomes.add("Rui");

        System.out.println(listaNomes);

        /*
         * Iteração usando o forEach
         * 
         * forEach() - Executa uma determinada acção para cada elemento que deva
         * percorrer ate que todos os elementos tenham sido processados.
         * 
         * names.forEach(name -> {
         * Instruções;
         * })
         * 
         * names - a lista de ArrayList
         * name - item a percorrer em cada Iteração
         */

        listaNomes.forEach(name -> {
            System.out.println(name);
        });

        /*
         * De um modo generico podemos usar a classe Iterator para percorrer o conteudo
         * de uma coleção.
         * Etapas:
         * - Obter um iterador para o inicio da coleção, usamos o metodo iterador();
         * - Configuramos um loop (ciclo ) que faz uma verificação da exestencia de um
         * Item seguinte, usamos o metodo hasNext(), que devolve um valor boolean true
         * ENQUANTO EXISTIR SEGUINTE.
         * - No ciclo interno(loop), chamamos o elemento atual, usando o metodo next().
         */

        System.out.println("Iteração com Iterator");
        Iterator<String> iterator = listaNomes.iterator();
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("II -> " + nome);
        }

        // Mesma coisa em forma de for
        System.out.println("Iteração com Iterator em forma de for");
        for (Iterator<String> iterator2 = listaNomes.iterator(); iterator2.hasNext();) {
            String nome = iterator2.next();
            System.out.println("IF -> " + nome);
        }

        System.out.println("Iteração Ver.");
        Iterator<String> iterator3 = listaNomes.iterator();
        while (iterator3.hasNext()) {
            String nome3 = iterator3.next();
            if (nome3.equals("Pedro"))
                System.out.println("Encontrei o Pedro");
            else
                System.out.println("Não encontrei o Pedro");
        }

        // Exemplo Listiterator
        // hasPrevious() - Verifica se existe um elemento anterior
        System.out.println("Iteração com ListIterator");
        ListIterator<String> listNomes = listaNomes.listIterator(listaNomes.size());

        while (listNomes.hasPrevious()) {
            String nome = listNomes.previous();
            System.out.println("IL -> " + nome);
        }

        /*
         * Index
         * Pesquisa de elementos num ArrayList contains() - Verifica se um elemento
         * existe
         * na lista indexOf() - Devolve o indice do elemento na lista
         * lastIndexOf() - Devolve o indice do ultimo elemento na lista
         */

        boolean hasMaria = listaNomes.contains("Maria");
        System.out.println("Maria existe? " + hasMaria);

        int iRui = listaNomes.indexOf("Rui");
        System.out.println("Rui esta na posição: " + iRui);

        // Encontra todas as oc.
        Iterator<String> iterator4 = listaNomes.iterator();
        while (iterator4.hasNext()) {
            String nome4 = iterator4.next();
            if (nome4.startsWith("A")) {
                System.out.println("Encontrei o nome que começa com A");
            }
        }
    }
}
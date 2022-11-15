package prog21oop.Alist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
    }
}

public class Alist3 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 20);
        Pessoa p2 = new Pessoa("Maria", 30);
        Pessoa p3 = new Pessoa("Pedro", 40);

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        listaPessoas.add(new Pessoa("Ana", 50));
        listaPessoas.add(new Pessoa("Rui", 60));

        listaPessoas.forEach(pessoa -> {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        });

        System.out.println("Iteração com Iterator");
        Iterator<Pessoa> iterator = listaPessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa pessoa = iterator.next();
            System.out.println(pessoa.toString());
        }
    }
}

package prog21oop.AssocSimples;

public class Main {
    public static void main(String[] args) {
        Mae m = new Mae("Maria");
        Filho f1 = new Filho("João");
        Pai p = new Pai("José", f1);
        System.out.println("Familia Alves");
        System.out.println(p.getNome() + "Casado com " + m.getNome() + " tem um filho chamado " + p.toString());
    }
}

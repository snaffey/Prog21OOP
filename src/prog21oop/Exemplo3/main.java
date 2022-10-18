package prog21oop.Exemplo3;

public class main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", "123456789", 1000);
        Gerente g = new Gerente("Maria", "987654321", 2000, 1234, 10);

        System.out.println(f.toString());
        System.out.println(g.toString());

        
    }
}

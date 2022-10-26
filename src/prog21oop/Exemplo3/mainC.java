package prog21oop.Exemplo3;

public class mainC {
    public static void main(String[] args) {
        FuncionarioC f = new FuncionarioC("Joao", "123456789", 1000);
        GerenteC g = new GerenteC("Maria", "987654321", 2000, 1234, 10);

        System.out.println("O func" + f.toString() + " tem uma bonificacao de " + f.getBonificacao());
        System.out.println("O gerente " + g.toString() + " tem uma bonificacao de " + g.getBonificacao());

        
    }
}

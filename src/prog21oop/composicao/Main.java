package prog21oop.composicao;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.abrirContaCorrente("João", 100);
        banco.abrirContaCorrente("Maria", 200);
        banco.abrirContaPoupanca("José", 300, 0.1f);
        banco.abrirContaPoupanca("Ana", 400, 0.2f);
        banco.depositoContaCorrente(10000, 1);
        banco.depositoContaPoupanca(10000, 0);
        banco.listarTodasContaCorrente();
        banco.listarTodasContaPoupanca();
    }
}

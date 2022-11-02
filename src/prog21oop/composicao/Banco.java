package prog21oop.composicao;

public class Banco {
    public ContaPoupanca[] cp;
    public ContaCorrente[] cc;
    int numContasPoupanca, numContasCorrente;

    public Banco() {
        this.cp = new ContaPoupanca[10];
        this.cc = new ContaCorrente[10];
        this.numContasPoupanca = 0;
        this.numContasCorrente = 0;
    }

    public void abrirContaCorrente(String n, float s) {
        this.cc[numContasCorrente++] = new ContaCorrente(s, n);
    }

    public void abrirContaPoupanca(String n, float s, float tx) {
        this.cp[numContasPoupanca++] = new ContaPoupanca(s, n, tx);
    }

    public void depositoContaCorrente(float valor, int numConta) {
        this.cc[numConta].depositar(valor);
    }

    public void depositoContaPoupanca(float valor, int numConta) {
        this.cp[numConta].depositar(valor);
    }

    public void listarTodasContaCorrente() {
        if (this.cc != null) {
            for (ContaCorrente cc : this.cc) {
                if (cc != null) {
                    System.out.println(cc.toString());
                }
            }
        }
    }

    public void listarTodasContaPoupanca() {
        if (this.cp != null) {
            for (ContaPoupanca cp : this.cp) {
                if (cp != null) {
                    System.out.println(cp.toString());
                }
            }
        }
    }
}

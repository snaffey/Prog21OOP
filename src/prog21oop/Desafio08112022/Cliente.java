package prog21oop.Desafio08112022;

public class Cliente extends Pessoa {
    public Pedido[] pedidos = new Pedido[5];
    int pos;

    public Cliente(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        // TODO Auto-generated constructor stub
    }

    public void adiciona (Pedido p){
        if (pos < 5)
            this.pedidos[pos++] = p;
    }

}

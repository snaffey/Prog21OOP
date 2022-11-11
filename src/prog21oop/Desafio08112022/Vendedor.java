package prog21oop.Desafio08112022;

public class Vendedor extends Pessoa {
    public Vendedor(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        // TODO Auto-generated constructor stub
    }

    int pos;
    public Pedido[] pedidos = new Pedido[5];

    private double comissao;
    private double valorVendas;
    private int quantidadeVendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public double getValorTotal() {
        return quantidadeVendas * valorVendas;
    }

    public void adiciona(Pedido p) {
        if (pos < 5)
            this.pedidos[pos++] = p;
    }

}
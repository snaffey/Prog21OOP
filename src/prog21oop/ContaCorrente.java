package prog21oop;


public class ContaCorrente {
    
    
    //Modificadores -> Fica o modelo, pode ser acedida pelo obj mas não modificada
    
    private static int numeroContasCriadas;
    
    public static int getNumeroContas(){
        return ContaCorrente.numeroContasCriadas;
    }
    
    
    private int numero;
    private String nome;
    private int nif;
    private double saldo;
    
    
    
    public ContaCorrente(){
        this.numero = 1000;
        this.nome = "Sem nome declarado";
        this.nif = 1111111;
        this.saldo = 250.0;
        this.numeroContasCriadas++;//A cada pessoa que entrar 
    }
    
    public int getNumerosContas(){
        return this.numeroContasCriadas;
    }
    
    public ContaCorrente(String n){    
        this.nome = n;
        this.numeroContasCriadas++;
    }
   
    //Metodo acessores   / getters & setters / 
    public String getNome(){
        return this.nome;
    }
    
    public Double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public ContaCorrente(String n, double s){
        
        this(n);
        this.saldo = s;
    }
    
    public void setNumero (int n){
        if(n > 20)
            this.numero = n;
    }
    void levantamento(double qt){//void não retorna nada 
        double novoSaldo = this.saldo - qt;
        this.saldo = novoSaldo;
    }
    void deposito(double qt){
        this.saldo += qt;
    }
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("Rocha");
        System.out.println("Nome: "+cc.nome);
    }
}

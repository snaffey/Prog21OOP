
package prog21oop;

class Conta {
    /*Atributos de classe/modulo 
    Por padrão o encapsulamento é public 
    */
    int numero;
    String nomeTitular;
    double saldo;
    
    void levantamento(double qt){//void não retorna nada 
        double novoSaldo = this.saldo - qt;
        this.saldo = novoSaldo;
    }
    void deposito(double qt){
        this.saldo += qt;
    }
    
}

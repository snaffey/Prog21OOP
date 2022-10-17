
package prog21oop;

public class Desafio {
    
    static double media(double saldos,int contas){
        
        return saldos/contas;
    }
    public static void main(String[] args) {
       
        Conta[] ctn  = new Conta[20];
        
        for(int i=0; i < ctn.length;i++){
            ctn[i] = new Conta();
        }
        double tsaldos = 0;
        int contas = 0;
        for(Conta cn : ctn){
            if(cn.saldo % 2 == 0){
                cn.deposito(cn.saldo*1.20);
            }
            if(cn.saldo < 100){
                cn.deposito(1000);
            } 
            tsaldos += cn.saldo;
        }    
        
        double mediaT = media(tsaldos,ctn.length);
        System.out.println("Media de todas as contas: "+mediaT);
    }
}

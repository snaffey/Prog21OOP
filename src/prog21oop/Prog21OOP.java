
package prog21oop;

import java.util.Scanner;

public class Prog21OOP {

    public static void main(String[] args) {
        
        
        //System.out.println("Olá, Digita a tua idade!");
        
        Scanner entrada = new Scanner(System.in);
        /*
        int idade = entrada.nextInt();
        System.out.println("Idade -> "+idade);
        */
    
        Conta conta = new Conta();
        conta.numero = 13;
        //System.out.println("Nº da conta -> "+conta.numero);
        
        conta.saldo = 1000;
        //System.out.println("Saldo da conta -> "+conta.saldo);
        
        conta.levantamento(100);
        //System.out.println("Saldo da conta -> "+conta.saldo);
       
        conta.deposito(1000);
        //System.out.println("Saldo da conta -> "+conta.saldo);
        
        Conta conta2 = conta;
        
        //System.out.println("Saldo da conta 2: "+conta.saldo);
        
        Conta conta3 = new Conta();
        //System.out.println("Saldo da conta 3: "+conta3.saldo);
    
        
        ContaCorrente cc = new ContaCorrente("Pedro");
        //System.out.println("Nome: "+cc.getNome());
        
        cc.setNumero(25);
        //System.out.println("N: "+cc.getNumero());
        
        //ContaCorrente cc1 = new ContaCorrente ("Rui",1121121);
        //System.out.println("Nome é "+cc1.getNome()+" e o nif é : "+cc1.getSaldo());
        
        ContaCorrente ccAna = new ContaCorrente("Ana");
        ContaCorrente ccPedro = new ContaCorrente("Rocha");
        int qt = ContaCorrente.getNumeroContas();
        //System.out.println("Total de contas: "+qt);
        
        //Array objetos
        
       // int [] numeros = new int[2];
        
        ContaCorrente [] lcc  = new ContaCorrente[5];
        ContaCorrente [] lcc1;
        lcc1 = new ContaCorrente[5];
        //erro porque não tem valor valido na pos 
        //System.out.println("1 -> "+lcc[0].getNome());
        
        lcc[0] = ccAna;
        lcc[1] = ccPedro;
                
        //System.out.println("1 -> "+lcc[0].getNome());
        //System.out.println("2 -> "+lcc[1].getNome()); 
        
        //System.out.println("1 -> "+lcc[0].getSaldo());
        //System.out.println("2 -> "+lcc[1].getSaldo()); 
        
        lcc[0].deposito(500);
        lcc[1].levantamento(100);
        
        //System.out.println("1 -> "+lcc[0].getSaldo());
        //System.out.println("2 -> "+lcc[1].getSaldo());
        
        lcc[3] = new ContaCorrente("Ricardo");
        //System.out.println("3º -> "+lcc[3].getNome());
        lcc[3].deposito(1000);
        //System.out.println("Saldo 3º -> "+lcc[3].getSaldo());
        
        
        //Array iterator 
        
        //System.out.println("Nº de contas: "+lcc.length);
        /*
        for(int i = 0;i < lcc.length;i++){
            if(lcc[i] != null){
                System.out.println("i: "+lcc[i]);
                System.out.println("n: "+lcc[i].getNome());
        }
        */
        
        //Exemplo 2 com for in 
        
        /*
        Sintaxe :
        for(tipo de dados var de item atual: array)
        */
        
        
        /*
        for(ContaCorrente cx : lcc){          
            if(cx != null){
                System.out.println("i: "+cx.getNome()); 
            }
        }  */
        
        
        
        
        
    }       
}

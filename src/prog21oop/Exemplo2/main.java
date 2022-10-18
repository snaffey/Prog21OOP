package prog21oop.Exemplo2;

public class main {
    public static void main(String[] args) {
        /*
         * Lista l1, l2 = new Lista();
         * l1 = new Lista();
         * l1.inserir(12);
         * l1.inserir(41);
         * l1.inserir(56);
         * l1.inserir(78);
         * l2.inserir(123123);
         * l2.inserir(345);
         * l2.inserir(567);
         * 
         * System.out.println("Lista 1: " + l1.listar());
         * System.out.println("Lista 2: " + l2.listar());
         * 
         * int vRem = l1.remover();
         * System.out.println("Valor removido: " + vRem);
         * System.out.println("Lista 1: " + l1.listar());
         */

        final int TAM = 3;
        // int[] id = new int[4];
        Pessoa[] lp = new Pessoa[TAM];

        for (int i = 0; i < lp.length; i++) {
            lp[i] = new Pessoa();
            lp[i].setId(i + 2000);
            lp[i].setNome("Nome " + i);
        }
        for (Pessoa iP : lp) {
            System.out.println(iP.toString());
            System.out.println(iP.getTel());
        }

        String[] telefones = { "12345655", "4561343" };
        lp[0].setTel(telefones);
    }
}

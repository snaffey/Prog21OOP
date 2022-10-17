package prog21oop.Exemplo2;

public class Lista {

    final int TAM = 20;
    int pos;
    int lista[] = new int[TAM];

    Lista() {
        this.pos = 0;
    }

    void inserir(int n) {
        if (pos < TAM)
            lista[pos++] = n;
    }

    int devolverUltimaPos() {
        int r = 0;
        if (pos > 0)
            r = lista[pos - 1];
        return r;
    }

    int remover() {
        int r = 0;
        if (pos > 0) {
            r = lista[--pos];
            lista[pos] = 0;
        }
        return r;
    }

    String listar() {
        String str = "";
        for (int i = 0; i < lista.length; i++)
            if (lista[i] != 0)
                str += lista[i] + " ";
        return str;
    }
}

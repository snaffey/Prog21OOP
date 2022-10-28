package prog21oop.Exemplo3.agregacao;

public class main {
    public static void main(String[] args) {
        Lutador[] lista = new Lutador[5];
        lista[0] = new Lutador("Sergio", "Portugal", 30, 1.75f, 80.9f, 14, 2, 1);
        lista[1] = new Lutador("Joao", "Brasil", 35, 1.68f, 57.8f, 12, 2, 3);
        lista[2] = new Lutador("Maria", "Espanha", 28, 1.65f, 61.2f, 13, 1, 2);
        lista[3] = new Lutador("Ana", "Franca", 37, 1.53f, 52.3f, 15, 3, 1);
        lista[4] = new Lutador("Pedro", "Italia", 31, 1.81f, 81.6f, 11, 2, 4);
        Combate c1 = new Combate();
        c1.marcaCombate(lista[2], lista[3]);
        lista[2].status();
        lista[3].status();
        c1.lutar();
    }
}

package prog21oop.c2;

/* 
 * Uma classe cria a instância de outra classe no seu contexto, quando a classe todo for destruida,
 * a outra classe também é destruída.
 */

public class Pessoa {
    public String configurar(String nome) {
        return "Nome: " + nome;
    }
}

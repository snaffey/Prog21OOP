package prog21oop.intabs;

public class main {
    public static void main(String[] args) {
        System.out.println("Criar Carro");
        Carro c = new Carro(4);
        Mota m = new Mota(2);
        c.ligar();
        c.acelerar();
        c.acelerar();
        System.out.println("Carro: " + c.estadoligado() + " " + c.getVelocidade());
        c.reduzir();
        c.reduzir();
        c.desligar();
        System.out.println("Estado carro ->" + c.estadoligado());

        // Classe abstrata

        Gerente g = new Gerente("Joao", 1000);
        g.setComissao(1000);
        EmpregadoBalcao e = new EmpregadoBalcao("Maria", 1000);
        System.out.println("Salario Gerente: " + g.getSalario());
        System.out.println("Salario Empregado: " + e.getSalario());
    }
}

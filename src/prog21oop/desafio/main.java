package prog21oop.desafio;

public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa xpto");
        empresa.novoDep("Departamento 1");
        empresa.novoDep("Departamento 2");
        empresa.novoDep("Departamento 3");
        empresa.listaTodos();
        Empresa nE = new Empresa("Empresa epcc");
        nE.novoDep("Departamento desporto");
        nE.novoDep("Departamento informatica");
        nE.listaTodos();
    }
}

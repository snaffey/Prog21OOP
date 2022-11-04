package prog21oop.desafio;

public class Departamento {
    Empresa empresa;
    protected String nomeDepartamento; 

    public Departamento(Empresa e, String d) {
        this.empresa = e;
        this.nomeDepartamento = d;
    }

}

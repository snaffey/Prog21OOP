package prog21oop.desafio;

public class Empresa {
    private String nome;
    private int numProximoDep = 0;
    private static int numMaxDeps = 10;
    Departamento deps[];

    public Empresa(String nome) {
        this.nome = nome;
        this.deps = new Departamento[numMaxDeps];

        System.out.println("Empresa: " + this.nome);
    }

    public void novoDep(String n) {
        if (numProximoDep < numMaxDeps) {
            this.deps[numProximoDep++] = new Departamento(this, n);
            System.out.println("Departamento: " + n);
        } else {
            System.out.println("Limite de departamentos atingido!");
        }
    }

    public void listaTodos() {
        System.out.println("\n********************Lista*********************");
        if (this.deps != null) {
            for (Departamento dep : this.deps) {
                if (dep != null) {
                    System.out.println(dep.empresa.nome + " - " + dep.nomeDepartamento);
                    System.out.println("************Fim************\n");
                }
            }
        }
    }

}

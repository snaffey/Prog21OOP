package prog21oop.DesafioEntrega08112022;

public class ClienteRegistado {
    // ClienteRegistado é uma subclasse de Cliente, tem id, tem login e password,
    // tem manter() e logar().

    private Long id;
    private String login;
    private String password;

    public ClienteRegistado(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

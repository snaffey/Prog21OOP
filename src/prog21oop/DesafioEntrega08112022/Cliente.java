package prog21oop.DesafioEntrega08112022;

public class Cliente extends ClienteRegistado {
    private Long cod_assinantes;
    private Long qtd_assinantes;
    private String email;

    public Cliente(Long id, String login, String password) {
        super(id, login, password);
    }

    public Long getCod_assinantes() {
        return cod_assinantes;
    }

    public void setCod_assinantes(Long cod_assinantes) {
        this.cod_assinantes = cod_assinantes;
    }

    public Long getQtd_assinantes() {
        return qtd_assinantes;
    }

    public void setQtd_assinantes(Long qtd_assinantes) {
        this.qtd_assinantes = qtd_assinantes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

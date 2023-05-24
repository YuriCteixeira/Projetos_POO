package bancobrasil;

public class Gerente extends usuario {

    private String login;
    private String password;

    public Gerente() {
    }

    public Gerente(String login, String password, String nome, String sobrenome, String telefone) {
        super(nome, sobrenome, telefone);
        this.login = login;
        this.password = password;
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

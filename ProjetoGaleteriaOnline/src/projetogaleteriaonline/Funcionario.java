package projetogaleteriaonline;

public class Funcionario extends Usuario {

    public Funcionario() {
    }

    public Funcionario(String username, String senha) {
        super(username, senha);
    }

    public String atenderReclamacoes() {
        return "Você tem mensagens novas no chat.";
    }

    protected void fazerLogin() {

    }
}

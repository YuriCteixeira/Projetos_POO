package projetogaleteriaonline;

public abstract class Usuario {

    private String username;
    private String senha;

    public Usuario() {
    }

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    
    
    private boolean verificarLogin() {
        return false;
    }
}

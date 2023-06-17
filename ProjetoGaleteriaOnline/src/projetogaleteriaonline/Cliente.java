package projetogaleteriaonline;

public class Cliente extends Usuario {

    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String email, String telefone, String username, String senha) {
        super(username, senha);
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected void cadastrar() {

    }

    protected void fazerLogin() {

    }

    protected void consultarMenu() {

    }

    public void avaliar() {

    }

    public String reclamar() {

        return "Reclamação encaminhada para um de nossos funcionários. Estamos redirecionado você para nosso chat";
    }

    protected void cadastrarCartao() {

    }

    protected void efetuarPagamento() {

    }
}

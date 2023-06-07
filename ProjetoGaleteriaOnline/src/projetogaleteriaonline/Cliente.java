package projetogaleteriaonline;


public class Cliente extends Usuario{
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

    //Métodos
    private void cadastrarSe (){}
    private void fazerLogin (){}
    private void consultarMenu(){}
    public String avaliar(){
        return "Avaliação enviada. Obrigado pelo feedback!";
    }
    private String reclamar(){
        return "Reclamação recebida. Você será redirecionado ao chat e será atendido por um de nossos funcionários.";
    }
    private void cadastrarCartao (){}
    private void efetuar_pagamento (){}
}

package bancobrasil;

import java.util.Date;

public class usuario {

    //Atributos
    private String nome;
    private String sobrenome;
    private String telefone;

    //Construtor
    public usuario() {
    }

    public usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;

    }

    //Métodos getters e setters
    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsobrenome() {
        return this.sobrenome;
    }

    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    //Métodos
    public String imprimir_info() {
        return String.format("INFORMAÇÕES DO CLIENTE\nNome: %s\nSobrenome: %s\nTelefone: %s",
                this.nome, this.sobrenome, this.telefone);

    }
}

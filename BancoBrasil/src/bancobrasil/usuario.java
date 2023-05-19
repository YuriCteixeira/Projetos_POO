package bancobrasil;

import java.util.Date;

public class usuario {

    //Atributos
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();

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

    public void setnome(String agencia) {
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

    public void settelefone(String agencia) {
        this.telefone = telefone;
    }

    public Date getdataRegistro() {
        return this.dataRegistro;
    }

    public void setdataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    //Métodos
    String imprimir_info() {
        return String.format("Nome: %s\nSobrenome: %s\nTelefone: %s\nData de registro: %s",
                this.nome, this.sobrenome, this.telefone, this.dataRegistro);

    }
}

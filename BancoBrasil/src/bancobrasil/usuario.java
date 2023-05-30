package bancobrasil;

import java.util.Date;

public abstract class usuario {

    //Atributos
    private String nome;
    private String sobrenome;
    private String telefone;

    

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
    public abstract String imprimir_info();

    
}

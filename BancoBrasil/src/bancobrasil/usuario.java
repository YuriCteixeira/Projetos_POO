package bancobrasil;

import java.util.Date;

public class usuario {
    //Atributos
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    //Métodos
    String imprimir_info (){
        return String.format("Nome: %s\nSobrenome: %s\nTelefone: %s\nData de registro: %s",
                this.nome, this.sobrenome, this.telefone, this.dataRegistro);
        
    }
}

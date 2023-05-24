package bancobrasil;

import java.util.Date;

public class Cliente extends usuario {

    private Date dataRegistro = new Date();

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String telefone) {
        super(nome, sobrenome, telefone);

    }

    public Date getdataRegistro() {
        return this.dataRegistro;
    }

    public void setdataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String imprimir_info() {
        return String.format("INFORMAÇÕES DO CLIENTE\nNome: %s\nSobrenome: %s\nTelefone: %s\nData de Registro: %s",
                super.getnome(), super.getsobrenome(), super.gettelefone(), this.dataRegistro);
    }
}

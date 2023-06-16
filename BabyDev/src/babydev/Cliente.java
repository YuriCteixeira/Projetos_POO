
package babydev;

import java.util.Date;


public class Cliente extends Usuario{
    private String nomeCliente;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String endereco, String login, String senha, Date dt_registro, String email) {
        super(login, senha, dt_registro, email);
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDt_registro() {
        return dt_registro;
    }

    public void setDt_registro(Date dt_registro) {
        this.dt_registro = dt_registro;
    }
    
    //Métodos
    public void AtualizarPerfil(){    
    }
    
    @Override
     public boolean verificarLogin(String login, String senha){
        if(super.getLogin() == login && super.getSenha() == senha){
            return true;
    }else{
           return false; 
        }
    }
    
    public String ImprimirInfo(){
        return String.format("Nome: %s\n", this.nomeCliente, 
                "Endereço: %s\n", this.endereco, 
                "Data de registro: %s%s%s", this.dt_registro, 
                "E-mail: %s", super.getEmail());
    }
    
    //public String visualizarPedido()
    
}

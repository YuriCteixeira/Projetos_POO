package babydev;

import java.util.Date;

public class Admin extends Usuario implements Administrador {

    private String nomeAdmin;

    public Admin() {
    }

    public Admin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public Admin(String nomeAdmin, String login, String senha, Date dt_registro, String email) {
        super(login, senha, dt_registro, email);
        this.nomeAdmin = nomeAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public Date getDt_registro() {
        return dt_registro;
    }

    public void setDt_registro(Date dt_registro) {
        this.dt_registro = dt_registro;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void Atualizar() {

    }
    
     public boolean verificarLogin(String login){
        if(super.getLogin() == login){
            return true;
    }else{
           return false; 
        }

}
}

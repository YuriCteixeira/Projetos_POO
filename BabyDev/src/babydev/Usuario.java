package babydev;


import java.util.Date;
public class Usuario {
    private String login;
    private String senha;
    Date dt_registro;
    private String email;

    public Usuario() {
    }

    public Usuario(String login, String senha, Date dt_registro, String email) {
        this.login = login;
        this.senha = senha;
        this.dt_registro = dt_registro;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDt_registro() {
        return dt_registro;
    }

    public void setDt_registro(Date dt_registro) {
        this.dt_registro = dt_registro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
  //Métodos
    public boolean verificarLogin(String login, String senha){
        if(this.login == login && this.senha == senha){
            return true;
    }else{
           return false; 
        }
    }
}

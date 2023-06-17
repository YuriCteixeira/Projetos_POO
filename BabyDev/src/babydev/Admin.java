package babydev;

import java.util.Date;
import java.util.Objects;

public class Admin extends Usuario implements Administrador {

    private String nomeAdmin;

    public Admin() {
    }

    public Admin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public boolean isPermissao() {
        return true;
    }

    @Override
    public boolean verificarLogin(String log, String sen) {
        boolean verificar;
        if ((Objects.equals(this.login, log)) && (Objects.equals(this.senha, sen))) {
            verificar = true;
        } else {
            verificar = false;
        }
        return verificar;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void Atualizar() {

    }

}

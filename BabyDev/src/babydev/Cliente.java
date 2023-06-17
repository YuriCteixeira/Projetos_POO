package babydev;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cliente extends Usuario {

    private String nomeCliente;
    private String endereco;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    

    public Cliente() {
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

    public Cliente(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    @Override
    public boolean isPermissao() {
        return false;
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

    //public String visualizarPedido()
    public void atualizarPerfil() {
        Scanner scan = new Scanner(System.in);

        System.out.println("NOME: ");
        this.nomeCliente = scan.next();
        System.out.println("LOGIN: ");
        this.login = scan.next();
        System.out.println("SENHA: ");
        this.senha = scan.next();
        System.out.println("EMAIL: ");
        this.email = scan.next();
        System.out.println("ENDEREÇO: ");
        this.endereco = scan.next();
    }
    
    public String inprimirInfo(){    
        return String.format("NOME: " + this.nomeCliente
                + " LOGIN: "  + super.login 
                + " SENHA: " + super.senha
                + " EMAIL: " + super.email 
                + " ENDEREÇO: " + this.endereco);
    }
    
    public String visualizarPedidos(){     
        return String.format(login);
    }    

    public void adicionarPedido(Pedido novoPedido) {        
    }

}

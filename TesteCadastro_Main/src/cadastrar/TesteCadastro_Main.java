package cadastrar;

import java.util.Scanner;

public class TesteCadastro_Main {

    public static void main(String[] args) {
        CadastrarPessoa pess = new CadastrarPessoa();
        Data data_nasc1 = new Data(18, 02, 2000);
        Data data_nasc2 = new Data(01, 01, 1994);
        Data data_nasc3 = new Data(25, 10, 1972);
        Cliente cliente = new Cliente("Yuri", data_nasc1, 001);
        pess.setCadastraPessoa(cliente);
        Funcionario funcionario = new Funcionario("Jaguaribara", data_nasc2, 2150);
        pess.setCadastraPessoa(funcionario);
        Gerente gerente = new Gerente("Katja", data_nasc3, 5000, "Vendas");
        pess.setCadastraPessoa(gerente);
        pess.ImprimeCadastro();
    }
}

package babydev;

import java.util.ArrayList;
import java.util.Scanner;

public class BabyDev {

    public static void main(String[] args) {
        //OBSJETOS
        Scanner scan = new Scanner(System.in);
        Admin admin = new Admin();
        Produto prod = new Produto();
        RepositorioAdmin repo = new RepositorioAdmin();
        //ARRAYLIST
        ArrayList<Admin> administrador = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Produto> produto = new ArrayList<>();
        String nomeNovo;

        int opcaoAdm = 0;
        double novoValor;
        int opcao = 0;
        boolean verificador = false;

        administrador = repo.addAdmin();

        do {
            System.out.println("MENU");
            System.out.println("1 - Administrador");
            System.out.println("2 - Cliente");
            System.out.println("3 - Sair");
            System.out.printf("Opção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    do {
                        System.out.println("ADMINISTRADOR");
                        System.out.println("1 - Login");
                        System.out.println("2 - Cadastrar Produto");
                        System.out.println("3 - Atualizar Produto");
                        System.out.println("4 - Sair");
                        System.out.printf("Opção: ");
                        opcaoAdm = scan.nextInt();

                        if (opcaoAdm == 1) {
                            System.out.println("Login");
                            String login = scan.next();
                            admin.setLogin(login);
                            for (Admin a : administrador) {
                                if (login.equals(a.getLogin())) {
                                    verificador = true;
                                }
                            }
                            break;

                        } else if (opcaoAdm == 2) {
                            System.out.println("CADASTRAR PRODUTO");
                            System.out.println("Nome: ");
                            prod.setNome(scan.next());
                            System.out.println("Valor: ");
                            prod.setValor(scan.nextDouble());
                            produto.add(prod);
                            break;
                        } else if (opcaoAdm == 3) {
                            System.out.println("ATUALIZAR PRODUTO");
                            System.out.println("PRODUTO DISPONIVEIS");
                            for (int i = 0; i < produto.size(); i++) {
                                    
                                System.out.println((i + 1) + " - " + " Nome: " + produto.get(i).getNome() + " Valor: " + produto.get(i).getValor());
                            }
                            System.out.println("SELECIONE UM PRODUTO: ");
                            String opcaoProd = scan.next();
                            int opcaoProd2 = scan.nextInt();
                            System.out.println("O QUE DESEJA ATUALIZAR:\n1 - NOME\n2 - VALOR\nOPÇÃO: ");
                            int opcaoAtua = scan.nextInt();
                            if (opcaoAtua == 1) {
                                System.out.println("NOME: ");
                                prod.setNome(scan.next());
                                if (prod.getNome() == opcaoProd) {
                                    nomeNovo = scan.next();
                                    prod.setNome(nomeNovo);
                                }
                            }
                            if (opcaoAtua == 2) {
                                System.out.println("VALOR: ");
                                prod.setValor(scan.nextDouble());
                                if (prod.getValor() == opcaoProd2) {
                                    novoValor = scan.nextDouble();
                                    prod.setValor(novoValor);
                                }
                            }
                            break;
                        }
                    } while (opcaoAdm != 4);
            }
        } while (opcao != 3);
    }
}

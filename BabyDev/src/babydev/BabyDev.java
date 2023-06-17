package babydev;

import java.util.ArrayList;
import java.util.Scanner;

public class BabyDev {

    public static void main(String[] args) {
        //OBSJETOS;
        Scanner scan = new Scanner(System.in);
        Produto prod = new Produto();
        Admin admin = new Admin();
        Cliente clientes = new Cliente();
        CartaoCredito cartao = new CartaoCredito();
        Pedido pedido = new Pedido();

        //ARRAYLIST
        ArrayList<Usuario> usuario = new ArrayList<>();
        ArrayList<Admin> administrador = new ArrayList<>();
        ArrayList<Produto> produto = new ArrayList<>();
        String nomeNovo;

        int client = 0;
        int opcaoAdm = 0;
        int opcao = 0;
        boolean verificador = false;
        int selectPedido, qtd;
        String login, senha;

        do {
            System.out.println("*-*-*-*- MARISA BEACH -*-*-*-* ");
            System.out.println("1 - LOGIN\n2 - CADASTRO\n3 - SAIR ");
            System.out.printf("OPÇÂO: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("*-*-*-*- LOGIN -*-*-*-*");
                    System.out.printf("LOGIN: ");
                    login = scan.next();
                    System.out.printf("SENHA: ");
                    senha = scan.next();

                    if (usuario.size() == 0) {
                        System.out.println("NENHUM USUARIO CADASTRADO");
                        break;
                    }

                    boolean loginValido = false;

                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).verificarLogin(login, senha)) {
                            System.out.println("LOGIN ACEITO");
                            loginValido = true;

                            if (usuario.get(i) instanceof Admin) {
                                System.out.println("*-*-*-*- ADMINISTRADOR -*-*-*-*");
                                System.out.println("1 - CADASTRAR PRODUTO\n2 - ATUALIZAR PRODUTO");
                                System.out.printf("OPÇÃO: ");
                                opcaoAdm = scan.nextInt();

                                if (opcaoAdm == 1) {
                                    System.out.println("*-*-*-*- CADASTRO DE PRODUTO -*-*-*-*");
                                    System.out.println("QUANTOS PRODUTOS DESEJA CADASTRAR? ");
                                    int qtdProduto = scan.nextInt();

                                    for (int q = 0; q < qtdProduto; q++) {
                                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
                                        System.out.printf("NOME: ");
                                        String nome = scan.next();
                                        System.out.printf("VALOR: ");
                                        double valor = scan.nextDouble();
                                        Produto produtos = new Produto(nome, valor);
                                        produto.add(produtos);
                                    }
                                } else if (opcaoAdm == 2) {
                                    System.out.println("*-*-*-*- ATUALIZAÇÃO DE PRODUTOS -*-*-*-*");
                                    System.out.println("PRODUTOS DISPONIVEIS: ");

                                    for (int j = 0; j < produto.size(); j++) {
                                        System.out.println((j + 1) + " - " + produto.get(j).infoProduto());
                                    }

                                    System.out.printf("SELECIONE UM PRODUTO: ");
                                    int opcaoProd = scan.nextInt();

                                    if (opcaoProd > produto.size() || opcaoProd <= 0) {
                                        System.out.println("PRODUTO INVÁLIDO");
                                        break;
                                    }

                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("SELECIONE O QUE DESEJA ATUALIZAR");
                                    System.out.println("1 - NOME\n2 - VALOR");
                                    System.out.printf("OPÇÃO: ");
                                    int opcaoAtu = scan.nextInt();

                                    if (opcaoAtu == 1) {
                                        System.out.println("NOVO NOME: ");
                                        String novoNome = scan.next();
                                        produto.get(opcaoProd - 1).setNome(novoNome);
                                    } else if (opcaoAtu == 2) {
                                        System.out.println("NOVO VALOR: ");
                                        double novoValor = scan.nextDouble();
                                        produto.get(opcaoProd - 1).setValor(novoValor);
                                    }
                                }
                            } else {
                                do {
                                    System.out.println("*-*-*-*- CLIENTE -*-*-*-*");
                                    System.out.println("1 - ATUALIZAR PERFIL");
                                    System.out.println("2 - VISUALIZAR INFORMAÇÕES");
                                    System.out.println("3 - REALIZAR PEDIDOS");
                                    System.out.println("4 - VISUALIZAR PEDIDOS");
                                    System.out.println("5 - CADASTRAR CARTÕES");
                                    System.out.println("6 - EMITIR NOTA FISCAL");
                                    System.out.println("7 - SAIR");
                                    System.out.println("OPÇÃO: ");
                                    int opcaoClient = scan.nextInt();
                                    usuario.add(clientes);
                                    switch (opcaoClient) {
                                        case 1:
                                            System.out.println("*-*-*-*- ATUALIZAR PERFIL -*-*-*-*");
                                            clientes.atualizarPerfil();
                                            break;
                                        case 2:
                                            System.out.println("*-*-*-*- VISUALIZAR INFORMAÇÕES -*-*-*-*");
                                            System.out.println(clientes.inprimirInfo());
                                            break;
                                        case 3:
                                            System.out.println("*-*-*-*- REALIZAR PEDIDO -*-*-*-*");
                                            System.out.println("PRODUTOS DISPONÍVEIS");
                                            for (int j = 0; j < produto.size(); j++) {
                                                System.out.println((j + 1) + " - " + produto.get(j).infoProduto());
                                            }
                                            System.out.printf("SELECIONE UM PRODUTO: ");
                                            selectPedido = scan.nextInt();
                                            System.out.println("QUANTOS DESEJA: ");
                                            qtd = scan.nextInt();                                            
                                            if (selectPedido > 0 && selectPedido <= produto.size()) {
                                                Produto produtoSelecionado = produto.get(selectPedido - 1);
                                                System.out.println("PRODUTO ADICIONADO AO CARRINHO.");
                                            } else {
                                                System.out.println("PRODUTO INVALIDO.");
                                            }
                                            System.out.println("SELECIONE A FORMA DE PAGAMENTO\n1 - Cartão 1x\n2 - Cartão 2x\n 3 - Pix");
                                            System.out.printf("OPÇÃO: ");
                                            int opcaoPag = scan.nextInt();
                                            break;
                                        case 4:
                                            System.out.println("*-*-*-*- VISUALIZAR PEDIDO -*-*-*-*");
                                            System.out.println(" PEDIDOS EFETUADOS");
                                            System.out.println();
                                            System.out.println("");
                                            break;
                                        case 5:
                                            System.out.println("*-*-*-*- CADASTRAR CARTÕES -*-*-*-*");
                                            System.out.println("TITULAR: ");
                                            cartao.setTitular(scan.next());
                                            System.out.println("NUMERO: ");
                                            cartao.setNumero(scan.next());
                                            System.out.println("DATA VENCIMENTO: ");
                                            cartao.setDtValidade(scan.next());
                                            System.out.println("CCV: ");
                                            cartao.setCcv(scan.next());
                                            break;
                                        case 6:
                                            System.out.println("*-*-*-*-*-*-*-* NOTA FISCAL -*-*-*-*-*-*-*-*");
                                            pedido.imprimirInfo();
                                    }
                                } while (client != 7);
                            }
                        }
                    }

                    if (!loginValido) {
                        System.out.println("CONTA INEXISTENTE");
                    }

                    break;
                case 2:
                    System.out.println("*-*-*-*- CADASTRO -*-*-*-*");
                    System.out.println("1 - ADMINISTRADOR\n2 - CLIENTE");
                    System.out.printf("OPÇÃO: ");
                    int opcaoAtua = scan.nextInt();

                    if (opcaoAtua == 1) {
                        System.out.println("------ ADMINISTRADOR -------");
                        System.out.printf("NOME: ");
                        admin.setNomeAdmin(scan.next());
                        System.out.printf("LOGIN: ");
                        admin.setLogin(scan.next());
                        System.out.printf("EMAIL: ");
                        admin.setEmail(scan.next());
                        System.out.printf("SENHA: ");
                        admin.setSenha(scan.next());
                        usuario.add(admin);
                    } else if (opcaoAtua == 2) {
                        Cliente cliente = new Cliente();
                        System.out.println("------ CLIENTE -------");
                        System.out.printf("NOME: ");
                        cliente.setNomeCliente(scan.next());
                        System.out.printf("LOGIN: ");
                        cliente.setLogin(scan.next());
                        System.out.printf("EMAIL: ");
                        cliente.setEmail(scan.next());
                        System.out.printf("SENHA: ");
                        cliente.setSenha(scan.next());
                        System.out.printf("ENDEREÇO: ");
                        cliente.setEndereco(scan.next());
                        usuario.add(cliente);
                    }
                    break;
            }

        } while (opcao != 3);
    }
}

/*Yuri Carvalho Teixeira*/
package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto tipo ContaBancaria e referenciando na variavel contabancaria1//
        Conta_bancaria contaBancaria1 = new Conta_bancaria();
        Conta_bancaria contaBancaria5 = new Conta_bancaria();
        usuario user1 = new usuario();
        /* Uso nas versões mais atuais da jdk
       var contaBancaria1 = new Conta_bancaria();
       
        
        //Atribuindo valores ao objeto//
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "15345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        System.out.println(contaBancaria1.agencia+"\n"
             + contaBancaria1.conta +"\n"
             + contaBancaria1.proprietario +"\n"
             + contaBancaria1.saldo);
         

        Scanner input = new Scanner(System.in);
        System.out.println("--Bem-vindo(a) ao Banco do Brasil--");
        System.out.println("Cadastro de Contas");
        System.out.println("Digite a agência:");
        contaBancaria1.setagencia(input.next());
        System.out.println("Digite a conta:");
        contaBancaria1.setconta(input.next());
        //Construção e inserção de dados do usuário
        System.out.println("--Dados do Usuário--");
        System.out.println("Digite o nome do cliente:");
        user1.setnome(input.next());
        System.out.println("Digite o sobrenome do cliente:");
        user1.setsobrenome(input.next());
        System.out.println("Digite o telefone do cliente:");
        user1.settelefone(input.next());
        contaBancaria1.setagencia(input.next());
        System.out.println("Digite o saldo inicial:");
        contaBancaria1.setsaldo(input.nextDouble());
        System.out.println("Digite o valor de depósito:");
        contaBancaria1.depositar(input.nextDouble());
        System.out.println(contaBancaria1.agencia + "\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimir_info() + "\n"
                + contaBancaria1.consultar_saldo());
        System.out.println("Digite um valor para saque:");
        contaBancaria1.sacar(input.nextDouble());
        System.out.println(contaBancaria1.consultar_saldo());
         */
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        usuario user;
        usuario[] users = new usuario[5];
        Conta_bancaria conta = new Conta_bancaria();

        while (opcao != 3) {
            //1ª Tela

            System.out.println("Banco Brasil");
            System.out.println("1 - Cadastro de cliente");
            System.out.println("2 - Cadastro de conta");
            System.out.println("3 - Sair");
            System.out.println("Escolha 1 opção:");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        user = new usuario();
                        System.out.println("***CADASTRO CLIENTE***");
                        System.out.println(" Nome:");
                        user.setnome(input.next());
                        System.out.println("Sobrenome:");
                        user.setsobrenome(input.next());
                        System.out.println("Telefone:");
                        user.settelefone(input.next());
                        System.out.println("1- " + user.getnome());
                        users[i] = user;
                    }
                    break;
                case 2:
                    user = new usuario();
                    System.out.println("***CADASTRO CONTA***");
                    System.out.println("Agência:");
                    conta.setagencia(input.next());
                    System.out.println("Conta:");
                    conta.setconta(input.next());
                    System.out.println("Clientes cadastrados:");
                    if (users[0] == null) {
                        System.out.println("Vetor vazio");
                    } else {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(i + "- " + users[i].getnome() + " " + users[i].getsobrenome());
                        }
                        System.out.println("Selecione o cliente: ");
                        int userOpcao = input.nextInt();
                        if (userOpcao == 1) {
                            conta.setproprietario(users[userOpcao - 1]);
                            System.out.println("Digite o saldo inicial:");
                            conta.setsaldo(input.nextDouble());
                            System.out.println("Digite o valor de depósito:");
                            conta.depositar(input.nextDouble());
                        } else {
                            System.out.println("Usuário não cadastrado");
                        }
                        break;

                    }
                case 3:
                    System.out.println("***SEE YA!***");
                    break;
                default:
                    System.out.println("***OPÇÃO INVÁLIDA***");

            }

        }
    }

}

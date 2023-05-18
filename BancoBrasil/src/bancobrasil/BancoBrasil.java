/*Yuri Carvalho Teixeira*/
package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto tipo ContaBancaria e referenciando na variavel contabancaria1//
        Conta_bancaria contaBancaria1 = new Conta_bancaria();
        Conta_bancaria contaBancaria2 = new Conta_bancaria();
        usuario user1 = new usuario();
        /* Uso nas versões mais atuais da jdk
       var contaBancaria1 = new Conta_bancaria();
       
        
        //Atribuindo valores ao objeto//
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        System.out.println(contaBancaria1.agencia+"\n"
             + contaBancaria1.conta +"\n"
             + contaBancaria1.proprietario +"\n"
             + contaBancaria1.saldo);
         */

        Scanner input = new Scanner(System.in);
        System.out.println("--Bem-vindo(a) ao Banco do Brasil--");
        System.out.println("Cadastro de Contas");
        System.out.println("Digite a agência:");
        contaBancaria1.agencia = input.next();
        System.out.println("Digite a conta:");
        contaBancaria1.conta = input.next();
        //Construção e inserção de dados do usuário
        System.out.println("--Dados do Usuário--");
        System.out.println("Digite o nome do cliente:");
        user1.nome = input.next();
        System.out.println("Digite o sobrenome do cliente:");
        user1.sobrenome = input.next();
        System.out.println("Digite o telefone do cliente:");
        user1.telefone = input.next();
        contaBancaria1.proprietario = user1;
        System.out.println("Digite o saldo inicial:");
        contaBancaria1.saldo = input.nextDouble();
        System.out.println("Digite o valor de depósito:");
        contaBancaria1.depositar(input.nextDouble());
        System.out.println(contaBancaria1.agencia + "\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimir_info() + "\n"
                + contaBancaria1.consultar_saldo());
        System.out.println("Digite um valor para saque:");
        contaBancaria1.sacar(input.nextDouble());
        System.out.println(contaBancaria1.consultar_saldo());
    }

}

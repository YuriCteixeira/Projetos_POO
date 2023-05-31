package atividade_loja;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> carrinho = new ArrayList<>();
        
        
        String descricao, tipo, autor, opcao = "0";
        do {
            System.out.println("O que deseja pedir?");
            System.out.println("1- Mouse");
            System.out.println("2- Livro");
            System.out.println("3- Sair");
            opcao = input.next();
            if (opcao == "3"){
                break;
            }
            switch (opcao) {
                case "1":
                    System.out.println("Informe a descrição do produto escolhido");
                    descricao = input.next();
                    System.out.println("Informe o tipo do produto escolhido");
                    tipo = input.next();
                    Mouse mouse = new Mouse(descricao, tipo);
                    carrinho.add(mouse);
                    break;

                case "2":
                    System.out.println("Informe a descrição do produto escolhido");
                    descricao = input.next();
                    System.out.println("Informe o autor do livro escolhido");
                    autor = input.next();
                    Livro livro = new Livro(descricao, autor);
                    carrinho.add(livro);
                    break;
                
            }
            
        } while (opcao != "3");
       
               
        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }
}

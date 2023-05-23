package testearraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteArrayList {

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList();
            System.out.printf("Size: %d\n", names.size());
            names.add("Yuri");
            names.add("João");
            names.add("Fátima");
            System.out.printf("Size: %d\n", names.size());
            for(String i : names){
                System.out.println(i);
            }
            //Operador ternário
            System.out.printf("O aluno Yuri %s está na lista", names.contains("Yuri") ? "" : "Não");
            if(names.contains("Yuri"))
                System.out.println("\nO aluno está na lista!");
            else
                System.out.println("\nO aluno não está na lista!");
            
            int cont = 1;
            for(String i :names){
                System.out.println(cont + "-" + i);
                cont++;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Qual cliente deseja deletar?");
            int opcao =input.nextInt();
            names.remove(opcao-1);
            for(String i :names){
                System.out.println(i);
                cont++;
            }
            
    }
    
}

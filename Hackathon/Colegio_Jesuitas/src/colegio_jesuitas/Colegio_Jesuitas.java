
package colegio_jesuitas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio_Jesuitas {

    public static void main(String[] args) {
        
        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Turma> turma = new ArrayList<>();
        ArrayList<Notas> notas = new ArrayList<>();
        ArrayList<Alunos_turma> alunos_turma = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        do{
        
            System.out.println("* * * * * *   E S C O L A   J E S U Í T A S   * * * * * * ");
            System.out.println("");
            System.out.println("M E N U   P R I N C I P A L");
            System.out.println("");        
            System.out.println("Selecione a operaçãodesejada");
            System.out.println("");
            System.out.println("1. Cadastro de Turmas");
            System.out.println("2. Cadastro de Alunos");
            System.out.println("3. Cadastro de Notas");
            System.out.println("4. Emitir Relatório");
            System.out.println("0. Sair do Sistema");
            System.out.println("");
            System.out.print("Sua opção: ");
            String opc = input.next();
            
            if(opc.equals("0")){
                System.out.println("Finalizando o sistema... Bye!");
                break;
            }
            
            switch (opc){
                case "1":
                                        
                    System.out.println("# # # #   C A D A S T R O   D E   T U R M A S   # # # # ");
                    
                    do{
                        
                        Turma t = new Turma();
                        
                        System.out.println("");
                        System.out.println("Id. Turma ou [000} para sair: ");
                        String tur = input.next();

                        if(tur.equals("000")){
                            System.out.println("Saindo do Cadastro de Turmas:");
                            break;
                        } 
                        
                        boolean exist = false;
                        for(Turma trm: turma){
                            if(trm.getIdTurma().equals(tur)){
                                System.out.println("Turma já existe!!");
                                exist = true;
                                break;
                            }
                        }
                                              
                        if(!exist){                          
                                                   
                            t.setIdTurma(tur);

                            input.nextLine();
                            System.out.println("Descrição da Turma..........: ");
                            t.setNomeTurma(input.nextLine());

                            turma.add(t);

                            System.out.println("Turma cadastrada!");
                            System.out.println("");
                        }
                        
                    }while(true);
                                    
                    break;
                case "2":

                    System.out.println("# # # #   C A D A S T R O   D E   A L U N O S   # # # # ");
                    
                    if(turma.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de turmas vazio! Cadastre turmas...");
                        continue;
                    }
                    
                    do{
                        
                        Aluno al = new Aluno();
                                   
                        System.out.println("");
                        System.out.println("Matricula ou [000} para sair: ");
                        String mat = input.next();

                        if(mat.equals("000")){
                            System.out.println("Saindo do Cadastro de Alunos:");
                            break;
                        }
                      
                        boolean exist = false;
                        for(Aluno a: aluno){
                            if(a.getIdAluno().equals(mat)){
                                System.out.println("Matricula já em uso!!");
                                exist = true;
                                break;
                            }
                        }
                                              
                        if(!exist){                          
                                                        
                            al.setIdAluno(mat);

                            input.nextLine();
                            System.out.println("Nome completo...............:");
                            al.setNome(input.nextLine());

                        }else{
                            continue;
                        }                      
                        
                        System.out.println("TURMAS DISPONIVEIS");
                        int seq = 1;
                        for(Turma trm: turma){
                            System.out.printf("%d. %s %s \n", seq++, trm.getIdTurma(), trm.getNomeTurma());
                        }
                        
                        System.out.println("");
                        System.out.println("Informe o numero da turma: ");
                        int num = input.nextInt();
                        
                        if(num>=seq || num < 1){
                            System.out.println("Referencia de turma inválida");
                            continue;
                        }else{
                                                       
                            aluno.add(al);
                            
                            String nt = turma.get(num-1).getIdTurma();
                            
                            Alunos_turma a_t = new Alunos_turma();
                            
                            a_t.setIdAluno(mat);
                            a_t.setIdTurma(nt);
                                                        
                            alunos_turma.add(a_t);
                            
                        }
                                              
                        System.out.println("Aluno cadastrado com SUCESSO!");                                
                        
                    }while(true);

                    break;
                case "3":
                    
                    if(turma.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de turmas vazio! Cadastre turmas...");
                        continue;
                    }
                    
                    if(aluno.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de alunos vazio! Cadastre alunos...");
                        continue;
                    }
                                      
                    System.out.println("# # # #   C A D A S T R O   D E   N O T A S   # # # # ");
                    
                    do{
                        
                        Notas nota = new Notas();
                        
                        System.out.println("");
                        System.out.println("Id. do Aluno ou [000] para sair: ");
                        String mat = input.next();
                        
                        if(mat.equals("000")){
                            System.out.println("Saindo do Cadastro de Notas...");
                            break;
                        }
                        
                        boolean exist = false;
                        for(Aluno a: aluno){
                            if(a.getIdAluno().equals(mat)){
                                System.out.print(a.getNome());
                                exist = true;
                            }
                        }
                        
                        if(!exist){
                            System.out.println("Matricula ENEXISTENTE!!!");
                            continue;
                        }
                        
                        exist = false;
                        for(Notas n : notas){
                            if(n.getIdAluno().equals(mat)){
                                exist = true;
                                System.out.println("Notas já cadastradas!");
                                break;
                            }
                        }
                        
                        if(!exist){
                            nota.setIdAluno(mat);
                            System.out.println("Digite a primeira nota: ");
                            nota.setNota1(input.nextDouble());
                            System.out.println("Digite a segunda nota.: ");
                            nota.setNota2(input.nextDouble());
                            System.out.println("Digite a terceira nota: ");
                            nota.setNota3(input.nextDouble());
                            System.out.println("Média final do aluno..:");
                            System.out.printf("%.2f\n", nota.calculaMedia( nota.getNota1(), nota.getNota2(), nota.getNota3()));                                                     
                        }
                        
                        notas.add(nota);
                        
                        System.out.println("Notas cadastradas com SUCESSO!!!");
                        
                    }while (true);
                                        
                    break;
                case "4":
                    
                    if(turma.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de turmas vazio! Cadastre turmas...");
                        continue;
                    }
                    
                    if(aluno.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de alunos vazio! Cadastre alunos...");
                        continue;
                    }
                    
                    if(alunos_turma.isEmpty()){
                        System.out.println("");
                        System.out.println("Cadastro de alunos por turma vazio! Cadastre!!!");
                        continue;
                    }
                    
                    System.out.println("# # # #   E M I S S Ã O   D E   R E L A T Ó R I O   # # # # ");
                    
                    do{
                               
                        System.out.println("");
                        System.out.println("1. Relatorio de Alunos por Turma");
                        System.out.println("");
                        System.out.println("2. Relatorio de Aluno (alfabetica)");
                        System.out.println("");
                        System.out.println("0. Sair");
                        System.out.println("Informe o tipo de Relatório ou 0 para sair:");
                        String rel = input.next();
                        
                        if(rel.equals("0")){
                            System.out.println("Encerrando emissão de relatórios...");
                            break;
                        }
                                                                 
                        switch (rel){
                            case "1":
                                
                                System.out.println("R E L A T O R I O   D E   A L U N O S   P O R   T U R M A ");
                                System.out.println("");
                                System.out.println("Informe a Turma a imprimir ou 0 para Sair:");
                                String t = input.next();
                                
                                if(t.equals("0")){
                                    System.out.println("Retornando ao menu de relatórios...");
                                    break;
                                }
                                
                                boolean exist = false;
                                for(Turma trm: turma){
                                    if(trm.getIdTurma().equals(t)){
                                        exist = true;
                                        break;
                                    }
                                }
                                
                                if(!exist){
                                    System.out.println("Turma INEXISTENTE!!");
                                    continue;
                                }
                                
                                System.out.println("");
                                System.out.println("* * * * * *   E S C O L A   J E S U Í T A S   * * * * * * ");
                                System.out.println("");
                                System.out.println("R E L A T O R I O   D E   A L U N O S   P O R   T U R M A ");
                                System.out.println("");
                                
                                int seq = 1;
                                for(Alunos_turma at: alunos_turma){
                                                                        
                                    if(seq==1){
                                        System.out.println("Turma >>>>>> " + at.getIdTurma());
                                    }
                                    
                                    System.out.println("--------------------------------------------------------------------");
                                    
                                    if(at.getIdTurma().equals(t)){
                                        System.out.printf("%d. %s", seq++, at.getIdAluno());
                                        
                                        for(Aluno a: aluno){
                                            if(a.getIdAluno().equals(at.getIdAluno())){
                                                System.out.printf(" %s %s",a.getNome(), at.getIdTurma());
                                                
                                                for(Notas n : notas){
                                                    if(n.getIdAluno().equals(a.getIdAluno())){
                                                        double media = n.calculaMedia(n.getNota1(), n.getNota2(), n.getNota3());
                                                        System.out.printf("Prv 1: %.2f Prv 2: %.2f Prv 3: %.2f Media: %.2f %s\n", n.getNota1(), n.getNota2(), 
                                                                n.getNota3(), media, n.resultado(media));                                                        
                                                        System.out.println("--------------------------------------------------------------------");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                                             
                                System.out.println("");
                                                                
                                break;
                            case "2":
                                break;
                            default:
                        
                        }
                                        
                        
                        System.out.println("");
                    }while (true);
                    
                    break;
                default:
                    System.out.println("Selecione uma operação válida!");
               
            }
            
        }while (true);
        
    }
    
}

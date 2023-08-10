package Controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Professor;
import util.Input;

public class CadastroProfessor {
     private static ArrayList<Professor> Professores = new ArrayList<>();
    
    public CadastroProfessor(){
    
    }
    
    public static void setarDados(Professor pro){
        CadastroFuncionario.setarDados(pro);
        System.out.println("Qual a sua formacao?");
        pro.setFormacao(Input.nextLine());

    }
    
    public static void cadastrarProfessor(){
    Professor professor = new Professor();
    setarDados(professor);
    Professores.add(professor);
    }
    
    public static ArrayList<Professor> pesquisarProfessor(){
        ArrayList<Professor> resultado = new ArrayList<>();
        System.out.println("\nInforme 1 para pesquisar por CPF"
        + "\n Informe 2 para pesquisar por Nome");
        int op = Input.nextInt();
        String pesquisa = "";
        if (op == 1){
            System.out.println("Informe qual o CPF a ser pesquisado");
            pesquisa = Input.nextLine();
        }else{
            System.out.println("Informe o nome");
        }
        for (Professor professor : Professores){
            if(op == 1){
                if(professor.getCPF().contains(pesquisa)){
                   resultado.add(professor); 
                }
            }else{
                if(professor.getNome().toLowerCase().contains(pesquisa));
                    resultado.add(professor); 
            } 
        }
        return resultado;
    }
    
    public static void exibirProfessor(ArrayList<Professor> Professores){
        for (Professor professor : Professores){
            System.out.println(professor);
        }
    }
    
    public static void removerProfessor(){
        System.out.println("Informe o cpf que deseja remover:");
        String cpfPesquisa = Input.nextLine();
        Professor proRemove = null;
        for(Professor professor : Professores){
            if(professor.getCPF().equals(cpfPesquisa));{
                proRemove = professor;
            }
        }
        if(proRemove == null){
            System.out.println("Professor não foi encontrada!");
        }else{
            Professores.remove(proRemove);
        }
    
    }
    
    public static void listarProfessor(){
        if(Professores.isEmpty()){
            System.out.println("Não há Professores cadastradas no sistema");
            return;
        }
        
        System.out.println("Informe 1 para Crescente " 
                           +  "\nInforme 2 para Decrescente");
        int op = Input.nextInt();
        if(op == 1){
            Collections.sort(Professores);
        }
        else{
            Collections.sort(Professores, Collections.reverseOrder());
            //Collections.reverse(Pessoas);
        }
        
        for (Professor Professor : Professores) {
            Professor.exibirInformacoes();
        }
    }
    
}

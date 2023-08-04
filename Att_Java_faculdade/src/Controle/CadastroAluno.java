package Controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Aluno;
import util.Input;

public class CadastroAluno {
    private static ArrayList<Aluno> Alunos = new ArrayList<>();

    public static void CadastrarAluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CadastroAluno(){

    }
    
    public static void setarDados(Aluno al){
        System.out.println("Qual o seu RA?");
        al.setRa(Input.nextLine());
        System.out.println("Qual o seu curso?");
        al.setCurso(Input.nextLine());
        System.out.println("Qual a data da matrícula?");
        al.setDataMatricula(Input.nextLocalDate());
        System.out.println("Qual a situação do curso?");
        al.setSituacao(Input.nextLine());
    }
    
    public static void cadastrarAluno(){
        Aluno aluno = new Aluno();
        setarDados(aluno);
        Alunos.add(aluno);
    }
    
    public static ArrayList<Aluno> pesquisarAluno(){
        ArrayList<Aluno> resultado = new ArrayList<>();
        System.out.println("\nInforme 1 para pesquisar por CPF"
        + "\n Informe 2 para pesquisar por Nome");
        int op = Input.nextInt();
        String pesquisa = "";
        if (op == 1){
            System.out.println("Informe qual o CPF do aluno");
            pesquisa = Input.nextLine();
        }else{
            System.out.println("Informe o nome do aluno");
        }
        for (Aluno aluno : Alunos){
            if(op == 1){
                if(aluno.getCPF().contains(pesquisa)){
                   resultado.add(aluno); 
                }
            }else{
                if(aluno.getNome().toLowerCase().contains(pesquisa));
                    resultado.add(aluno); 
            } 
        }
        return resultado;
    }
    
    public static void exibir(ArrayList<Aluno> alunos){
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
    
    public static void removerAluno(){
        System.out.println("Informe o RA que deseja remover:");
        String raPesquisa = Input.nextLine();
        Aluno aRemove = null;
        for(Aluno aluno : Alunos){
            if(aluno.getRA().equals(raPesquisa));{
                aRemove = aluno;
            }
        }
        if(aRemove == null){
            System.out.println("Aluno não foi encontrada!");
        }else{
            Alunos.remove(aRemove);
        }
    
    }
    
    public static void listarAlunos(){
        if(Alunos.isEmpty()){
            System.out.println("Não há alunos cadastradas no sistema");
            return;
        }
        
        System.out.println("Informe 1 para Crescente " 
                           +  "\nInforme 2 para Decrescente");
        int op = Input.nextInt();
        if(op == 1){
            Collections.sort(Alunos);
        }
        else{
            Collections.sort(Alunos, Collections.reverseOrder());
            //Collections.reverse(Pessoas);
        }
        
        for (Aluno Aluno : Alunos) {
            Aluno.exibirInformacoes();
        }
    }
    
}

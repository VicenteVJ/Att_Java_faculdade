package Controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Curso;
import util.Input;

public class CadastroCurso {
    private static ArrayList<Curso> Cursos = new ArrayList<>();

    public CadastroCurso(){

    }
    
    public static void setarDados(Curso cur){
        System.out.println("Qual o nome do Curso?");
        cur.setNome(Input.nextLine());
        System.out.println("Qual a carga horária?");
        cur.setCargaHoraria(Input.nextInt());
        System.out.println("Quantos semetres?");
        cur.setQtdSemestres(Input.nextInt());
        
    }
    
    public static void cadastrarCurso(){
        Curso curso = new Curso();
        setarDados(curso);
        Cursos.add(curso);
    }
    
    public static ArrayList<Curso> pesquisarCurso(){
        ArrayList<Curso> resultado = new ArrayList<>();
        System.out.println("\n Informe o nome do Curso: ");
        String pesquisa = "";
        pesquisa = Input.nextLine();
        for (Curso curso : Cursos){
        if(curso.getNome().toLowerCase().contains(pesquisa));
        resultado.add(curso); 
           
        }
        return resultado;
    }
    
    public static void exibirCurso(ArrayList<Curso> cursos){
        for (Curso curso : cursos){
            System.out.println(curso);
        }
    }
    
    public static void removerCurso(){
        System.out.println("Informe o nome do curso que deseja remover:");
        String namePesquisa = Input.nextLine();
        Curso curRemove = null;
        for(Curso curso : Cursos){
            if(curso.getNome().equals(namePesquisa));{
                curRemove = curso;
            }
        }
        if(curRemove == null){
            System.out.println("Aluno não foi encontrada!");
        }else{
            Cursos.remove(curRemove);
        }
    
    }
    
    public static void listarCursos(){
        if(Cursos.isEmpty()){
            System.out.println("Não há cursos cadastradas no sistema");
            return;
        }
        
        System.out.println("Informe 1 para Crescente " 
                           +  "\nInforme 2 para Decrescente");
        int op = Input.nextInt();
        if(op == 1){
            Collections.sort(Cursos);
        }
        else{
            Collections.sort(Cursos, Collections.reverseOrder());
            //Collections.reverse(Pessoas);   
        }
        for (Curso Curso : Cursos) {
            Curso.exibirInformacoes();
           } 
    }
    
}

package Controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Funcionario;
import util.Input;

public class CadastroFuncionario {
    private static ArrayList<Funcionario> Funcionarios = new ArrayList<>();
    
    public CadastroFuncionario(){
    
    }
    
    public static void setarDados(Funcionario fun){
        CadastroPessoa.setarDados(fun);
        System.out.println("Qual o seu CTPS?");
        fun.setCtps(Input.nextLine());
        System.out.println("Qual o seu sálario?");
        fun.setSalario(Input.nextDouble());  
    }
    
    public static void cadastrarFuncionario(){
    Funcionario funcionario = new Funcionario();
    setarDados(funcionario);
    Funcionarios.add(funcionario);
    }
    
    public static ArrayList<Funcionario> pesquisarFuncionario(){
        ArrayList<Funcionario> resultado = new ArrayList<>();
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
        for (Funcionario funcionario : Funcionarios){
            if(op == 1){
                if(funcionario.getCPF().contains(pesquisa)){
                   resultado.add(funcionario); 
                }
            }else{
                if(funcionario.getNome().toLowerCase().contains(pesquisa));
                    resultado.add(funcionario); 
            } 
        }
        return resultado;
    }
    
    public static void exibirFuncionario(ArrayList<Funcionario> funcionarios){
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }
    
    public static void removerFuncionario(){
        System.out.println("Informe o cpf que deseja remover:");
        String cpfPesquisa = Input.nextLine();
        Funcionario funRemove = null;
        for(Funcionario funcionario : Funcionarios){
            if(funcionario.getCPF().equals(cpfPesquisa));{
                funRemove = funcionario;
            }
        }
        if(funRemove == null){
            System.out.println("Funcionario não foi encontrada!");
        }else{
            Funcionarios.remove(funRemove);
        }
    
    }
    
    public static void listarFuncionarios(){
        if(Funcionarios.isEmpty()){
            System.out.println("Não há funcionários cadastradas no sistema");
            return;
        }
        
        System.out.println("Informe 1 para Crescente " 
                           +  "\nInforme 2 para Decrescente");
        int op = Input.nextInt();
        if(op == 1){
            Collections.sort(Funcionarios);
        }
        else{
            Collections.sort(Funcionarios, Collections.reverseOrder());
            //Collections.reverse(Pessoas);
        }
        
        for (Funcionario Funcionario : Funcionarios) {
            Funcionario.exibirInformacoes();
        }
    }
    
}

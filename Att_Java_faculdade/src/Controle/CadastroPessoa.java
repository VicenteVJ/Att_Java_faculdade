package Controle;

import util.Input;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Pessoa;

public class CadastroPessoa {
    private static ArrayList<Pessoa> Pessoas = new ArrayList<>();
    
    public CadastroPessoa(){
        
    }
    
    public static void setarDados(Pessoa p){
        System.out.println("Qual o seu nome?");
        p.setNome(Input.nextLine());
        System.out.println("Qual seu cpf?");
        p.setCPF(Input.nextLine());
        System.out.println("Qual a data de nascimento?");
        p.setDataNascimento(Input.nextLocalDate());
        
        System.out.println("Informe a cidade:");
        p.getEndereco().setCidade(Input.nextLine());
        System.out.println("informe a rua");
        p.getEndereco().setRua(Input.nextLine());
        System.out.println("Informe a número:");
        p.getEndereco().setNumero(Input.nextInt());
    }
    
    public static void cadastrar(){
        Pessoa pessoa = new Pessoa();
        setarDados(pessoa);
        Pessoas.add(pessoa);
}
    
    public static ArrayList<Pessoa> pesquisar(){
        ArrayList<Pessoa> resultado = new ArrayList<>();
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
        for (Pessoa pessoa : Pessoas){
            if(op == 1){
                if(pessoa.getCPF().contains(pesquisa)){
                   resultado.add(pessoa); 
                }
            }else{
                if(pessoa.getNome().toLowerCase().contains(pesquisa));
                    resultado.add(pessoa); 
            } 
        }
        return resultado;
    }
    
    public static void exibir(ArrayList<Pessoa> pessoas){
        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
    
    public static void remover(){
        System.out.println("Informe o cpf que deseja remover:");
        String cpfPesquisa = Input.nextLine();
        Pessoa pRemove = null;
        for(Pessoa pessoa : Pessoas){
            if(pessoa.getCPF().equals(cpfPesquisa));{
                pRemove = pessoa;
            }
        }
        if(pRemove == null){
            System.out.println("Pessoa não foi encontrada!");
        }else{
            Pessoas.remove(pRemove);
        }
    
    }
    
    public static void listarPessoas(){
        if(Pessoas.isEmpty()){
            System.out.println("Não há pessoas cadastradas no sistema");
            return;
        }
        
        System.out.println("Informe 1 para Crescente " 
                           +  "\nInforme 2 para Decrescente");
        int op = Input.nextInt();
        if(op == 1){
            Collections.sort(Pessoas);
        }
        else{
            Collections.sort(Pessoas, Collections.reverseOrder());
            //Collections.reverse(Pessoas);
        }
        
        for (Pessoa Pessoa : Pessoas) {
            Pessoa.exibirInformacoes();
        }
    }
    
}

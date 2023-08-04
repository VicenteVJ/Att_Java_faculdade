package Controle;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Aluno;
import util.Input;

public class CadastroAluno {

    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public CadastroAluno() {

    }

    public static void setarDados(Aluno aluno) {
        System.out.println("Qual o seu RA?");
        aluno.setRa(Input.nextLine());
        System.out.println("Qual o seu curso?");
        aluno.setCurso(Input.nextLine());
        System.out.println("Qual a data da matrícula?");
        aluno.setDataMatricula(Input.nextLocalDate());
        System.out.println("Qual a situação do curso?");
        aluno.setSituacao(Input.nextLine());
    }

    public static void cadastrarAluno() {
        Aluno aluno = new Aluno();
        setarDados(aluno);
        alunos.add(aluno);
    }

    public static ArrayList<Aluno> pesquisarAluno() {
        ArrayList<Aluno> resultado = new ArrayList<>();
        System.out.println("\nInforme 1 para pesquisar por CPF"
                + "\n Informe 2 para pesquisar por Nome");
        int op = Input.nextInt();
        String pesquisa = "";
        if (op == 1) {
            System.out.println("Informe qual o CPF do aluno");
            pesquisa = Input.nextLine();
        } else {
            System.out.println("Informe o nome do aluno");
            pesquisa = Input.nextLine();
        }
        for (Aluno aluno : alunos) {
            if (op == 1) {
                if (aluno.getCPF().contains(pesquisa)) {
                    resultado.add(aluno);
                }
            } else {
                if (aluno.getNome().toLowerCase().contains(pesquisa)) {
                    resultado.add(aluno);
                }
            }
        }
        return resultado;
    }

    public static void exibir(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
    }

    public static void removerAluno() {
        System.out.println("Informe o RA que deseja remover:");
        String raPesquisa = Input.nextLine();
        Aluno aRemove = null;
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(raPesquisa)) {
                aRemove = aluno;
                break;
            }
        }
        if (aRemove == null) {
            System.out.println("Aluno não foi encontrado!");
        } else {
            alunos.remove(aRemove);
            System.out.println("Aluno removido com sucesso!");
        }
    
    }
}
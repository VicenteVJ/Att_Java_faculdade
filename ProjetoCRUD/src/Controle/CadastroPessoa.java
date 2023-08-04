package Controle;

import util.Input;
import java.util.ArrayList;
import modelo.Pessoa;

public class CadastroPessoa {

    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public CadastroPessoa() {

    }

    public static void setarDados(Pessoa p) {
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

    public static void cadastrar() {
        Pessoa pessoa = new Pessoa();
        setarDados(pessoa);
        pessoas.add(pessoa);
    }

    public static ArrayList<Pessoa> pesquisar() {
        ArrayList<Pessoa> resultado = new ArrayList<>();
        System.out.println("\nInforme 1 para pesquisar por CPF"
                + "\n Informe 2 para pesquisar por Nome");
        int op = Input.nextInt();
        String pesquisa = "";
        if (op == 1) {
            System.out.println("Informe qual o CPF a ser pesquisado");
            pesquisa = Input.nextLine();
        } else {
            System.out.println("Informe o nome");
            pesquisa = Input.nextLine();
        }
        for (Pessoa pessoa : pessoas) {
            if (op == 1) {
                if (pessoa.getCPF().contains(pesquisa)) {
                    resultado.add(pessoa);
                }
            } else {
                if (pessoa.getNome().toLowerCase().contains(pesquisa)) {
                    resultado.add(pessoa);
                }
            }
        }
        return resultado;
    }

    public static void exibir(ArrayList<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
        }
    }

    public static void remover() {
        System.out.println("Informe o cpf que deseja remover:");
        String cpfPesquisa = Input.nextLine();
        Pessoa pRemove = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCPF().equals(cpfPesquisa)) {
                pRemove = pessoa;
                break;
            }
        }
        if (pRemove == null) {
            System.out.println("Pessoa não foi encontrada!");
        } else {
            pessoas.remove(pRemove);
            System.out.println("Pessoa removida com sucesso!");
        }

    }
}

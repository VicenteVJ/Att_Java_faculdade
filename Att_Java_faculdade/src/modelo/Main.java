package modelo;

import Controle.CadastroAluno;
import Controle.CadastroPessoa;
import util.Input;

public class Main {

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Remover Pessoa");
            System.out.println("4 - Cadastrar Aluno");
            System.out.println("5 - Listar Alunos");
            System.out.println("6 - Remover Aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Input.nextInt();
            Input.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("=== Cadastro de Pessoas ===");
                    CadastroPessoa.cadastrar();
                    break;
                case 2:
                    System.out.println("=== Lista de Pessoas ===");
                    CadastroPessoa.listarPessoas();
                    break;
                case 3:
                    System.out.println("=== Remover Pessoa ===");
                    CadastroPessoa.remover();
                    break;
                case 4:
                    System.out.println("=== Cadastro de Alunos ===");
                    CadastroAluno.CadastrarAluno();
                    break;
                case 5:
                    System.out.println("=== Lista de Alunos ===");
                    CadastroAluno.listarAlunos();
                    break;
                case 6:
                    System.out.println("=== Remover Aluno ===");
                    CadastroAluno.removerAluno();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println(); // Pular linha para melhorar a legibilidade
        } while (opcao != 0);
    }
}

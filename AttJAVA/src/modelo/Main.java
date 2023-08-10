package modelo;


import Controle.CadastroAluno;
import Controle.CadastroCurso;
import Controle.CadastroFuncionario;
import Controle.CadastroPessoa;
import Controle.CadastroProfessor;
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
            System.out.println("7 - Cadastrar Funcionario");
            System.out.println("8 - Listar Funcionario");
            System.out.println("9 - Remover Funcionario");
            System.out.println("10 - Cadastrar Professor");
            System.out.println("11 - Listar Professor");
            System.out.println("12 - Remover Professor");
            System.out.println("13 - Cadastrar Curso");
            System.out.println("14 - Listar Curso");
            System.out.println("15 - Remover Curso");
            /*System.out.println("16 - Cadastrar Coordernador");
            System.out.println("17 - Listar Coordernador");
            System.out.println("18 - Remover Coordernador");*/
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
                    CadastroAluno.cadastrarAluno();
                    break;
                case 5:
                    System.out.println("=== Lista de Alunos ===");
                    CadastroAluno.listarAlunos();
                    break;
                case 6:
                    System.out.println("=== Remover Aluno ===");
                    CadastroAluno.removerAluno();
                    break;
                case 7:
                    System.out.println("=== Cadastro de Funcionário ===");
                    CadastroFuncionario.cadastrarFuncionario();
                    break;
                case 8:
                    System.out.println("=== Listar Funcionários ===");
                    CadastroFuncionario.listarFuncionarios();
                    break;
                case 9:
                    System.out.println("=== Remover Funcionário ===");
                    CadastroFuncionario.removerFuncionario();
                    break;
                case 10:
                    System.out.println("=== Cadastro de Professor ===");
                    CadastroProfessor.cadastrarProfessor();
                    break;
                case 11:
                    System.out.println("=== Listar Professores ===");
                    CadastroProfessor.listarProfessor();
                    break;
                case 12:
                    System.out.println("=== Remover Professor ===");
                    CadastroProfessor.removerProfessor();
                    break;
                case 13:
                    System.out.println("=== Cadastro de Curso ===");
                    CadastroCurso.cadastrarCurso();
                    break;
                case 14:
                    System.out.println("=== Listar Cursos ===");
                    CadastroCurso.listarCursos();
                    break;
                case 15:
                    System.out.println("=== Remover Curso ===");
                    CadastroCurso.removerCurso();
                    break;
                /*case 16:
                    System.out.println("=== Cadastro de Coordenador ===");
                    CadastroCoordenador.cadastrar();
                    break;
                case 17:
                    System.out.println("=== Listar Coordenadores ===");
                    CadastroCoordenador.listarCursos();
                    break;
                case 18:
                    System.out.println("=== Remover Coordenador ===");
                    CadastroCoordenador.removerCurso();
                    break;*/
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println(); 
        } while (opcao != 0);
    }
}


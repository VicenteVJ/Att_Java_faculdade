package modelo;

import java.time.LocalDate;


public class Coordenador extends Professor {
    private Curso curso;

    public Coordenador() {
    }

    public Coordenador(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao, Curso curso) {
        super(nome, CPF, dataNascimento, endereco, ctps, salario, formacao);
        this.curso = curso;
    }

    // Métodos CRUD

    // Create
    public void cadastrarCordenador(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao, Curso curso) {
        super.cadastrarProfessor(nome, CPF, dataNascimento, endereco, ctps, salario, formacao);
        this.curso = curso;
    }

    // Read
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso.getNome());
    }

    // Update
    public void atualizarCordenador(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao, Curso curso) {
        super.atualizarProfessor(nome, CPF, dataNascimento, endereco, ctps, salario, formacao);
        this.curso = curso;
    }

    // Delete
    public void excluirCordenador() {
        super.excluirProfessor();
        curso = null;
    }
}
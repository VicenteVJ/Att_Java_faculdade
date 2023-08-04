package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    protected String ra;
    protected LocalDate dataMatricula;
    protected String situacao;

    public Aluno() {
    }

    public Aluno(String ra, LocalDate dataMatricula, String situacao, String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
        super(nome, CPF, dataNscimento, endereco);
        this.ra = ra;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // Métodos CRUD
    // Create
    public void cadastrarAluno(String ra, LocalDate dataMatricula, String situacao, String nome, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.ra = ra;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    // Read
    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("RA: " + ra);
        System.out.println("Data de Matrícula: " + dataMatricula);
        System.out.println("Situação: " + situacao);
    }

    // Update
    public void atualizarAluno(String ra, LocalDate dataMatricula, String situacao) {
        this.ra = ra;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;

    }
}

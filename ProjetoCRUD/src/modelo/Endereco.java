package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    protected String ra;
    protected String situacao;
    protected String dataMatricula;
    protected List<Curso> cursosMatriculados;

    public Aluno() {
        cursosMatriculados = new ArrayList<>();
    }

    public Aluno(String nome, String cpf, String dataNascimento, Endereco endereco, String ra, String situacao, String dataMatricula) {
        super(nome, cpf, dataNascimento, endereco);
        this.ra = ra;
        this.situacao = situacao;
        this.dataMatricula = dataMatricula;
        cursosMatriculados = new ArrayList<>();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(List<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    // Métodos CRUD
    // Create
    public void cadastrarAluno(String nome, String cpf, String dataNascimento, Endereco endereco, String ra, String situacao, String dataMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.ra = ra;
        this.situacao = situacao;
        this.dataMatricula = dataMatricula;
    }

    // Read
    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("RA: " + ra);
        System.out.println("Situação: " + situacao);
        System.out.println("Data de Matrícula: " + dataMatricula);
        System.out.println("Cursos Matriculados: ");
        for (Curso curso : cursosMatriculados) {
            System.out.println("- " + curso.getNome());
        }
        
    // Update
    public void atualizarAluno(String nome, String cpf, String dataNascimento, Endereco endereco, String ra, String situacao, String dataMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.ra = ra;
        this.situacao = situacao;
        this.dataMatricula = dataMatricula;
    }
}

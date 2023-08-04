package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private int qtdSemestre;
    private List<Aluno> alunosIncluidos;

    public Curso(String nome, int cargaHoraria, int qtdSemestre) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.qtdSemestre = qtdSemestre;
        this.alunosIncluidos = new ArrayList<>();
    }

    // Create
    public void incluirAluno(Aluno aluno) {
        alunosIncluidos.add(aluno);
    }

    // Read
    public void exibirInformacoes() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Quantidade de Semestres: " + qtdSemestre);
        System.out.println("Alunos Incluídos: ");
        for (Aluno aluno : alunosIncluidos) {
            System.out.println("- " + aluno.getNome());
        }
    }

    // Update
    public void atualizarAluno(Aluno aluno, String novoNome) {
        aluno.setNome(novoNome);
    }

    // Delete
    public void excluirAluno(Aluno aluno) {
        alunosIncluidos.remove(aluno);
    }
}
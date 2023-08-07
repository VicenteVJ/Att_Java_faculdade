package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private int cargaHoraria;
    private int quantidadeSemestres;
    private List<Aluno> alunosMatriculados;

    public Curso(String nomeCurso, int cargaHoraria, int quantidadeSemestres) {
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeSemestres = quantidadeSemestres;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQuantidadeSemestres() {
        return quantidadeSemestres;
    }

    public void setQuantidadeSemestres(int quantidadeSemestres) {
        this.quantidadeSemestres = quantidadeSemestres;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Quantidade de Semestres: " + quantidadeSemestres);
        System.out.println("Alunos Matriculados: " + alunosMatriculados.size());
    }
}

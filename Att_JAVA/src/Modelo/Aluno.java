package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa {

    private String ra;
    private String situacao;
    private LocalDate dataMatricula;

    public Aluno(String nome, String cpf, LocalDate dataNascimento, String ra, String situacao, LocalDate dataMatricula) {
        super(nome, cpf, dataNascimento);
        this.ra = ra;
        this.situacao = situacao;
        this.dataMatricula = dataMatricula;
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

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("RA: " + ra);
        System.out.println("Situação: " + situacao);
        System.out.println("Data de Matrícula: " + formatarData(dataMatricula));
    }

    private String formatarData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }
}

package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Professor extends Funcionario {

    private String formacao;

    public Professor(String nome, String cpf, LocalDate dataNascimento, String cargo, String formacao) {
        super(nome, cpf, dataNascimento, cargo);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Formação: " + formacao);
    }
}

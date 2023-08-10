package modelo;

import java.time.LocalDate;

public class Professor extends Funcionario{
    protected String formacao;

    public Professor() {
    }

    public Professor(String formacao, String ctps, double salario, String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
        super(ctps, salario, nome, CPF, dataNscimento, endereco);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" + "formacao=" + formacao + '}';
    }
    
}

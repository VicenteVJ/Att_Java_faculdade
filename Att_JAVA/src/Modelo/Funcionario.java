package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
    private String ctps;
    private double salario;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, String ctps, double salario) {
        super(nome, cpf, dataNascimento);
        this.ctps = ctps;
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir informações do funcionário
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CTPS: " + ctps);
        System.out.println("Salário: R$" + salario);
    }
}

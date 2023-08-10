package modelo;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    protected String ctps;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String ctps, double salario, String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
        super(nome, CPF, dataNscimento, endereco);
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

    @Override
    public String toString() {
        return "Funcionario{" + "ctps=" + ctps + ", salario=" + salario + '}';
    }
    
}

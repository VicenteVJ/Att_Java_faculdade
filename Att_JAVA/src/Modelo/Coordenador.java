package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Coordenador extends Funcionario {

    private String departamento;

    public Coordenador(String nome, String cpf, LocalDate dataNascimento, String cargo, String departamento) {
        super(nome, cpf, dataNascimento, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}

package modelo;

import java.time.LocalDate;

public abstract class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected String CPF;
    protected LocalDate dataNascimento;
    protected Endereco endereco;

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int calcularIdade() {
        LocalDate now = LocalDate.now();
        int idade = now.getYear() - dataNascimento.getYear();
        if (now.getMonthValue() < dataNascimento.getMonthValue() || (now.getMonthValue() == dataNascimento.getMonthValue() && now.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }
        return idade;
    }

    public abstract void exibirInformacoes();

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
}
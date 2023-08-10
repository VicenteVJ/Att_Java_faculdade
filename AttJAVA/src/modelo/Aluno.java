package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    protected String ra;
    protected LocalDate dataMatricula;
    protected String situacao;

    public Aluno() {
    }

    public Aluno(String ra, LocalDate dataMatricula, String situacao, Curso curso, String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
        super(nome, CPF, dataNscimento, endereco);
        this.ra = ra;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", dataMatricula=" + dataMatricula + ", situacao=" + situacao + ", curso=" + '}';
    }

    
     
}

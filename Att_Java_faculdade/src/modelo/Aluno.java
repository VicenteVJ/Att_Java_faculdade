package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    protected String ra;
    protected String curso;
    protected LocalDate dataMatricula;
    protected String situacao;

    public Aluno() {
    }

    public Aluno(String ra, String curso, LocalDate dataMatricula, String situacao, String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
        super(nome, CPF, dataNscimento, endereco);
        this.ra = ra;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.situacao = situacao;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        return super.toString() + "aluno{" + "ra=" + ra + ", curso=" + curso + ", dataMatricula=" + dataMatricula + ", situacao=" + situacao + '}';
    }

    public Object getRA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

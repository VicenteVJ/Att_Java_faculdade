
package modelo;
import java.time.LocalDate;
import util.DateUtils;


public class Pessoa implements Comparable<Object>{
    protected String nome;
    protected String CPF;
    protected LocalDate dataNascimento;
    protected Endereco endereco;

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, String CPF, LocalDate dataNscimento, Endereco endereco) {
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
    
    public int calcularIdade(){
        return (int) DateUtils.quantidadeAnosEntreDatas(dataNascimento, LocalDate.now());
    }

    public void exibirInformacoes(){
        System.out.println(nome + " " + CPF + " - " + calcularIdade() + " anos" + "\n" + endereco.getCidade() + " " + endereco.getRua() + ", " + endereco.getNumero());
    } 
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", data de nascimento=" + dataNascimento + ", endereco=" + endereco + '}';
    }
    

    public int compareTo(Pessoa o){
    return this.nome.compareToIgnoreCase(o.getNome());
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}

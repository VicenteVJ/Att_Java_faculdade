package modelo;

public class Curso implements Comparable<Object>{
    protected String nome;
    protected int cargaHoraria;
    protected int qtdSemestres;

    public Curso() {
    }

    public Curso(String nome, int cargaHoraria, int qtdSemestres) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.qtdSemestres = qtdSemestres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQtdSemestres() {
        return qtdSemestres;
    }

    public void setQtdSemestres(int qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }
    
    public void exibirInformacoes(){
        System.out.println( "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", qtdSemestres=" + qtdSemestres );
    } 

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", qtdSemestres=" + qtdSemestres + '}';
    }
    
    public int compareTo(Curso o){
    return this.nome.compareToIgnoreCase(o.getNome());
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

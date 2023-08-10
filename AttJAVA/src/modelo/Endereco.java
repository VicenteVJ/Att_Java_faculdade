package modelo;


public class Endereco {
     protected String Cidade;
     protected String rua;
     protected float numero;

    public Endereco() {
    }

    public Endereco(String Cidade, String rua, float numero) {
        this.Cidade = Cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "Cidade=" + Cidade + ", rua=" + rua + ", numero=" + numero + '}';
    }
 
    
}   

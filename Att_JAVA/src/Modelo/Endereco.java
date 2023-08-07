package Modelo;

public class Endereco {

    private String cidade;
    private String rua;
    private String numero;

    public Endereco(String cidade, String rua, String numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void exibirInformacoes() {
        System.out.println("Cidade: " + cidade);
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
    }
}

package modelo;

public class Funcionario extends Pessoa {

    private String ctps;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario) {
        super(nome, CPF, dataNascimento, endereco);
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

    // Métodos CRUD
    // Create
    public void cadastrarFuncionario(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setDataNascimento(dataNascimento);
        super.setEndereco(endereco);
        this.ctps = ctps;
        this.salario = salario;
    }

    // Read
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CTPS: " + ctps);
        System.out.println("Salário: " + salario);
    }

    // Update
    public void atualizarFuncionario(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario) {
        super.setNome(nome);
        super.setCPF(CPF);
        super.setDataNascimento(dataNascimento);
        super.setEndereco(endereco);
        this.ctps = ctps;
        this.salario = salario;
    }

    // Delete
    public void excluirFuncionario() {
        super.setNome(null);
        super.setCPF(null);
        super.setDataNascimento(null);
        super.setEndereco(null);
        ctps = null;
        salario = 0.0;
    }
}

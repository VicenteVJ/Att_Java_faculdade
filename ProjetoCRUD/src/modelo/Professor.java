package modelo;

public class Professor extends Funcionario {
    private String formacao;

    public Professor() {
    }

    public Professor(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao) {
        super(nome, CPF, dataNascimento, endereco, ctps, salario);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    // Métodos CRUD

    // Create
    public void cadastrarProfessor(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao) {
        super.cadastrarFuncionario(nome, CPF, dataNascimento, endereco, ctps, salario);
        this.formacao = formacao;
    }

    // Read
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Formação: " + formacao);
    }

    // Update
    public void atualizarProfessor(String nome, String CPF, LocalDate dataNascimento, Endereco endereco, String ctps, double salario, String formacao) {
        super.atualizarFuncionario(nome, CPF, dataNascimento, endereco, ctps, salario);
        this.formacao = formacao;
    }

    // Delete
    public void excluirProfessor() {
        super.excluirFuncionario();
        formacao = null;
    }
}
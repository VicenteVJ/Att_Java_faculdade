package Modelo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Cascavel", "Rua A", "123");
        Endereco endereco2 = new Endereco("cafelândia", "Avenida B", "456");

        Aluno aluno1 = new Aluno("João da Silva", "123.456.789-00", LocalDate.of(1995, 5, 15), "2023001", "Ativo", LocalDate.of(2022, 3, 1));
        aluno1.setEndereco(endereco1);

        Aluno aluno2 = new Aluno("Enzo Gabriel", "987.654.321-00", LocalDate.of(1998, 9, 20), "2023002", "Ativo", LocalDate.of(2021, 8, 1));
        aluno2.setEndereco(endereco2);

        Professor professor1 = new Professor("Pedro henrique ", "222.333.444-55", LocalDate.of(1980, 6, 25), "Professor", "Mestrado em Matemática");
        professor1.setEndereco(endereco1);

        Coordenador coordenador1 = new Coordenador("Rudimar", "111.222.333-44", LocalDate.of(1975, 12, 10), "Coordenador Pedagógico", "Analista de Sistemas");
        coordenador1.setEndereco(endereco2);

        Curso curso1 = new Curso("Analista de Sistemas", 2400, 8);

        curso1.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);

        System.out.println("===== Alunos =====");
        aluno1.exibirInformacoes();
        aluno1.getEndereco().exibirInformacoes();
        System.out.println("-------------------");
        aluno2.exibirInformacoes();
        aluno2.getEndereco().exibirInformacoes();

        System.out.println("\n===== Professores =====");
        professor1.exibirInformacoes();
        professor1.getEndereco().exibirInformacoes();

        System.out.println("\n===== Coordenadores =====");
        coordenador1.exibirInformacoes();
        coordenador1.getEndereco().exibirInformacoes();

        System.out.println("\n===== Cursos =====");
        curso1.exibirInformacoes();
        curso1.getAlunosMatriculados().forEach(aluno -> aluno.exibirInformacoes());
        curso2.exibirInformacoes();
        curso2.getAlunosMatriculados().forEach(aluno -> aluno.exibirInformacoes());
    }
}

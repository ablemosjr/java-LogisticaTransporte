
package logistica.model;

import java.time.LocalDate;

public class Condutor implements Comparable<Condutor> {
    
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private double salario;

    public Condutor(String nome, String cpf, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "\n Condutor = \n{" + "Nome = " + nome + 
                "\n CPF = " + cpf + 
                "\n Data de nascimento = " + dataNascimento + 
                "\n Salário = R$ " + salario + '}' + "\n";
    }

    @Override
    public int compareTo(Condutor c) {
        return this.getCpf().compareToIgnoreCase(c.getCpf());
    }

}
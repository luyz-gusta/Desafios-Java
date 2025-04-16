package Inclusao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Cadastro {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grauDeficiencia;
    private String endereco;
    private List<Atendimento> atendimentos;

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grauDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeficiencia = grauDeficiencia;
        this.endereco = endereco;
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void exibirRelatorioAtendimentos() {
        System.out.println("\nRelatório de Atendimentos para: " + nome);
        for (Atendimento a : atendimentos) {
            System.out.println(" - " + a);
        }
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public String getGrauDeficiencia() {
        return grauDeficiencia;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void cadastrar() {
        System.out.println(nome + " cadastrado com sucesso!");
    }

    @Override
    public void visualizar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos), " + tipoDeficiencia + " [" + grauDeficiencia + "] - " + endereco;
    }
}

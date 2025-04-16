package Inclusao;

import java.util.ArrayList;
import java.util.List;

public class SistemaInclusao {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        System.out.println("\nTodas as Pessoas:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }

    public void listarPorFiltro(String tipoDeficiencia, String grau) {
        System.out.println("\nFiltrando por Tipo: " + tipoDeficiencia + " e Grau: " + grau);
        for (Pessoa p : pessoas) {
            if (p.getTipoDeficiencia().equalsIgnoreCase(tipoDeficiencia) &&
                    p.getGrauDeficiencia().equalsIgnoreCase(grau)) {
                System.out.println(p);
            }
        }
    }

    public void gerarRelatorioAtendimentos(String nomePessoa) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                p.exibirRelatorioAtendimentos();
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}

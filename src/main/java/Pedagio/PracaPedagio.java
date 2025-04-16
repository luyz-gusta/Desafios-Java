package Pedagio;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<RegistroPassagem> registros;

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
        this.registros = new ArrayList<>();
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = calcularTarifa(veiculo);
        registros.add(new RegistroPassagem(veiculo, valor));
        System.out.println("Passagem registrada: " + veiculo.getPlaca() + " | Valor: R$ " + valor);
    }

    private double calcularTarifa(Veiculo veiculo) {
        switch (veiculo.getTipo()) {
            case "carro":
                return tarifaBase;
            case "moto":
                return tarifaBase * 0.5;
            case "caminhao":
                return tarifaBase * veiculo.getEixos();
            default:
                return 0;
        }
    }

    public void gerarRelatorio() {
        System.out.println("\n📍 Relatório - Praça: " + localizacao);
        double total = 0;
        for (RegistroPassagem r : registros) {
            System.out.println("- " + r);
            total += r.getValorCobrado();
        }
        System.out.printf("💰 Total arrecadado: R$ %.2f\n", total);
    }
}

package Pedagio;

public class RegistroPassagem {
    private Veiculo veiculo;
    private double valorCobrado;

    public RegistroPassagem(Veiculo veiculo, double valorCobrado) {
        this.veiculo = veiculo;
        this.valorCobrado = valorCobrado;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public String toString() {
        return veiculo.getPlaca() + " | Tipo: " + veiculo.getTipo() + " | Valor: R$ " + valorCobrado;
    }
}

import Pedagio.*;

public class IndexPedagio {
    public static void main(String[] args) {
        PracaPedagio praca1 = new PracaPedagio("Rodovia Anhanguera - km 103", 8.50);
        PracaPedagio praca2 = new PracaPedagio("Rodovia dos Bandeirantes - km 72", 10.00);

        Veiculo carro = new Veiculo("ABC1234", "carro", 0);
        Veiculo moto = new Veiculo("XYZ5678", "moto", 0);
        Veiculo caminhao = new Veiculo("TRK9988", "caminhao", 4);

        carro.registrar();
        moto.registrar();
        caminhao.registrar();

        praca1.registrarPassagem(carro);
        praca1.registrarPassagem(moto);
        praca1.registrarPassagem(caminhao);

        praca2.registrarPassagem(caminhao);
        praca2.registrarPassagem(carro);

        praca1.gerarRelatorio();
        praca2.gerarRelatorio();
    }
}

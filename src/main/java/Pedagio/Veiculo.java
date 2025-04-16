package Pedagio;

public class Veiculo implements Registravel {
    private String placa;
    private String tipo; // "carro", "moto", "caminhao"
    private int eixos;

    public Veiculo(String placa, String tipo, int eixos) {
        this.placa = placa;
        this.tipo = tipo.toLowerCase();
        this.eixos = eixos;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public void registrar() {
        System.out.println("Veículo com placa " + placa + " registrado.");
    }

    @Override
    public void visualizar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Veículo: " + placa + " | Tipo: " + tipo + (tipo.equals("caminhao") ? " | Eixos: " + eixos : "");
    }
}

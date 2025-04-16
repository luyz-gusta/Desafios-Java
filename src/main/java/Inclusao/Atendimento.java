package Inclusao;

public class Atendimento implements Cadastro {
    private String data;
    private String tipo;
    private String profissional;

    public Atendimento(String data, String tipo, String profissional) {
        this.data = data;
        this.tipo = tipo;
        this.profissional = profissional;
    }

    @Override
    public void cadastrar() {
        System.out.println("Atendimento de " + tipo + " em " + data + " cadastrado.");
    }

    @Override
    public void visualizar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return data + " - " + tipo + " (Profissional: " + profissional + ")";
    }
}

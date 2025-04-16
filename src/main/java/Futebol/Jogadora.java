package Futebol;

public class Jogadora implements Futebol {
    private String nome;
    private int idade;
    private String posicao;
    private int numero;

    public Jogadora(String nome, int idade, String posicao, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }


    public String getPosicao() {
        return posicao;
    }


    @Override
    public void visualizar() {
        System.out.println("************************** Jogadora **************************");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
        System.out.println("Número: " + numero);
    }
}

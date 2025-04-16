package Futebol;

import java.util.ArrayList;
import java.util.List;

public class Time implements Futebol {

    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras;
    private int pontos;

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogadora(Jogadora jogadora) {
        this.jogadoras.add(jogadora);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public Time(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoras = new ArrayList<Jogadora>();
    }

    @Override
    public void visualizar(){
        System.out.println("************************** TIME: " + this.nome + " **************************");
        System.out.println("Cidade: " + cidade);
        System.out.println("Jogadoras: ");

        for (Jogadora jogadora: jogadoras){
            System.out.println("    " + jogadora.getPosicao() + " - " + jogadora.getNome());
        }
    }
}

package Futebol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Campeonato{
    private List<Partida> partidas = new ArrayList<>();
    private List<Time> times = new ArrayList<>();

    public void adicionarPartida(Partida partida) {
        this.partidas.add(partida);
    }

    public void adicionarTime(Time time) {
        this.times.add(time);
    }

    public void exibirPartidas() {
        for (Partida p : partidas) {
            p.exibirResultado();
        }
    }

    public void exibirClassificacao() {
        this.times.sort(Comparator.comparingInt(Time::getPontos).reversed());

        System.out.println("\n--- Classificação ---");
        for (int i = 0; i < this.times.size(); i++) {
            Time t = this.times.get(i);
            System.out.printf("%dº - %s (%d pts)\n", i + 1, t.getNome(), t.getPontos());
        }
    }
}
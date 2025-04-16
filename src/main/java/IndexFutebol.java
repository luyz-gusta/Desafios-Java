import Futebol.Campeonato;
import Futebol.Jogadora;
import Futebol.Partida;
import Futebol.Time;

public class IndexFutebol {

    public static void main(String[] args) {
        Time time1 = new Time("Time A", "São Paulo");
        Jogadora jogadora1 = new Jogadora("Ana", 25, "Atacante", 9);
        Jogadora jogadora2 = new Jogadora("Maria", 28, "Meio-campo", 10);
        time1.adicionarJogadora(jogadora1);
        time1.adicionarJogadora(jogadora2);
        time1.visualizar();

        Time time2 = new Time("Time B", "Rio de Janeiro");
        Jogadora jogadora3 = new Jogadora("Julia", 22, "Defensora", 3);
        Jogadora jogadora4 = new Jogadora("Lúcia", 26, "Atacante", 11);
        time2.adicionarJogadora(jogadora3);
        time2.adicionarJogadora(jogadora4);
        time2.visualizar();

        Campeonato campeonato = new Campeonato();
        campeonato.adicionarTime(time1);
        campeonato.adicionarTime(time2);

        Partida jogo1 = new Partida(time1, time2, 2, 1);
        campeonato.adicionarPartida(jogo1);
        campeonato.exibirClassificacao();
    }
}

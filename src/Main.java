import java.util.ArrayList;

/**
 * Created by Fernando Calderaro on 04/06/2017.
 */
public class Main {
    public static void main(String args[]) {

        ArrayList<Personagem> personagens = new ArrayList<Personagem>();

        Personagem cavaleiro = new Cavaleiro("Seya");
        personagens.add(cavaleiro);
        Personagem cavaleiro2 = new Cavaleiro("Shiryu");
        personagens.add(cavaleiro2);

        Personagem mago = new Mago("Patolino");
        personagens.add(mago);
        Personagem mago2 = new Mago("Natsu");
        personagens.add(mago2);

        Personagem dragao = new Dragao("Dragnel");
        personagens.add(dragao);
        Personagem dragao2 = new Dragao("Dragonair");
        personagens.add(dragao2);

        /*Personagem p = new Cavaleiro("Ichigo");
        Jogo vida = new Jogo();
        vida.executaAcoesComuns();*/
    }
}
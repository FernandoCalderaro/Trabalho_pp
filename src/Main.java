import java.util.ArrayList;

/**
 * Created by Fernando Calderaro on 04/06/2017.
 */
public class Main {
    public static void main(String args[]) {

        ArrayList<Personagem> personagens = new ArrayList<Personagem>();

        Personagem cavaleiro1 = new Cavaleiro("Seya");
        personagens.add(cavaleiro1);
        Personagem cavaleiro2 = new Cavaleiro("Shiryu");
        personagens.add(cavaleiro2);

        Personagem dragao1 = new Dragao("Dragnel");
        personagens.add(dragao1);
        Personagem dragao2 = new Dragao("Dragonair");
        personagens.add(dragao2);

        Personagem mago1 = new Mago("Patolino");
        personagens.add(mago1);
        Personagem mago2 = new Mago("Natsu");
        personagens.add(mago2);

        Jogo jogo = new Jogo();

        for(Personagem it: personagens){
            jogo.executaAcoesComuns(it);
            System.out.println();
        }

        Personagem p = new Mago("Erza Scarlet");
        Mago mago = (Mago) p;
        mago.invisibilidade();

        /*Personagem p = new Cavaleiro("Ichigo");
        Jogo vida = new Jogo();
        vida.executaAcoesComuns();*/
    }
}
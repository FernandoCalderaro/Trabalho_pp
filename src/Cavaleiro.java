/**
 * Created by Luana Schramm on 31/05/2017.
 */
public class Cavaleiro extends Personagem implements ComportamentoHeroico {

    private static String nome;

    public Cavaleiro(String nome) {
        nome = "Seya";
    }

    public void atacar() {
        System.out.println(nome + " está atacando");
    }

    public void defender() {
        System.out.println(nome + " está defendendo");
    }

    public void saltar() {
        System.out.println(nome + " está saltando");
    }

    public void andar() {
        System.out.println(nome + " está andando");
    }

    public void guardarItem() {
        System.out.println(nome + " está guardando item");
    }

    public void usarItem() {
        System.out.println(nome + " está usando item");
    }

}

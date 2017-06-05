/**
 * Created by Luana Schramm on 31/05/2017.
 */
public class Dragao extends Personagem {

    private static String nome;
    public Dragao(String nome) {
        nome = "Banguela";
    }

    public void setNome() {
    }

    public String getNome() {
        return null;
    }
    public void atirarFogo() {
        System.out.println(nome + " está atirando fogo");
    }

    public void voar() {
        System.out.println(nome + " está voando");
    }

    public void morder() {
        System.out.println(nome + " Mordeu você");
    }

    public void andar() {
        System.out.println(nome + " está andando");
    }

    public void guardarItem() {
        System.out.println(nome + " está guardando item");
    }

    public void usarItem() {
    }

}

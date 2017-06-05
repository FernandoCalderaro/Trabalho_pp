/**
 * Created by Luana Schramm on 31/05/2017.
 */
public class Mago extends Personagem implements ComportamentoMagico {

    private static String nome;
    public Mago(String nome) {
        nome = "Gandalf";
    }

    public void invisibilidade() {
        System.out.println(nome + " está invisível");
    }

    public void ultraRapidez() {
        System.out.println(nome + " está ultra rápido");
    }

    public void setNome() {
    }

    public String getNome() {
        return null;
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

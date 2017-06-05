/**
 * Created by Luana Schramm on 31/05/2017.
 */
public abstract class Personagem implements ComportamentoNormal {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return null;
    }

    public abstract void andar();

    public abstract void guardarItem();

    public abstract void usarItem();

}

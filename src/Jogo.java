import java.util.ArrayList;

/**
 * Created by Luana Schramm on 01/06/2017.
 */
public class Jogo {
    public void executaAcoesComuns(Personagem personagens) {
        if(personagens instanceof Cavaleiro){
            Cavaleiro cavaleiro = (Cavaleiro) personagens;
            cavaleiro.andar();
            cavaleiro.guardarItem();
            cavaleiro.usarItem();
        }
        else if(personagens instanceof Mago){
            Mago mago = (Mago) personagens;
            mago.andar();
            mago.guardarItem();
            mago.usarItem();
        }
        else if(personagens instanceof Dragao){
            Dragao dragao = (Dragao) personagens;
            dragao.andar();
            dragao.guardarItem();
            dragao.usarItem();
        }

    }


}

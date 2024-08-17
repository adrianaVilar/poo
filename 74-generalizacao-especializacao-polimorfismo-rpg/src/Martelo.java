
public class Martelo extends Arma {

    public Martelo() {
        this.dano = 19;
    }

    @Override
    public int calculaDano(Personagem personagem) {
        return (int) Math.ceil((double)dano * (double) personagem.getForca() / 10.0);
    }
}

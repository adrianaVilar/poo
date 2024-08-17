
public class Arco extends Arma {

    public Arco() {
        this.dano = 13;
    } 

    @Override
    public int calculaDano(Personagem personagem) {
        return (int) Math.ceil((double) dano * (double) personagem.getPontaria() / 10.0);
    }
}


public class PoMagico extends Arma {

    public PoMagico() {
        this.dano = 15;
    }

    @Override
    public int calculaDano(Personagem personagem) {
        return (int) Math.ceil((double) dano * (double) personagem.getMagica() / 10.0);
    }

    @Override
    public String toString() {
       return "Pó Mágico";
    }

}

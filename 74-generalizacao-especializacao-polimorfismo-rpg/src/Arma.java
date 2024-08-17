
public abstract class Arma {

    protected int dano;

    public int getDano() {
        return dano;
    }

    public abstract int calculaDano(Personagem personagem);

    @Override
    public String toString() {
       return this.getClass().getSimpleName();
    }

    
}

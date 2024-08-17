
public class Ogro extends Personagem {

    public Ogro() {
        this.forca = 7;
        this.pontaria = 2;
        this.magica = 1;
    }

    @Override
    public String toString() {

        String arma = "";
        String escudo = "";

        if(this.getArmaPrincipal() == null) {
            arma = "desarmado";
        } else {
            arma = "armado com " + this.getArmaPrincipal().toString();
        }

        if(this.getEscudo() == null)
            escudo = "sem escudo";
        
        return "Ogro " + escudo + " e " + arma;
    }


}

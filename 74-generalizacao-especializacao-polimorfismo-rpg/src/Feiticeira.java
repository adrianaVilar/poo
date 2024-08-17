
public class Feiticeira extends Personagem {

    public Feiticeira() {
        this.forca = 2;
        this.pontaria = 2;
        this.magica = 6;
    }

     @Override
    public String toString() {

        String arma = "";
        String escudo = "";

        if(this.getArmaPrincipal() == null) {
            arma = "desarmada";
        }  else {
            arma = "armada com " + this.getArmaPrincipal().toString();
        }

        if(this.getEscudo() == null)
            escudo = "sem escudo";
        

        return "Feiticeira " + escudo + " e " + arma;
    }

}

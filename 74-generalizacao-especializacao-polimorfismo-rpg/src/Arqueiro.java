
public class Arqueiro extends Personagem {

    public Arqueiro() {
        this.forca = 3;
        this.pontaria = 5;
        this.magica = 2;
    }

     @Override
    public String toString() {

        String arma = "";
        String escudo = "";

        if(this.getArmaPrincipal() == null) {
            arma = "desarmado";
        }  else {
            arma = "armado com " + this.getArmaPrincipal().toString();
        }

        if(this.getEscudo() == null)
            escudo = "sem escudo";
        

        return "Arqueiro " + escudo + " e " + arma;
    }

    
}

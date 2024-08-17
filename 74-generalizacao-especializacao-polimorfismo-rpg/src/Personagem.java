
public abstract class Personagem {

    protected int saude = 100;
    protected int forca;
    protected int pontaria;
    protected int magica;
    private Arma armaPrincipal;
    private Arma armaSecundaria;
    private Escudo escudo;

    public int getForca() {
        return forca;
    }
    public int getPontaria() {
        return pontaria;
    }
    public int getMagica() {
        return magica;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setArmaSecundaria(Arma armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public Arma getArmaSecundaria() {
        return armaSecundaria;
    }

    public Escudo getEscudo() {
        return escudo;
    }
    public boolean estaVivo() {
        return this.saude > 0;
    }
    public int getSaude() {
        return saude;
    }
    public void pegaArma(Arma arma) {
        if (arma == armaPrincipal || arma == armaSecundaria) {
            return;
        }

        if (armaPrincipal != null) {
            armaSecundaria = armaPrincipal;
        }
        this.armaPrincipal = arma;
        
    }

    public void trocaArma() {
        if (armaSecundaria == null) {
            return;
        }

        Arma aux = armaPrincipal;
        armaPrincipal = armaSecundaria;
        armaSecundaria = aux;
    }

    public void largaArma() {
        armaPrincipal = armaSecundaria;
        armaSecundaria = null;
    }
   
    public void recebeDano(int dano) {
        this.saude -= dano;
    }

    public void ataca(Personagem personagem) {
        personagem.recebeDano(this.armaPrincipal.calculaDano(this));
    }
    
    public boolean estaDesarmado() {
        return armaPrincipal == null;
    }


}

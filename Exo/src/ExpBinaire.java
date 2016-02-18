public abstract class ExpBinaire extends ExpAbstraite {

    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        this.opGauche = opGauche;
        this.opDroite = opDroite;
    } 

    protected ExpAbstraite opGauche;
    
    protected ExpAbstraite opDroite;
}

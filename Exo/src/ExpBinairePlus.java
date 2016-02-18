public class ExpBinairePlus extends ExpBinaire {
    
    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        super(opGauche, opDroite);
    }    
  
    public String toStringInfixe() {
        return " + " + this.opGauche.toStringInfixe() + " " + this.opDroite.toStringInfixe();
    } 
}

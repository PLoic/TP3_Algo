public class ExpBinairePlus extends ExpBinaire {
    
    public ExpBinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        super(opGauche, opDroite);
    }    
  
    public String toStringInfixe() {
        return " + " + this.opGauche.toStringInfixe() + " " + this.opDroite.toStringInfixe();
    } 
    
    public double evaluer(Env env) {
        return opGauche.evaluer(env) + opDroite.evaluer(env);
    }
}

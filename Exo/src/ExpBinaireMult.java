public class ExpBinaireMult extends ExpBinaire {

    public ExpBinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        super(opGauche, opDroite);
    }

    public String toStringInfixe() {
        return " * " + opGauche.toStringInfixe() + " " + opDroite.toStringInfixe();
    }
}

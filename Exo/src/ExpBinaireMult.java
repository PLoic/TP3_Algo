public class ExpBinaireMult extends ExpBinaire {

    public ExpBinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        super(opGauche, opDroite);
    }

    public String toStringInfixe() {
        return " * " + opGauche.toStringInfixe() + " " + opDroite.toStringInfixe();
    }

    public double evaluer(Env env) {
        return opGauche.evaluer(env) * opDroite.evaluer(env);
    }
}

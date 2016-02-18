/**
 * Created by loic on 18/02/2016.
 */
public class ExpUnaireExponentielle extends ExpUnaire {

    public ExpUnaireExponentielle(ExpAbstraite operande) {
        super(operande);
    }

    @Override
    String toStringInfixe() {
        return null;
    }

    @Override
    double evaluer(Env env) {
       return Math.exp(operande.evaluer(env));
    }
}

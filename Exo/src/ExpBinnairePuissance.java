import java.util.Map;

/**
 * Created by loic on 18/02/2016.
 */
public class ExpBinnairePuissance extends ExpBinaire {


    public ExpBinnairePuissance(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        super(opGauche, opDroite);
    }

    @Override
    String toStringInfixe() {
        return null;
    }

    @Override
    double evaluer(Env env) {
        return Math.pow(this.opGauche.evaluer(env), this.opDroite.evaluer(env));
    }
}

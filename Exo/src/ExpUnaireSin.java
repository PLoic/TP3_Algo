/**
 * Created by loic on 18/02/2016.
 */

import java.lang.*;

public class ExpUnaireSin extends ExpUnaire {
    
    public ExpUnaireSin(ExpAbstraite operande) {
        super(operande);
    }

    String toStringInfixe() {
        return " sin(" + operande.toStringInfixe() + ")";
    }

    public double evaluer(Env env) {
        return Math.sin(operande.evaluer(env));
    }
}

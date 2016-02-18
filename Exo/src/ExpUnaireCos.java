/**
 * Created by loic on 18/02/2016.
 */
import java.lang.*;

public class ExpUnaireCos extends ExpUnaire {

    public ExpUnaireCos(ExpAbstraite operande) {
        super(operande);
    }

    String toStringInfixe() {
        return " cos (" + operande.toStringInfixe() + ")";
    }

    double evaluer(Env env) {
        return Math.cos(operande.evaluer(env));
    }
    
}

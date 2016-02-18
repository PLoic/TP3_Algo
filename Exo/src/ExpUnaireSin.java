/**
 * Created by loic on 18/02/2016.
 */
public class ExpUnaireSin extends ExpUnaire {
    
    public ExpUnaireSin(ExpAbstraite operande) {
        super(operande);
    }

    String toStringInfixe() {
        return " sin(" + operande.toStringInfixe() + ")";
    }
}

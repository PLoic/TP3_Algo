/**
 * Created by loic on 18/02/2016.
 */
public class ExpUnaireCos extends ExpUnaire {

    public ExpUnaireCos(ExpAbstraite operande) {
        super(operande);
    }

    String toStringInfixe() {
        return " cos (" + operande.toStringInfixe() + ")";
    }
}

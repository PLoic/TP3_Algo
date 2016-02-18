/**
 * Created by loic on 18/02/2016.
 */
public abstract class ExpUnaire extends ExpAbstraite {

    protected ExpAbstraite operande;

    public ExpUnaire(ExpAbstraite operande) {
        this.operande = operande;
    }

}

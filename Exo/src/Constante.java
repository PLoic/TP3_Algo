/**
 * Created by loic on 18/02/2016.
 */
public class Constante extends ExpAbstraite {

    public Constante(double valeur) {
        this.valeur = valeur;
    }

    double valeur;

    @Override
    String toStringInfixe() {
        return Double.toString(valeur);
    }
}

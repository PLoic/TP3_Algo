/**
 * Created by loic on 18/02/2016.
 */
public class Variable extends ExpAbstraite {

    public Variable(String nom) {
        this.nom = nom;
    }

    String nom;

    @Override
    String toStringInfixe() {
         return nom;
    }
}

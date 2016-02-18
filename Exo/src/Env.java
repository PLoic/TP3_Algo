import java.util.HashMap;
import java.util.Map;

/**
 * Created by loic on 18/02/2016.
 */
public class Env {

    private Map<String,Double> map = new HashMap<String, Double>();

    void associer(String nom, double valeur){
        map.put(nom,valeur);
    }

    double obtenirValeur(String nom){
        return map.get(nom);
    }

    public String toString(){
        String str = null;
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            str += entry.getKey() + " = " + entry.getValue() + " , ";
        }

        return str;
    };
}

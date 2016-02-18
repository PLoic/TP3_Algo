public abstract class ExpAbstraite {
    
    public ExpAbstraite () {

    }
   
    abstract String toStringInfixe();

    abstract double evaluer(Env env);

    public String toString() {
        return "Je suis une expression et me voila en notation\n" +
                "infixée : " + toStringInfixe();
    }
}

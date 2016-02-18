public abstract class ExpAbstraite {
    
    public ExpAbstraite () {

    }
   
    abstract String toStringInfixe();

    @Override
    public String toString() {
        return "Je suis une expression et me voila en notation\n" +
                "infixée : " + toStringInfixe();
    }
}

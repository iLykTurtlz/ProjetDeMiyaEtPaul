public class AttributeNotInitializedException extends Exception {
    public AttributeNotInitializedException()   {
        super("Il y a des attributs non initialisés.");
    }

    public AttributeNotInitializedException(String msg) {
        super(msg);
    }
}
public class InvalidInputException extends Exception    {
    public InvalidInputException()  {
        super("Cette valeur n'est pas un nombre positif");
    }

    public InvalidInputException(String msg)    {
        super(msg);
    }
    
}
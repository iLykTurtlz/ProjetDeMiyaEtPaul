public abstract class ParPaquet extends Ingredients{

    private double cal;
    private double carb;
    private double gras;
    private double prot;
    private double proportion;

    public ParPaquet(String nom, double cal, double carb, double prot, double proportion){
        super(nom);
        this.cal = cal;
        this.carb = carb;
        this.prot = prot;
        this.proportion = proportion;
    }
}

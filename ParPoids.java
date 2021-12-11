public abstract class ParPoids extends Ingredients{

    private double cal;
    private double carb;
    private double gras;
    private double prot;
    private double poids;

    public ParPoids(String nom, double cal, double carb, double gras, double prot, double poids){
        super(nom);
        this.cal = cal;
        this.carb = carb;
        this.gras = gras;
        this.prot = prot;
        this.poids = poids;
    }


}
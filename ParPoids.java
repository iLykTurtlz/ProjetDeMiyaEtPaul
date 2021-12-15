public abstract class ParPoids extends Ingredients{

    private double poids;

    public ParPoids(String nom, double cal, double carb, double gras, double prot, double poids){
        super(nom, cal, carb, gras, prot);
        this.poids = poids;
    }


}
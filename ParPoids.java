public abstract class ParPoids extends Ingredients{

    protected double poids;

    public ParPoids(String nom, double cal, double carb, double gras, double prot, double poids){
        super(nom, cal, carb, gras, prot);
        this.poids = poids;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*poids/100,super.carb*poids/100,super.gras*poids/100,super.prot*poids/100};
        return nutriTab;
    }

}
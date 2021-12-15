public class ParPaquet extends Ingredients{

    private double proportion;

    public ParPaquet(String nom, double cal, double carb, double gras, double prot, double proportion){
        super(nom, cal, carb, gras, prot);
        this.proportion = proportion;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*proportion,super.carb*proportion,super.gras*proportion,super.prot*proportion};
        return nutriTab;
    }
}

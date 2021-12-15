public class Ingredients{

    protected String nom;
    protected double cal;
    protected double carb;
    protected double gras;
    protected double prot;

    public Ingredients(String nom, double cal, double carb, double gras, double prot){
        this.nom = nom;
        this.cal = cal;
        this.carb = carb;
        this.gras = gras;
        this.prot = prot;
    }

    public double[] getNutri(){
        double[] nutriTab = {this.cal,this.carb,this.gras,this.prot};
        return nutriTab;
    }

}
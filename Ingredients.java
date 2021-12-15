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

    public String toString(){
        return this.nom+" Calories : "+this.cal+"cal Carbohydrates : "+this.carb+"mg Gras :"+this.gras+"mg Protéines : "+this.prot+" mg";
    }

    public String getNom(){
        return nom;
    }

    public Ingredients clone(){
        return new Ingredients(this.nom, this.cal, this.carb, this.gras, this.prot);
    }

}
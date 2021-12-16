public abstract class Ingredients{

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

        return String.format("%-25s%12s%6.1f%4s%25s%6.1f%3s%20s%6.1f%3s%20s%6.1f%3s",this.nom,"Calories : ",this.cal,"kCal",
"Carbohydrates : ",this.carb,"g", "Gras : ",this.gras,"g",
"Protéines : ",this.prot,"g");

}

    public String getNom(){
        return nom;
    }

    public abstract void setQte(double qte);
    public abstract Ingredients clone();
    public abstract boolean equals(Ingredients i);

}
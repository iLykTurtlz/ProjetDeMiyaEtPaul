public class Viande extends ParPoids{

    private double choles;

    public Viande(String nom, double cal, double carb, double gras, double prot, double choles,double poids){
        super(nom, cal, carb, gras, prot, poids);
        this.choles = choles;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*poids/100,super.carb*poids/100,super.gras*poids/100,super.prot*poids/100, this.choles*poids/100};
        return nutriTab;
    }

    public String toString(){
        return super.toString()+" Cholésterol : "+this.choles+" mg";
    }

    public Viande clone(){
        return new Viande(this.nom, this.cal, this.carb, this.gras, this.prot, this.choles, this.poids);
    }
}
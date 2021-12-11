public class Viande extends ParPoids{

    private double choles;

    public Viande(String nom, double cal, double carb, double gras, double prot, double poids,double choles){
        super(nom, cal, carb, gras, prot, poids);
        this.choles = choles;
    }

}
public class Feculent extends ParPoids{

    public Feculent(String nom, double cal, double carb, double gras, double prot, double poids){
        super(nom, cal, carb, gras, prot, poids);
    }

    public Feculent clone(){
        return new Feculent(super.nom, super.cal, super.carb, super.gras, super.prot, super.poids);
    }
     


}
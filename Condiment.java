public class Condiment extends ParVolume{

    public Condiment(String nom, double cal, double carb, double gras, double prot, double vol){
        super(nom, cal, carb, gras, prot, vol);
    }

    public Condiment clone(){
        return new Condiment(super.nom, super.cal, super.carb, super.gras,super.prot,super.vol);
    }

}
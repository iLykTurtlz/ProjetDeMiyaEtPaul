public class Boisson extends ParVolume{

    public Boisson(String nom, double cal, double carb, double gras, double prot, double vol){
        super(nom, cal, carb, gras, prot, vol);
    }

    public Boisson clone(){
        return new Boisson(super.nom, super.cal, super.carb, super.gras,super.prot,super.vol);
    }
    
}
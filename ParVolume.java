public abstract class ParVolume extends Ingredient{

    private double vol;

    public ParVolume(String nom, double cal, double carb, double gras, double prot, double vol){
        super(nom, cal, carb, gras, prot);
        this.vol = vol;
    }




}
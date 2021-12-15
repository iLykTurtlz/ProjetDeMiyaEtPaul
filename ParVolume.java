public abstract class ParVolume extends Ingredients{

    private double vol; //mL

    public ParVolume(String nom, double cal, double carb, double gras, double prot, double vol){
        super(nom, cal, carb, gras, prot);
        this.vol = vol;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*vol/250,super.carb*vol/250,super.gras*vol/250,super.prot*vol/250};
        return nutriTab;
    }




}
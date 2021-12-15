public abstract class ParVolume extends Ingredients{

    protected double vol; //mL

    public ParVolume(String nom, double cal, double carb, double gras, double prot, double vol){
        super(nom, cal, carb, gras, prot);
        this.vol = vol;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*vol/250,super.carb*vol/250,super.gras*vol/250,super.prot*vol/250};
        return nutriTab;
    }
    public void setQte(double qte){
        this.vol = qte;
    }

    public boolean equals(Ingredients i){
        if(i.getClass()!=this.getClass()){
            return false;
        }
        return (this.nom).equals(i.nom)&&(this.cal==i.cal)&&(this.carb==i.carb)&&(this.gras==i.gras)&&(this.prot==i.prot)&&(this.vol==(((ParVolume)i).vol));
    }

}
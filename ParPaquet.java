public class ParPaquet extends Ingredients{

    private double proportion;

    public ParPaquet(String nom, double cal, double carb, double gras, double prot, double proportion){
        super(nom, cal, carb, gras, prot);
        this.proportion = proportion;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*proportion,super.carb*proportion,super.gras*proportion,super.prot*proportion};
        return nutriTab;
    }

    public ParPaquet clone(){
        return new ParPaquet(this.nom, this.cal, this.carb, this.gras, this.prot,this.proportion);
    }

    public void setQte(double qte){
        this.proportion = qte;
    }

    public boolean equals(Ingredients i){
        if(i.getClass()!=this.getClass()){
            return false;
        }
        return (this.nom).equals(i.nom)&&(this.cal==i.cal)&&(this.carb==i.carb)&&(this.gras==i.gras)&&(this.prot==i.prot)&&(this.proportion==(((ParPaquet)i).proportion));
    }


}

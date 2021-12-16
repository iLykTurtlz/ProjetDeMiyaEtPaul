public class ParPoids extends Ingredients{

    protected double poids;

    public ParPoids(String nom, double cal, double carb, double gras, double prot, double poids){
        super(nom, cal, carb, gras, prot);
        this.poids = poids;
    }

    public double[] getNutri(){
        double[] nutriTab = {super.cal*poids/100,super.carb*poids/100,super.gras*poids/100,super.prot*poids/100};
        return nutriTab;
    }

    public void setQte(double qte){
        this.poids = qte;
    }

    public boolean equals(Ingredients i){
        if(i.getClass()!=this.getClass()){
            return false;
        }
        return (this.nom).equals(i.nom)&&(this.cal==i.cal)&&(this.carb==i.carb)&&(this.gras==i.gras)&&(this.prot==i.prot)&&(this.poids==(((ParPoids)i).poids));
    }
    public ParPoids clone(){
        return new ParPoids(super.nom, super.cal, super.carb, super.gras, super.prot, this.poids);
    }   

}
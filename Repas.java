public class Repas{

    private Recette entree;
    private Recette plat;
    private Recette dessert;


    public Repas(Recette entree, Recette plat, Recette dessert){
        this.entree = entree;
        this.plat = plat;
        this.dessert = dessert;
    }

	public double[] calculNutri(){
		double[] nutriTab= new double[5];
		double[] nutriTabE = this.entree.calculNutri();
		double[] nutriTabP = this.plat.calculNutri();
		double[] nutriTabD = this.dessert.calculNutri();

		for(int i=0; i<nutriTab.length; i++){
			nutriTab[i] = nutriTabE[i]+nutriTabP[i]+nutriTabD[i];
		}
		
		return nutriTab;
	}

    public static Repas genererRepasMidi(Regime r, LivreDeRecettes entrees, LivreDeRecettes plats, LivreDeRecettes desserts, double[] nutriJournee){
        Recette monEntree = Recette.genererRecetteMidi(r,entrees,nutriJournee);
        Recette monPlat = Recette.genererRecetteMidi(r,plats,nutriJournee);
        Recette monDessert = Recette.genererRecetteMidi(r,desserts,nutriJournee);
        return new Repas(monEntree,monPlat,monDessert);
    }
    public static Repas genererRepasSoir(Regime r, LivreDeRecettes entrees, LivreDeRecettes plats, LivreDeRecettes desserts, double[] nutriJournee){
        Recette monEntree = Recette.genererRecetteSoir(r,entrees,nutriJournee);
        Recette monPlat = Recette.genererRecetteSoir(r,plats,nutriJournee);
        Recette monDessert = Recette.genererRecetteSoir(r,desserts,nutriJournee);
        return new Repas(monEntree,monPlat,monDessert);
    }
    
    public String toString(){
        String s="";
        s+=this.entree.toString()+"\n";
        s+=this.plat.toString()+"\n";
        s+=this.dessert.toString()+"\n";
        return s;
    }


}
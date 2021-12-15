public class Repas{

    private Entree entree;
    private Plat plat;
    private Dessert dessert;


    public Repas(Entree entree, Plat plat, Dessert dessert){
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
        Entree monEntree = Recette.genererRecetteMidi(r,entrees,nutriJournee);
        Plat monPlat = Recette.genererRecetteMidi(r,plats,nutriJournee);
        Dessert monDessert = Recette.genererRecetteMidi(r,desserts,nutriJournee);
        return new Repas(monEntree,monPlat,monDessert);
    }


}
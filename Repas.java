public class Repas{

    private String nom;
    private Entree entree;
    private Plat plat;
    private Dessert dessert;

    public Repas(String nom, Entree entree, Plat plat, Dessert dessert){
        this.nom = nom;
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


}
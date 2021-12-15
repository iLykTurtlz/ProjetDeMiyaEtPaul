public class Recette{

    protected String nom;
    protected Ingredients[] tabIngredients;

    public Recette(String nom,Ingredients[] tabIngredients){
        this.nom=nom;
        this.tabIngredients = tabIngredients;

    }

    public double[] calculNutri(){
        double[] nutriTab = {0,0,0,0,0};//cal, carb, gras, prot, choles
        for(int i=0; i<this.tabIngredients.length;i++){
            double [] nutriTabIngre = this.tabIngredients[i].getNutri();
            if (this.tabIngredients[i] instanceof Viande){
                nutriTab[nutriTab.length-1]+=nutriTabIngre[nutriTabIngre.length-1];
                for(int j=0; j<nutriTabIngre.length-1;j++){
                    nutriTab[j]+=nutriTabIngre[j];
                }
            }
            else{
                for(int j=0; j<nutriTabIngre.length;j++){
                    nutriTab[j]+=nutriTabIngre[j];
                }
            }
        }
        return nutriTab;
    }

    public String toString(){
        String s =this.nom+" : \n";
        for(int i=0; i<this.tabIngredients.length; i++){
            s+=this.tabIngredients[i].toString()+"\n";
        }
        return s;
    }
}
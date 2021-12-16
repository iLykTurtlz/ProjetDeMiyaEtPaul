import java.util.ArrayList;
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

    public Recette clone(){
        Ingredients [] cloneTabIngredients = new Ingredients[this.tabIngredients.length];
        for(int i=0; i<cloneTabIngredients.length; i++){
            cloneTabIngredients[i]= this.tabIngredients[i].clone();
        }
        return new Recette(this.nom,cloneTabIngredients);
    }

    public static Recette genererRecetteSoir(Regime r, LivreDeRecettes l, double[] nutriJournee){
        
        ArrayList<Recette> liste_recettes = l.getLivre();
        int idx = (int)(Math.random()*(liste_recettes.size()));
        int securite_iterateur = 0;
        while(((liste_recettes.get(idx).calculNutri()[0]>(r.getCalMinMax()[1]-nutriJournee[0])
            || liste_recettes.get(idx).calculNutri()[1]>(r.getCarbMinMax()[1]-nutriJournee[1])
            || liste_recettes.get(idx).calculNutri()[2]>(r.getGrasMinMax()[1]-nutriJournee[2])
            || liste_recettes.get(idx).calculNutri()[3]>(r.getProtMinMax()[1])-nutriJournee[3])
            || liste_recettes.get(idx).calculNutri()[0]<(r.getCalMinMax()[0]+nutriJournee[0])
            || liste_recettes.get(idx).calculNutri()[1]<(r.getCalMinMax()[0]+nutriJournee[1])
            || liste_recettes.get(idx).calculNutri()[2]<(r.getCalMinMax()[0]+nutriJournee[2])
            || liste_recettes.get(idx).calculNutri()[3]<(r.getCalMinMax()[0]+nutriJournee[3]))
            && securite_iterateur<liste_recettes.size() ){
            idx = (int)(Math.random()*(liste_recettes.size()));
            securite_iterateur++;
        }
        Recette recetteSoir = liste_recettes.get(idx).clone();
        double[] nutriRecetteSoir = recetteSoir.calculNutri();
        for(int i=0; i<nutriRecetteSoir.length; i++){
            nutriJournee[i]+=nutriRecetteSoir[i];
        }

        return recetteSoir;
    }

    public static Recette genererRecetteMidi(Regime r, LivreDeRecettes l, double[] nutriJournee){
        
        ArrayList<Recette> liste_recettes = l.getLivre();
        int idx = (int)(Math.random()*(liste_recettes.size()));
        int securite_iterateur = 0;
        while(((liste_recettes.get(idx).calculNutri()[0]>(r.getCalMinMax()[1]-nutriJournee[0])
            || liste_recettes.get(idx).calculNutri()[1]>(r.getCalMinMax()[1]-nutriJournee[0])
            || liste_recettes.get(idx).calculNutri()[2]>(r.getCalMinMax()[1]-nutriJournee[0])
            || liste_recettes.get(idx).calculNutri()[3]>(r.getCalMinMax()[1]-nutriJournee[0]))) && securite_iterateur<liste_recettes.size() ){
            idx = (int)(Math.random()*(liste_recettes.size()));
            securite_iterateur++;
        }
        Recette recetteMidi = liste_recettes.get(idx).clone();
        double[] nutriRecetteMidi = recetteMidi.calculNutri();
        for(int i=0; i<nutriRecetteMidi.length; i++){
            nutriJournee[i]+=nutriRecetteMidi[i];
        }

        return recetteMidi;
    }

    public boolean equals(Recette r){
        if(!(this.nom.equals(r.nom))){
            return false;
        }
        if(this.tabIngredients.length!=r.tabIngredients.length){
            return false;
        }
        for(int i=0; i<this.tabIngredients.length; i++){
            if(!(this.tabIngredients[i].equals(r.tabIngredients[i]))){
                return false;
            }
        }
        return true;
    }

    
}
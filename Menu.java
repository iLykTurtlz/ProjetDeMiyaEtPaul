import java.util.ArrayList;
import java.util.Math;
public class Menu{

    private Regime monRegime;
    private LivreDeRecettes mesEntrees;
    private LivreDeRecettes mesPlats;
    private LivreDeRecettes mesDesserts;
    private int nbJours;
    private Repas[] monMenu;

    public Menu(Regime unRegime, LivreDeRecettes desEntrees, LivreDeRecettes desPlats, LivreDeRecettes desDesserts, int nbJours){
        this.monRegime = unRegime;
        this.mesEntrees = desEntrees;
        this.mesPlats = desPlats;
        this.mesDesserts = desDesserts;
        this.nbJours = nbJours;
        this.monMenu = new Repas[nbJours*2];
    }

    public void generer2Repas(){
        double [] nutriJournee = {0,0,0,0,0};
            
        ArrayList<Recette> liste_entrees = mesEntrees.getLivre();
        ArrayList<Recette> liste_plats = mesPlats.getLivre();
        ArrayList<Recette> liste_desserts = mesDesserts.getLivre();

        int idx_entreeMidi = (int)(Math.random*(liste_entrees.size()));
        int securite_iterateur = 0;
        while((liste_entrees.get(idx_entreeMidi).calculNutri()[0]>monRegime.getCalMinMax[1]
            || liste_entrees.get(idx_entreeMidi).calculNutri()[1]>monRegime.getCarbMinMax[1]
            || liste_entrees.get(idx_entreeMidi).calculNutri()[2]>monRegime.getGrasMinMax[1]
            || liste_entrees.get(idx_entreeMidi).calculNutri()[3]>monRegime.getProtMinMax[1]) && securite_iterateur<liste_entrees.size() ){
            idx_entreeMidi = (int)(Math.random*(liste_entrees.size()));
        }
        Entree entreeMidi = liste_entrees.get(idx_entreeMidi).clone();
        double[] nutriEntreeMidi = entreeMidi.calculNutri();
        for(int i=0; i<nutriEntreeMidi; i++){
            nutriJournee[i]+=nutriEntreeMidi[i];
        }

        


    }


}
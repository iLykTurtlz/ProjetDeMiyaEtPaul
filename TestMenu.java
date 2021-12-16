public class TestMenu{

    public static void main(String[] args){
        InventaireIngredients test = new InventaireIngredients("testInventaire.txt");
        test.genererInventaire();
        LivreDeRecettes livretest = new LivreDeRecettes("Mon livre de riz et steak, miam","testLivre.txt","testInventaire.txt");
        livretest.genererLivre();
        Regime.setRegime(1200,3000,56,78,96,130,10,20);
        InventaireIngredients ingDessert = new InventaireIngredients("InventaireDessert.txt");
        ingDessert.genererInventaire();
        LivreDeRecettes livreDesserts = new LivreDeRecettes("Mon livre de desserts","Desserts.txt","InventaireDessert.txt");
        livreDesserts.genererLivre();
        InventaireIngredients ingEntrees = new InventaireIngredients("InventaireEntree.txt");
        ingEntrees.genererInventaire();        
        LivreDeRecettes livreEntrees = new LivreDeRecettes("Mon livre d'entrées","Entrees.txt","InventaireEntree.txt");
        livreEntrees.genererLivre();
        Menu monMenu = new Menu(Regime.REGIME,livreEntrees,livretest,livreDesserts,1);
        monMenu.genererMenu();



    }
}
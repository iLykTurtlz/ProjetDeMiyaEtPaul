public class TestMenu{

    public static void main(String[] args){
        Regime monRegime = Regime.getInstance();
        double[][] contraintes=new double[5][];
        contraintes[0]=new double[2];
        contraintes[0][0]=1500;
        contraintes[0][1]=2000;
        contraintes[1]=new double[2];
        contraintes[1][0]=30;
        contraintes[1][1]=70;
        contraintes[2]=new double[2];
        contraintes[2][0]=300;
        contraintes[2][1]=700;
        contraintes[3]=new double[2];
        contraintes[3][0]=20;
        contraintes[3][1]=90;
        contraintes[4]=new double[1];
        contraintes[4][0]=150;

        monRegime.init(contraintes,"testInventaire.txt");
        InventaireIngredients test = new InventaireIngredients("testInventaire.txt");
        test.genererInventaire();
        LivreDeRecettes livretest = new LivreDeRecettes("Mon livre de riz et steak, miam","testLivre.txt","testInventaire.txt");
        livretest.genererLivre();
        InventaireIngredients ingDessert = new InventaireIngredients("InventaireDessert.txt");
        ingDessert.genererInventaire();
        LivreDeRecettes livreDesserts = new LivreDeRecettes("Mon livre de desserts","Desserts.txt","InventaireDessert.txt");
        livreDesserts.genererLivre();
        InventaireIngredients ingEntrees = new InventaireIngredients("InventaireEntree.txt");
        ingEntrees.genererInventaire();        
        LivreDeRecettes livreEntrees = new LivreDeRecettes("Mon livre d'entrées","Entrees.txt","InventaireEntree.txt");
        livreEntrees.genererLivre();
        Menu monMenu = new Menu(monRegime,livreEntrees,livretest,livreDesserts,1);
        monMenu.genererMenu();




    }
}
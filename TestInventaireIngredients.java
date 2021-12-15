public class TestInventaireIngredients{

    public static void main(String[] args){

        InventaireIngredients test = new InventaireIngredients("testInventaire.txt");
        test.genererInventaire();
        System.out.println(test.toString());
        LivreDeRecettes livretest = new LivreDeRecettes("Mon livre de riz et steak, miam","testLivre.txt","testInventaire.txt");
        livretest.genererLivre();
        System.out.println(livretest.toString());



    }
}
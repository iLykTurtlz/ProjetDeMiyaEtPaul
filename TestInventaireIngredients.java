public class TestInventaireIngredients{

    public static void main(String[] args){

        InventaireIngredients test = new InventaireIngredients("testInventaire.txt");
        test.genererInventaire();
        System.out.println(test.toString());



    }
}
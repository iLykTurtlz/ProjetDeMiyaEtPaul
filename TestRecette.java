public class TestRecette{

    public static void main(String[] args){
        Ingredients riz = new Feculent("Riz",45,85,02,63,100);
        Ingredients steak = new Viande("Steak",36,96,84,73,10,100);
        Ingredients [] tabIngre = {riz,steak};
        Recette test = new Recette("Steak riz",tabIngre);
        double [] nutriTab = test.calculNutri();
        double [] nutriRiz = riz.getNutri();
        for(int i=0; i<nutriTab.length; i++){
            System.out.println(nutriTab[i]);
        }
    }


}
import java.util.ArrayList;
public class Menu{

    private Regime monRegime;
    private LivreDeRecettes mesEntrees;
    private LivreDeRecettes mesPlats;
    private LivreDeRecettes mesDesserts;
    private int nbJours;
    private Repas[][] monMenu;

    public Menu(Regime unRegime, LivreDeRecettes desEntrees, LivreDeRecettes desPlats, LivreDeRecettes desDesserts, int nbJours){
        this.monRegime = unRegime;
        this.mesEntrees = desEntrees;
        this.mesPlats = desPlats;
        this.mesDesserts = desDesserts;
        this.nbJours = nbJours;
        this.monMenu = new Repas[nbJours][2];
    }

    public Repas[] generer2Repas(){
        double [] nutriJournee = {0,0,0,0,0};
        Repas repasMidi = Repas.genererRepasMidi(this.monRegime, this.mesEntrees, this.mesPlats, this.mesDesserts, nutriJournee);
        Repas repasSoir = Repas.genererRepasSoir(this.monRegime, this.mesEntrees, this.mesPlats, this.mesDesserts, nutriJournee);
        Repas [] tabRepasJour = {repasMidi,repasSoir};
        return tabRepasJour;
    }

    public static double[] calculNutriJour(Repas[] tabRepasJour){
        double [] nutriJournee = {0,0,0,0,0};
        for(int i=0; i<nutriJournee.length; i++){
            nutriJournee[i]=tabRepasJour[0].calculNutri()[i]+tabRepasJour[1].calculNutri()[i];
        }
        return nutriJournee;
    }

    public void genererMenu(){
        for(int i=0; i<this.nbJours; i++){
            this.monMenu[i]=this.generer2Repas();
            double[] nutriJour = calculNutriJour(this.monMenu[i]);
            System.out.println("Jour "+(i+1)+" : ");
            System.out.println("Midi : \n "+monMenu[i][0].toString());
            System.out.println("Soir : \n "+monMenu[i][1].toString());
            System.out.println("Bilan : ");
            //CALORIES
            if(nutriJour[0]<this.monRegime.getCalMinMax()[0]){
                System.out.println("Calories : "+nutriJour[0]+"cal, trop peu!");
            }
            else if(nutriJour[0]>this.monRegime.getCalMinMax()[1]){
                System.out.println("Calories : "+nutriJour[0]+"cal, trop!");
            }
            else{
                System.out.println("Calories : "+nutriJour[0]+"cal, parfait");
            }
            
            //CARBOHYDRATES
            if(nutriJour[1]<this.monRegime.getCarbMinMax()[0]){
                System.out.println("Carbohydrates : "+nutriJour[1]+"g, trop peu!");
            }
            else if(nutriJour[1]>this.monRegime.getCarbMinMax()[1]){
                System.out.println("Carbohydrates : "+nutriJour[1]+"g, trop!");
            }
            else{
                System.out.println("Carbohydrates : "+nutriJour[1]+"gl, parfait");
            }

            //GRAS
            if(nutriJour[2]<this.monRegime.getGrasMinMax()[0]){
                System.out.println("Gras : "+nutriJour[2]+"g, trop peu!");
            }
            else if(nutriJour[2]>this.monRegime.getGrasMinMax()[1]){
                System.out.println("Calories : "+nutriJour[2]+"g, trop!");
            }
            else{
                System.out.println("Calories : "+nutriJour[2]+"cal, parfait");
            }

            //PROTEINES

            if(nutriJour[3]<this.monRegime.getProtMinMax()[0]){
                System.out.println("Protéines : "+nutriJour[3]+"g, trop peu!");
            }
            else if(nutriJour[3]>this.monRegime.getProtMinMax()[1]){
                System.out.println("Protéines : "+nutriJour[3]+"g, trop!");
            }
            else{
                System.out.println("Protéines : "+nutriJour[3]+"g, parfait");
            }

        }


    }



}
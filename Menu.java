public class Menu{

    private Regime monRegime,
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
        this.monMenu = new Repas[nbJours];
    }

    public void genererMenu(){

    }


}
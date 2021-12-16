import java.util.ArrayList;
import java.io.*;

public class LivreDeRecettes{

    private ArrayList<Recette> tabRecettes;
    private String nom;
    private String fichiersrc;
    private InventaireIngredients inventaire;

    public LivreDeRecettes(String nom,String fichiersrc,String fichierinventaire){
        this.nom = nom;
        this.tabRecettes = new ArrayList<Recette>();
        this.fichiersrc = fichiersrc;
        this.inventaire = new InventaireIngredients(fichierinventaire);
        this.inventaire.genererInventaire();
    }

    public void setFichierSrc(String fichiersrc){
        this.fichiersrc = fichiersrc;
    }

    public void genererLivre(){
        
        try{
            File f = new File(this.fichiersrc);
            BufferedReader bf =new BufferedReader(new FileReader(f));
            String line;
            ArrayList<String> noms_recettes = new ArrayList<String>();
            ArrayList <ArrayList <String>> lst_data_recettes_labels = new ArrayList<ArrayList <String>>();
            ArrayList <ArrayList <Double>> lst_data_recettes_qte = new ArrayList<ArrayList <Double>>();
            int instr = 1;
            while ((line = bf.readLine()) != null){
                if (!(line.charAt(0)=='#')){
                    if(instr == 1){
                        noms_recettes.add(line);
                        lst_data_recettes_labels.add(new ArrayList<String>());
                        lst_data_recettes_qte.add(new ArrayList<Double>());
                        instr=0;
                    }
                    else{
                        String[] data = line.split(" ");
                        lst_data_recettes_labels.get(lst_data_recettes_labels.size()-1).add(data[0]);
                        lst_data_recettes_qte.get(lst_data_recettes_qte.size()-1).add(Double.valueOf(data[1]));
                    }   
                }
                else{
                    
                    instr = 1;
                }
            }
            bf.close();
            for(int i=0; i<noms_recettes.size(); i++){
                int nbIngredients = lst_data_recettes_labels.get(i).size();
                Ingredients [] tabI = new Ingredients[nbIngredients];
                for(int j=0; j<nbIngredients; j++){
                    ArrayList<Ingredients> inventaireTab = inventaire.getTabIngredients();
                    int k=0;
                    while((k<inventaireTab.size()-1)&&!(inventaireTab.get(k).getNom().equals(lst_data_recettes_labels.get(i).get(j)))){
                        k++;
                    }
                    tabI[j]=inventaireTab.get(k).clone();
                    tabI[j].setQte(lst_data_recettes_qte.get(i).get(j));

                }
                Recette recette = new Recette(noms_recettes.get(i),tabI);
                this.tabRecettes.add(recette);
            }
        }
        catch(IOException ioe){
        }
    }

    public String toString(){
        String s=this.nom+" :\n";
        for(int i=0; i<this.tabRecettes.size();i++){
            s+=this.tabRecettes.get(i).toString()+"\n\n";
        }
        return s;
    }

    public ArrayList<Recette> getLivre(){
        return this.tabRecettes;
    }
    


}
import java.util.ArrayList;
import java.io.*;

public class InventaireIngredients{

    private ArrayList<Ingredients> tabIngredients;
    private String fichiersrc;

    public InventaireIngredients(String fichiersrc){
        this.tabIngredients = new ArrayList<Ingredients>();
        this.fichiersrc = fichiersrc;

    }

    public void setFichierSrc(String fichiersrc){
        this.fichiersrc = fichiersrc;
    }

    public void genererInventaire(){
        
        try{
            File f = new File(this.fichiersrc);
            BufferedReader bf =new BufferedReader(new FileReader(f));
            String line;
            while ((line = bf.readLine()) != null){
                String[] data = line.split(" ");
                String name = data[1];
                Double cal = Double.valueOf(data[2]);
                Double carb = Double.valueOf(data[3]);
                Double gras = Double.valueOf(data[4]);
                Double prot = Double.valueOf(data[5]);
                if(data[0].equals("Ingredient")){
                    Ingredients ing = new Ingredients(name,cal,carb,gras,prot);
                    this.tabIngredients.add(ing);
                }
                else if(data[0].equals("ParPaquet")){
                    ParPaquet ing = new ParPaquet(name,cal,carb,gras,prot,Double.valueOf(data[6]));
                    this.tabIngredients.add(ing);
                }
                else if(data[0].equals("Viande")){
                    Viande ing = new Viande(name,cal,carb,gras,prot,Double.valueOf(data[6]),Double.valueOf(data[7]));
                    this.tabIngredients.add(ing);
                }
                else if(data[0].equals("Feculent")){
                    Feculent ing = new Feculent(name,cal,carb,gras,prot,Double.valueOf(data[6]));
                    this.tabIngredients.add(ing);
                }
                else if(data[0].equals("Boisson")){
                    Boisson ing = new Boisson(name,cal,carb,gras,prot,Double.valueOf(data[6]));
                    this.tabIngredients.add(ing);
                }
                else if(data[0].equals("Condiment")){
                    Condiment ing = new Condiment(name,cal,carb,gras,prot,Double.valueOf(data[6]));
                    this.tabIngredients.add(ing);
                }
        

            }
            bf.close();
        }
        catch(IOException ioe){
            System.out.println("Erreur");
        }

    }

    public String toString(){
        String s="";
        for(int i=0; i<this.tabIngredients.size(); i++){
            s+=tabIngredients.get(i).toString()+"\n";
        }
        return s;
    }

    public ArrayList<Ingredients> getTabIngredients(){
        return this.tabIngredients;
    }
    


}
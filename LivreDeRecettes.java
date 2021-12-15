import java.util.ArrayList;
import java.io.*;

public class LivreDeRecettes{

    private ArrayList<Recette> tabRecettes;
    private String nom;
    private String fichiersrc;

    public LivreDeRecettes(String nom,String fichiersrc){
        this.nom = nom;
        this.tabRecettes = new ArrayList<Recette>();
        this.fichiersrc = fichiersrc;

    }

    public void setFichierSrc(String fichiersrc){
        this.fichiersrc = fichiersrc;
    }

    public void genererLivre(){
        
        try{
            File f = new File(this.fichiersrc);
            BufferedReader bf =new BufferedReader(new FileReader(f));
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
            bf.close();
        }
        catch(IOException ioe){
            
        }

    }
    


}
import java.util.Scanner;
import java.io.*;

public class Main   {
    public static void main(String[] args)  {
        File regime = new File("./regime.txt");
        //FileInputStream in = new FileInputStream(regime);
        Scanner s = new Scanner(System.in);

        double[][] contraintes = new double[5][];
        int i;
        for (i=0; i<contraintes.length-1; i++)    {
            contraintes[i] = new double[2];
        }
        contraintes[i] = new double[1];
        //0 : calories min/max
	    //1 : carbohydrates min/max
	    //2 : matières grasses min/max
	    //3 : protéine min/max
	    //4 : cholestérol max

        //String line = scanner.nextLine();

        if (regime.exists())    {
            System.out.println("Vous suivez toujours le même régime?  Si oui, tapez clé de retour.  Sinon, Tapez 'non' puis clé de retour.");
            String line = s.nextLine();
            line.toLowerCase();
            line.replaceAll("\\s","");
            if (line == "non")  {
                if (regime.delete())    {
                    System.out.println("D'accord.  On recommence.");
                }
                else {
                    System.out.println("Erreur");
                }
            }
        }
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String entree = br.readLine();
            String[] chaines= input().trim().split("\\s+");
            cpt=0;
            for (int i=0; i<calMinMax.length;i++)   {
                calMinMax[i]=Double.parseDouble(chaines[cpt]);
                cpt++;
            }
            for (int i=0; i<carbMinMax.length;i++)   {
                carbMinMax[i]=Double.parseDouble(chaines[cpt]);
                cpt++;
            }
            for (int i=0; i<grasMinMax.length;i++)   {
                grasMinMax[i]=Double.parseDouble(chaines[cpt]);
                cpt++;
            }
            for (int i=0; i<calMinMax.length;i++)   {
                protMinMax[i]=Double.parseDouble(chaines[cpt]);
                cpt++;
            }
            cholesterolMax=Double.parseDouble(chaines[cpt]);
            cpt++;


        } catch (FileNotFoundException fnfe)    {

            //Scanner s = new Scanner(System.in);
            System.out.println("Régime planning application");
            System.out.println("Nouveau régime");
            System.out.println("Veuillez saisir les contraintes qui définissent votre régime.");
            System.out.println("S'il n'y a pas de valeur minimale, saisir 0.");

            boolean satisfait = true;
            do  {
                while (true)    {
                    try {
                        System.out.print("Calories min : ");
                        contraintes[0][0]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le minimum de calories à "+calMinMax[0]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Calories max : ");
                        contraintes[0][1]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le maximum de calories à "+calMinMax[1]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Carbohydrate min : ");
                        contraintes[1][0]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le minimum de carbohydrates à "+carbMinMax[0]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Carbohydrate max : ");
                        contraintes[1][1]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le maximum de carbohydrates à "+carbMinMax[1]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Matières grasses min : ");
                        contraintes[2][0]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le minimum de matières grasses à "+grasMinMax[0]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Matières grasses max : ");
                        contraintes[2][1]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le maximum de matières grasses à "+grasMinMax[1]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Protéine min : ");
                        contraintes[3][0]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le minimum de protéine à "+protMinMax[0]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Protéine max : ");
                        contraintes[3][1]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le maximum de protéine à "+protMinMax[1]);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }
                while (true)    {
                    try {
                        System.out.print("Cholestérol max : ");
                        contraintes[4][0]=Double.parseDouble(line);
                        System.out.println("Vous avez fixé le maximum de cholestérol à "+cholesterol);
                        break;
                    } catch(Exception e)   {
                        System.out.println("Veuillez entrer un nombre, avec ou sans décimal.");
                    }
                }

                String format = "-25.25s : %7.2f";
                System.out.println();
                System.out.println(String.format(format,"Calories min",contraintes[0][0]));
		        System.out.println(String.format(format,"Calories max",contraintes[0][1]));
		        System.out.println(String.format(format,"Carbohydrates min",contraintes[1][0]));
		        System.out.println(String.format(format,"Carbohydrates max",contraintes[1][1]));
		        System.out.println(String.format(format,"Matières grasses min",contraintes[2][0]));
		        System.out.println(String.format(format,"Matières grasses max",contraintes[2][1]));
		        System.out.println(String.format(format,"Protéine min",contraintes[3][0]));
		        System.out.println(String.format(format,"Protéine max",contraintes[3][1]));
		        System.out.println(String.format(format,"Cholestérol max",contraintes[4][0]));
                System.out.println();

                System.out.println("Vous êtes satisfait de vos choix de contraintes?  Si oui, tapez clé de retour.  Sinon, Tapez 'non' puis clé de retour.");
                String rep = scanner.nextLine();
                if (rep == "non")   {
                    satisfait = false;
                }
            } while (!satisfait);

            Regime r = Regime.getInstance();
            r.init(contraintes,"./regime.txt");
            r.save();

        } catch (IOException e) {
            e.printStackTrace();
            
        } finally   {
            if (regime != null) {
                regime.close();
            }
        }
            
        
    }
}
import java.io.*;

public class Regime implements Sauvegardable {
	private static final Regime REGIME = new Regime();
	private double[][] contraintes = new double[5][];
	private String fichiersrc;
	//0 : calories min/max
	//1 : carbohydrates min/max
	//2 : matières grasses min/max
	//3 : protéine min/max
	//4 : cholestérol max

	private Regime()	{
		int i;
		for (i=0; i<(contraintes.length-1); i++)	{
			contraintes[i]=new double[2];
			for (int j=0; j<contraintes[i].length; j++)	{
				contraintes[i][j]=-1;
			}
		}
		contraintes[i]=new double[1];
		contraintes[i][0]=-1;
	}

	public static Regime getInstance() 	{
		return REGIME;
	}

	public void init(double[][] contraintes, String fichiersrc)	{
		for (int i=0; i<contraintes.length; i++)	{
			for (int j=0; j<contraintes[i].length; j++)	{
				this.contraintes[i][j]=contraintes[i][j];
			}
		}	
	}

	public void save()	{
		File f=null;
		BufferedWriter bw=null;
		try{
			f = new File(fichiersrc);
			bw = new BufferedWriter(new FileWriter(f));
			for (int i=0; i<contraintes.length; i++)	{
				for (int j=0; j<contraintes[i].length; j++)	{
					bw.write(String.valueOf(contraintes[i][j]+" "));
				}
			}
			bw.close();
		} catch (IOException e)	{
			e.printStackTrace();
		} 
	}

	public double[][] getContraintes()	{
		return contraintes;
	}

	public String toString()	{
		String format = "-25.25s : %7.2f";
		String res = "REGIME\n";
		res += String.format(format,"Calories min",contraintes[0][0]);
		res += "\n"+String.format(format,"Calories max",contraintes[0][1]);
		res += "\n"+String.format(format,"Carbohydrates min",contraintes[1][0]);
		res += "\n"+String.format(format,"Carbohydrates max",contraintes[1][1]);
		res += "\n"+String.format(format,"Matières grasses min",contraintes[2][0]);
		res += "\n"+String.format(format,"Matières grasses max",contraintes[2][1]);
		res += "\n"+String.format(format,"Protéine min",contraintes[3][0]);
		res += "\n"+String.format(format,"Protéine max",contraintes[3][1]);
		res += "\n"+String.format(format,"Cholestérol max",contraintes[4][0]);
		return res;
	}
}

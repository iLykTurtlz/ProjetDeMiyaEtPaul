public class Regime{

    private double[] calMinMax;
    private double[] carbMinMax;
    private double[] grasMinMax;
    private double[] protMinMax;
    public static Regime REGIME = new Regime();

    private Regime(){
        this.calMinMax = new double[2];
        this.carbMinMax = new double[2];
        this.grasMinMax = new double[2];
        this.protMinMax = new double[2];
    }

    public static void setRegime(double calMin, double calMax, double carbMin, double carbMax, double grasMin, double grasMax, double protMin, double protMax){
        REGIME.calMinMax[0]=calMin;
        REGIME.calMinMax[1]=calMax;
        REGIME.carbMinMax[0]=carbMin;
        REGIME.carbMinMax[1]=carbMax;
        REGIME.grasMinMax[0]=grasMin;
        REGIME.grasMinMax[1]=grasMax;
        REGIME.protMinMax[0]=protMin;
        REGIME.protMinMax[1]=protMax;
    }

    public static void setCalMinMax(double calMin, double calMax){
        REGIME.calMinMax[0]=calMin;
        REGIME.calMinMax[1]=calMax;
    }

    public static void setCarbMinMax(double carbMin, double carbMax){
        REGIME.carbMinMax[0]=carbMin;
        REGIME.carbMinMax[1]=carbMax;
    }

    public static void setGrasMinMax(double grasMin, double grasMax){
        REGIME.grasMinMax[0]=grasMin;
        REGIME.grasMinMax[1]=grasMax;
    }

    public static void setProtMinMax(double protMin, double protMax){
        REGIME.protMinMax[0]=protMin;
        REGIME.protMinMax[1]=protMax;
    }

    public static double[] getCalMinMax(){
        return REGIME.calMinMax;
    }

    public static double[] getCarbMinMax(){
        return REGIME.calMinMax;
    }

    public static double[] getGrasMinMax(){
        return REGIME.calMinMax;
    }

    public static double[] getProtMinMax(){
        return REGIME.calMinMax;
    }


}

public class Regime{

    private double[] calMinMax;
    private double[] carbMinMax;
    private double[] grasMinMax;
    private double[] protMinMax;
    private static Regime REGIME = new Regime();

    private Regime(){
        this.calMinMax = new double[2];
        this.carbMinMax = new double[2];
        this.grasMinMax = new double[2];
        this.protMinMax = new double[2];
    }

    public void setRegime(double calMin, double calMax, double carbMin, double carbMax, double grasMin, double grasMax, double protMin, double protMax){
        this.calMinMax[0]=calMin;
        this.calMinMax[1]=calMax;
        this.carbMinMax[0]=carbMin;
        this.carbMinMax[1]=carbMax;
        this.grasMinMax[0]=grasMin;
        this.grasMinMax[1]=grasMax;
        this.protMinMax[0]=protMin;
        this.protMinMax[1]=protMax;
    }

    public void setCalMinMax(double calMin, double calMax){
        this.calMinMax[0]=calMin;
        this.calMinMax[1]=calMax;
    }

    public void setCarbMinMax(double carbMin, double carbMax){
        this.carbMinMax[0]=carbMin;
        this.carbMinMax[1]=carbMax;
    }

    public void setGrasMinMax(double grasMin, double grasMax){
        this.grasMinMax[0]=grasMin;
        this.grasMinMax[1]=grasMax;
    }

    public void setProtMinMax(double protMin, double protMax){
        this.protMinMax[0]=protMin;
        this.protMinMax[1]=protMax;
    }

    public double[] getCalMinMax(){
        return this.calMinMax;
    }

    public double[] getCarbMinMax(){
        return this.calMinMax;
    }

    public double[] getGrasMinMax(){
        return this.calMinMax;
    }

    public double[] getProtMinMax(){
        return this.calMinMax;
    }



}

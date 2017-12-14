public class Nut implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER=0.01;
    public static final double USD_MULTIPLIER=0.5;

    public Nut(double diameterInches){
    this.diameterInches=diameterInches;
    }

    public double getCost(){
        return 0.5*diameterInches;
    }

    public String getName(){
        return "nut";
    }

    public double getWeight(){
        return 0.01*diameterInches*diameterInches;
    }

    public void printBillOfMaterials(){

    }
}

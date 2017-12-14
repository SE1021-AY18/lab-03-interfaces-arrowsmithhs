public class Bolt implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER=0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER=1.00;

    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches=diameterInches;
        this.lengthInches=lengthInches;
    }

    public double getCost(){

    }

    public String getName(){
        return "bolt";
    }

    public double getWeight(){

    }

    public void printBillOfMaterials(){

    }
}

public class Nut implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER=0.01;
    public static final double USD_MULTIPLIER=0.5;

    public Nut(double diameterInches){
    this.diameterInches=diameterInches;
    }

    public double getCost(){
        return USD_MULTIPLIER*diameterInches;
    }

    public String getName(){
        return "nut";
    }

    public double getWeight(){
        return LBS_MULTIPLIER*diameterInches*diameterInches;
    }

    public String getDimensions() {
        return String.valueOf(diameterInches);
    }

    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
                this.getDimensions()+this.getName()+"\n" +
                "==========================\n" +
                "Diameter: "+diameterInches+"inches\n" +
                "Cost: "+this.getCost()+
                "Weight: "+this.getWeight()+" lbs");
    }
}

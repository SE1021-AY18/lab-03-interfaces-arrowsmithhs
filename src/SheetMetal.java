import java.text.DecimalFormat;

public class SheetMetal implements Part{
    public static final double LBS_MULTIPLIER=0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER=0.50;
    private double widthInches;
    private static DecimalFormat costFormat=new DecimalFormat("$#,##0.00");
    private static DecimalFormat weightFormat=new DecimalFormat("#.#");


    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches=lengthInches;
        this.widthInches=widthInches;
        this.thicknessInches=thicknessInches;
    }

    public double getCost(){
        return USD_MULTIPLIER*thicknessInches*widthInches*lengthInches;
    }

    public String getName(){
        return "sheet";
    }

    public double getWeight(){
        return LBS_MULTIPLIER*thicknessInches*widthInches*lengthInches;
    }

    public String getDimensions(){
        return lengthInches+"x"+widthInches+"x"+thicknessInches;
    }

    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
                this.getDimensions()+this.getName()+"\n" +
                "==========================\n" +
                "Length: "+lengthInches+"inches\n" +
                "Width: "+widthInches+"inches"+
                "Thickness: "+thicknessInches+"inches"+
                "Cost: "+this.getCost()+
                "Weight: "+this.getWeight()+" lbs");
    }
}

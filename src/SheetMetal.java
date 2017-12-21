/*
 * SE1021
 * Winter 2017
 * Lab Lab2
 * Name: Steve Arrowsmith
 * Created December 14, 2017
 */

import java.text.DecimalFormat;

/**
 * Represents information about a part
 *
 * @author Steve Arrowsmith
 * @version 1.0
 */
public class SheetMetal implements Part {
    public static final double LBS_MULTIPLIER = 0.1;//Weight per thickness * width * length inches^3 of a sheet
    private double lengthInches;//Length of the sheet
    private double thicknessInches;//Thickness of the sheet
    public static final double USD_MULTIPLIER = 0.50;//Cost per thickness * width * length inches^3 of a sheet
    private double widthInches;//Width of the sheet
    private static DecimalFormat costFormat = new DecimalFormat("$#,##0.00");//Format for displaying cost
    private static DecimalFormat weightFormat = new DecimalFormat("#.###");//Format for displaying weight

    /**
     * Represents information about a part SheetMetal
     *
     * @param lengthInches    length of the sheet
     * @param widthInches     width of the sheet
     * @param thicknessInches thickness of the sheet
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

    public double getCost() {
        return USD_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    public String getName() {
        return "sheet";
    }

    public double getWeight() {
        return LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    public String getDimensions() {
        return lengthInches + "x" + widthInches + "x" + thicknessInches;
    }

    /**
     * Prints information about a Part
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                this.getDimensions() + " " + this.getName() + "\n" +
                "==========================\n" +
                "Length: " + lengthInches + " inches\n" +
                "Width: " + widthInches + " inches\n" +
                "Thickness: " + thicknessInches + " inches\n" +
                "Cost: " + costFormat.format(this.getCost()) + "\n" +
                "Weight: " + weightFormat.format(this.getWeight()) + " lbs\n");
    }
}

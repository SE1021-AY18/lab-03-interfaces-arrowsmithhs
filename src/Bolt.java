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
public class Bolt implements Part {
    private double diameterInches;//Diameter of the Bolt
    public static final double LBS_MULTIPLIER = 0.05;//Weight per diamerter^2 * length inches^3 of bolt
    private double lengthInches;//Length of the bolt
    public static final double USD_MULTIPLIER = 1.00;//Cost per diameter * length inches^2 of a bolt
    private static DecimalFormat costFormat = new DecimalFormat("$#,##0.00");//Format for displaying cost
    private static DecimalFormat weightFormat = new DecimalFormat("#.###");//Format for displaying weight

    /**
     * Represents information about a part Bolt
     *
     * @param diameterInches diameter of the bolt
     * @param lengthInches   length of the bolt
     */
    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    public double getCost() {
        return USD_MULTIPLIER * diameterInches * lengthInches;
    }

    public String getName() {
        return "bolt";
    }

    public double getWeight() {
        return LBS_MULTIPLIER * diameterInches * diameterInches * lengthInches;
    }

    public String getDimensions() {
        return diameterInches + "x" + lengthInches;
    }

    /**
     * Prints information about a bolt
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                this.getDimensions() + " " + this.getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Length: " + lengthInches + " inches\n" +
                "Cost: " + costFormat.format(this.getCost()) + "\n" +
                "Weight: " + weightFormat.format(this.getWeight()) + " lbs");
    }
}

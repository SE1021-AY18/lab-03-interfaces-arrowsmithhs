/*
 * SE1021
 * Winter 2017
 * Lab Lab2
 * Name: Steve Arrowsmith
 * Created December 14, 2017
 */

import java.text.DecimalFormat;

/**
 * Represents information about a part Nut
 *
 * @author Steve Arrowsmith
 * @version 1.0
 */
public class Nut implements Part {
    private double diameterInches;//diameter of the Nut
    public static final double LBS_MULTIPLIER = 0.01;//Weight per square inch
    public static final double USD_MULTIPLIER = 0.5;//Cost per diameter inch
    private static DecimalFormat costFormat = new DecimalFormat("$#,##0.00");//Format for displaying cost
    private static DecimalFormat weightFormat = new DecimalFormat("#.###");//Format for displaying weight

    /**
     * Represents information about a part Nut
     *
     * @param diameterInches diameter of the nut
     */
    public Nut(double diameterInches) {
        this.diameterInches = diameterInches;
    }

    public double getCost() {
        return USD_MULTIPLIER * diameterInches;
    }

    public String getName() {
        return "nut";
    }

    public double getWeight() {
        return LBS_MULTIPLIER * diameterInches * diameterInches;
    }

    public String getDimensions() {
        return String.valueOf(diameterInches);
    }

    /**
     * Prints information about a Part
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                this.getDimensions() + " inch " + this.getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Cost: " + costFormat.format(this.getCost()) +
                "\nWeight: " + weightFormat.format(this.getWeight()) + " lbs");
    }
}

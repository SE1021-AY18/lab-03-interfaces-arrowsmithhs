/*
 * SE1021
 * Winter 2017
 * Lab Lab2
 * Name: Steve Arrowsmith
 * Created December 14, 2017
 */

import java.text.DecimalFormat;

/**
 * Represents information about a collections of parts
 *
 * @author Steve Arrowsmith
 * @version 1.0
 */
public class Duplicate implements Part {
    private static DecimalFormat costFormat = new DecimalFormat("$#,##0.00");//Format for displaying cost
    private Part identicalPart;//Part being duplicated
    private int numDuplicates;//Number of duplicate parts
    public static final double REDUCTION_FACTOR1 = 0.95;//Discount for first discounted tier
    public static final double REDUCTION_FACTOR2 = 0.9;//Discount for second discounted tier
    public static final int USD_THRESHOLD1 = 5;//Threshold for first discounted tier
    public static final int USD_THRESHOLD2 = 10;//Threshold for second discounted tier
    private static DecimalFormat weightFormat = new DecimalFormat("#.###");//Format for displaying weight

    /**
     * Represents information about a collection of parts
     *
     * @param identicalPart part being duplicated
     * @param numDuplicates number of copies of the part
     */
    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    public double getCost() {
        double cost = identicalPart.getCost() * numDuplicates;
        if (numDuplicates >= USD_THRESHOLD1 && numDuplicates < USD_THRESHOLD2) {//applies discount for valid quantities
            cost *= REDUCTION_FACTOR1;
        }
        if (numDuplicates >= USD_THRESHOLD2) {//applies discount for valid quantities
            cost *= REDUCTION_FACTOR2;
        }
        return cost;
    }

    public String getName() {
        return identicalPart.getName();
    }

    public double getWeight() {
        return identicalPart.getWeight() * numDuplicates;
    }

    @Override
    public String getDimensions() {
        return identicalPart.getDimensions();
    }

    /**
     * Prints information about a collection of Parts
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                numDuplicates + " " + identicalPart.getDimensions() + " " + identicalPart.getName() + "s\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getDimensions() + " " + identicalPart.getName() + "\n" +
                "Copies: " + numDuplicates + "\n" +
                "Individual cost: " + costFormat.format(identicalPart.getCost()) + "\n" +
                "Individual weight: " + weightFormat.format(this.getWeight() / numDuplicates) + " lbs");
        System.out.println("\n" +
                "Total cost: " + costFormat.format(this.getCost()) +
                "\nTotal weight: " + weightFormat.format(this.getWeight()) + " lbs\n");
        identicalPart.printBillOfMaterials();
    }
}

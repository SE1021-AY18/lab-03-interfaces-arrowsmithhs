/*
 * SE1021
 * Winter 2017
 * Lab Lab2
 * Name: Steve Arrowsmith
 * Created December 14, 2017
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of parts
 *
 * @author Steve Arrowsmith
 * @version 1.0
 */
public class Assembly implements Part {
    private final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");//Format for displaying cost
    private String name;//Name of the part
    private List<Part> subParts = new ArrayList<Part>();//List of the parts in the assembly
    public static final double USD_PER_SUB_PART = 0.25;//Cost for each additional part
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");//Format for displaying weight

    /**
     * Represents information about a collection of parts
     *
     * @param name name of the collection of parts
     */
    public Assembly(String name) {
        this.name = name;
    }

    /**
     * Adds a part to the collection of parts
     *
     * @param part part being added to the collection of parts
     */
    public void addPart(Part part) {
        subParts.add(part);
    }

    public double getCost() {
        double totalCost = 0;
        for (int i = 0; i < subParts.size(); i++) {
            totalCost += subParts.get(i).getCost();
            if (i > 1) {
                totalCost += USD_PER_SUB_PART;
            }
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < subParts.size(); i++) {
            totalWeight += subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    @Override
    public String getDimensions() {
        return "";
    }

    /**
     * Prints information about a Part
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                this.getName() +
                "\n==========================");
        for (int j = 0; j < subParts.size(); j++) {
            System.out.println("Part: " + subParts.get(j).getName());
            System.out.println("Cost: " + costFormat.format(subParts.get(j).getCost()));
            System.out.println("Weight: " + weightFormat.format(subParts.get(j).getWeight()) + " lbs");
        }
        System.out.println("Total cost: " + costFormat.format(this.getCost()));
        System.out.println("Total weight: " + weightFormat.format(this.getWeight()) + " lbs");
        for (int i = 0; i < subParts.size(); i++) {
            subParts.get(i).printBillOfMaterials();
        }
    }

}

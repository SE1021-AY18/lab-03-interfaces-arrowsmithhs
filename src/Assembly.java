import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly{
    private final DecimalFormat costFormat=new DecimalFormat();
    private String name;
    private List<Part> subParts=new ArrayList<Part>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat =new DecimalFormat();

    public Assembly(String name) {
        this.name=name;
    }

    public void addPart(Part part) {
    }

    public double getCost(){

    }

    public String getName(){

    }

    public double getWeight(){

    }

    public void printBillOfMaterials() {
    }

}

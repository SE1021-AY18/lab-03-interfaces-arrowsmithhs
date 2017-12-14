import java.text.DecimalFormat;

public class Duplicate implements Part{
    private static DecimalFormat costFormat=new DecimalFormat();
    private Part identicalPart;
    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private static DecimalFormat weightFormat=new DecimalFormat();

    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart=identicalPart;
        this.numDuplicates=numDuplicates;
    }

    public double getCost(){

    }

    public String getName(){
        return "duplicate";
    }

    public double getWeight(){

    }

    public void printBillOfMaterials() {

    }
}

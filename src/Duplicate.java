import java.text.DecimalFormat;

public class Duplicate implements Part{
    private static DecimalFormat costFormat=new DecimalFormat("$#,##0.00");
    private Part identicalPart;
    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private static DecimalFormat weightFormat=new DecimalFormat("#.#");

    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart=identicalPart;
        this.numDuplicates=numDuplicates;
    }

    public double getCost(){
        double cost=identicalPart.getCost()*numDuplicates;
        if(numDuplicates>=USD_THRESHOLD1&&numDuplicates<USD_THRESHOLD2){
            cost*=REDUCTION_FACTOR1;
        }
        if(numDuplicates>=USD_THRESHOLD2){
            cost*=REDUCTION_FACTOR2;
        }
        return cost;
    }

    public String getName(){
        return "duplicate";
    }

    public double getWeight(){
        return identicalPart.getWeight()*numDuplicates;
    }

    @Override
    public String getDimensions() {
        return identicalPart.getDimensions();
    }

    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                identicalPart.getDimensions()+identicalPart.getName()+"\n" +
                "==========================\n" +
                "Copies: "+numDuplicates+"\n" +
                "Individual cost: "+this.getCost()+"\n" +
                "Individual weight: "+this.getWeight());
    }
}

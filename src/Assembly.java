import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly{
    private final DecimalFormat costFormat=new DecimalFormat("$#,##0.00");
    private String name;
    private ArrayList<Part> subParts=new ArrayList<Part>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat =new DecimalFormat("#.#");

    public Assembly(String name) {
        this.name=name;
    }

    public void addPart(Part part) {
        subParts.add(part);
    }

    public double getCost(){
        double totalCost=0;
        for(int i=0;i<subParts.size();i++){
            totalCost+=subParts.get(i).getCost();
            if(i>1){
                totalCost+=USD_PER_SUB_PART;
            }
        }
        return totalCost;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        double totalWeight=0;
        for(int i=0;i<subParts.size();i++){
            totalWeight+=subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    public void printBillOfMaterials() {
    }

}

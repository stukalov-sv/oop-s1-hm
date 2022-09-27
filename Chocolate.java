
public class Chocolate extends Product {
    private String type;

    public Chocolate(String name, Long barcode, Double cost, String type) {
        super(name, barcode, cost);
        this.type = type;
    }

    public String getType() {
        return type;        
    }

    public void setType(String type) {
        this.type = type;        
    }

    @Override
    public String toString() {
        return String.format("product: %s, type: %s barcode: %d, cost: %f", 
            super.getName(), 
            type, 
            super.getBarcode(), 
            super.getCost());
    }
}

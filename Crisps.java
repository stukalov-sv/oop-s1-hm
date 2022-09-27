public class Crisps extends Product {
    private Integer weight;

    public Crisps(String name, Long barcode, Double cost, Integer weight) {
        super(name, barcode, cost);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;        
    }

    public void setWeight(Integer weight) {
        this.weight = weight;        
    }

    @Override
    public String toString() {
        return String.format("product: %s, weight: %d barcode: %d, cost: %f", 
            super.getName(), 
            weight, 
            super.getBarcode(), 
            super.getCost());
    }
}

public abstract class Product {
    private String name;
    private Long barcode;
    private Double cost;

    public Product(String name, Long barcode, Double cost) {
        this.name = name;
        this.cost = cost;
        this.barcode = barcode;    
    }

    public String getName() {
        return name;        
    }

    public Long getBarcode() {
        return barcode;        
    }

    public Double getCost() {
        return cost;        
    }

    public void setName(String name) {
        this.name = name;        
    }

    public void setCost(Double cost) {
        this.cost = cost;        
    }
}
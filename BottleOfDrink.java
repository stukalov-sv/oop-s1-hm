public class BottleOfDrink extends Product {
    private Double volume;

    public BottleOfDrink(String name, Long barcode, Double cost, Double volume) {
        super(name, barcode, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;        
    }

    public void setVolume(Double volume) {
        this.volume = volume;        
    }

    @Override
    public String toString() {
        return String.format("product: %s, volume: %f barcode: %d, cost: %f", 
            super.getName(), 
            volume, 
            super.getBarcode(), 
            super.getCost());
    }
}
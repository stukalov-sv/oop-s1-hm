
import java.util.ArrayList;

public class VendingMashine {
    ArrayList<Chocolate> chocolateProd = new ArrayList<>();
    ArrayList<BottleOfDrink> drinkProd = new ArrayList<>();
    ArrayList<Crisps> crispsProd = new ArrayList<>();

    public VendingMashine() {
        chocolateProd.add(new Chocolate("Lindt", 1l, 20.5, "black"));
        chocolateProd.add(new Chocolate("Alpen Gold", 2l, 17.5, "milk"));
        drinkProd.add(new BottleOfDrink("Bonaqua", 3l, 12.5, 0.5));
        drinkProd.add(new BottleOfDrink("Cone forest", 4l, 9.5, 0.4));
        crispsProd.add(new Crisps("Pringles", 5l, 22.5, 120));
        crispsProd.add(new Crisps("Moscow potatoes", 6l, 15.5, 90));
    }  

    public Product getProductByName(String name) {
        for (Product item : chocolateProd) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        for (Product item : drinkProd) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        for (Product item : crispsProd) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    };

    public Product getProductByCost(Double cost) {
        for (Product item : chocolateProd) {
            if (item.getCost().equals(cost)) {
                return item;
            }
        }
        for (Product item : drinkProd) {
            if (item.getCost().equals(cost)) {
                return item;
            }
        }
        for (Product item : crispsProd) {
            if (item.getCost().equals(cost)) {
                return item;
            }
        }
        return null;
    };

    public Chocolate getByType(String type) {
        for (Chocolate item : chocolateProd) {
            if (item.getType().equals(type)) {
                return item;
            }
        }
        return null;
    }

    public BottleOfDrink getByVolume(Double volume) {
        for (BottleOfDrink item : drinkProd) {
            if (item.getVolume().equals(volume)) {
                return item;
            }
        }
        return null;
    }

    public BottleOfDrink getByVolume(String volume) {
        for (BottleOfDrink item : drinkProd) {
            if (item.getVolume().equals(Double.valueOf(volume))) {
                return item;
            }
        }
        return null;
    }

    public Crisps getByWeight(Integer weight) {
        for (Crisps item : crispsProd) {
            if (item.getWeight().equals(weight)) {
                return item;
            }
        }
        return null;
    }

    public Crisps getByWeight(String weight) {
        for (Crisps item : crispsProd) {
            if (item.getWeight().equals(Integer.valueOf(weight))) {
                return item;
            }
        }
        return null;
    }
}

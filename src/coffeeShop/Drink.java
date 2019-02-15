package coffeeShop;

public class Drink extends Item {

    private Double volume;

    public Drink(String itemId, Double price, String name, String description, double volume) {
        super(itemId, price, name, description);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }
}

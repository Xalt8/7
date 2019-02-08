package coffeeShop;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Order> currentOrders;
    private Manager manager;

    public Basket(Manager manager) {
        this.currentOrders = new LinkedList<>();
        this.manager = manager;
    }

    public void registerCurrentOrder() {
        //TODO implement inventory class first
    }

    public void addOrder(Order newOrder) {
        if (newOrder != null) {
            currentOrders.add(newOrder);
        }
    }

    public void removeOrder(Order order) {
        if (order != null) {
            currentOrders.remove(order);
        }
    }

    public void updateOrder(Order toUpdate, int newQuantity) {
        if(toUpdate != null){
            Order order = currentOrders.get(currentOrders.indexOf(toUpdate));
            if(newQuantity > 0 && newQuantity != order.getQuantity()){
                order.setQuantity(newQuantity);
            }
        }
    }

    public double getCostWithoutDiscount() {
        double total = 0d;
        for (Order o: currentOrders) {
            total += o.getFood().getPrice() * o.getQuantity();
        }
        return total;
    }

    public double calculateDiscount() {
        //TODO decide discount policies first
        return 0;
    }

    private void checkUpdateInventory(Order check, boolean add) {
        //TODO implement Inventory first
    }
}

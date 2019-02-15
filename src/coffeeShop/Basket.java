package coffeeShop;

import coffeeShop.interfaces.BasketOpsListener;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Order> currentOrders;
    private BasketOpsListener basketOpsListener;

    public Basket(BasketOpsListener listener) {
        this.currentOrders = new LinkedList<>();
        this.basketOpsListener = listener;
    }

    public void registerCurrentOrder() {
        //TODO implement inventory class first
    }

    public void addOrder(Order newOrder) {
        if (newOrder != null) {
            currentOrders.add(newOrder);
            basketOpsListener.onBasketAdd();
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
            total += o.getItem().getPrice() * o.getQuantity();
        }
        return total;
    }

    public double calculateDiscount() {
        //TODO decide discount policies first
        //Map counting how many drink and food
        return 0;
    }

    public double calculateDiscount(String code){
        //check if the code is correct and apply discount
        return 0;
    }

    private void checkUpdateInventory(Order check, boolean add) {
        //TODO implement Inventory first
    }
}

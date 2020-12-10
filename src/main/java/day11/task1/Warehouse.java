package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int picked) {
        countPickedOrders = picked;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Заказов собрано: " + getCountPickedOrders() + ". Заказов доставлено: " + getCountDeliveredOrders();
    }

}

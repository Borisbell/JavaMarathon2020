package day11.task1;

public class Courier implements Worker {
    private int salary =0;
    private boolean isPayed = false;
    private Warehouse wh;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void doWork() {
        salary+=100;
        wh.setCountDeliveredOrders(wh.getCountDeliveredOrders()+1);
    }

    @Override
    public void bonus() {
        if(wh.getCountDeliveredOrders()>=10000 && !isPayed){
            salary+=50000;
            isPayed = true;
        }
        else if(isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        else if(wh.getCountDeliveredOrders()<10000){
            System.out.println("Бонус пока не доступен");
        }
    }
}

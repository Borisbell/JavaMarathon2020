package day11.task1;

public class Picker implements Worker {
    private int salary =0;
    private boolean isPayed = false;
    private Warehouse wh;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void doWork() {
       salary+=80;
       wh.setCountPickedOrders(wh.getCountPickedOrders()+1);
    }

    @Override
    public void bonus() {
        if(wh.getCountPickedOrders()>=10000 && !isPayed){
            salary+=70000;
            isPayed = true;
        }
        else if(isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        else if(wh.getCountPickedOrders()<10000){
            System.out.println("Бонус пока не доступен");
        }
    }
}

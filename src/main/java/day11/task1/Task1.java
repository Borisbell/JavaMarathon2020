package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Picker picker1 = new Picker(wh1);
        Courier courier1 = new Courier(wh1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(wh1);
        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

        Warehouse wh2 = new Warehouse();
        Picker picker2 = new Picker(wh2);
        Courier courier2 = new Courier(wh2);
        picker2.doWork();
        courier2.doWork();

        System.out.println("Первый склад: "+wh1);
        System.out.println("Второй склад: "+wh2);
    }

    static void businessProcess(Worker worker){
        int counter = 0;
        while (counter<10000){
            worker.doWork();
            counter++;
        }
        worker.bonus();
    }
}

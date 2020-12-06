package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public int fillUp(int addedFuel) {
        this.fuel+=addedFuel;
        return this.fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d",this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2){
        if (plane1.length > plane2.length){
            System.out.println("Первый самолёт длиннее");
        }
        else if (plane2.length > plane1.length){
            System.out.println("Второй самолёт длиннее");
        }
        else {
            System.out.println("Самолёты одинаковой длины");
        }
    }

}

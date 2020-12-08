package day8;

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

    @Override
    public String toString(){
        return "Изготовитель: "+this.producer+", год выпуска: "+this.year+", длина: "+this.length+", вес: "+this.weight+", количество топлива в баке: "+this.fuel;
    }

}

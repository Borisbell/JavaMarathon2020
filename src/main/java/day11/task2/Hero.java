package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;

    public abstract double getPhysDef();

    public abstract double getMagicDef();

    public abstract double getHealth();

    public abstract void setHealth(double health);

    public abstract String toString();

    public abstract void physicalAttack(Hero hero);
}

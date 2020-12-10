package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {
    private double health = 100;
    private final double physAtt = 15;
    private final double physDef = 0.5;
    private final double magicDef = 0.2;

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
        if(hero.getHealth()<0){
            hero.setHealth(0);
        }
    }

    @Override
    public void healHimself() {
        if (health < 75) {
            health += 25;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() < 90) {
            hero.setHealth(hero.getHealth() + 10);
        } else {
            hero.setHealth(100);
        }
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String toString() {
        return this.getClass().getSimpleName()+" health = " + health;
    }

}
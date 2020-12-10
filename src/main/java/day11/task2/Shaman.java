package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double health = 100;
    private final double physAtt = 10;
    private final double magicAtt = 15;
    private final double physDef = 0.2;
    private final double magicDef = 0.2;

    @Override
    public void healHimself() {
        if (health < 50) {
            health += 50;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() < 70) {
            hero.setHealth(hero.getHealth() + 30);
        } else {
            hero.setHealth(100);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
        if(hero.getHealth()<0){
            hero.setHealth(0);
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
        if(hero.getHealth()<0){
            hero.setHealth(0);
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

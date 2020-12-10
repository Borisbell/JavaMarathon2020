package day11.task2;

import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double health = 100;
    private final double physAtt = 5;
    private final double magicAtt = 20;
    private final double physDef = 0;
    private final double magicDef = 0.8;

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() > 0) {
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
        } else {
            hero.setHealth(0);
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
        if (hero.getHealth() < 0) {
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

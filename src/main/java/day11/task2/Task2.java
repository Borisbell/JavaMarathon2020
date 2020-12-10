package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Shaman sham = new Shaman();
        Magician mag = new Magician();
        //1
        war.physicalAttack(pal);
        System.out.println(pal);
        //2
        pal.physicalAttack(mag);
        System.out.println(mag);
        //3
        sham.healTeammate(mag);
        System.out.println(mag);
        //4
        mag.magicalAttack(pal);
        System.out.println(pal);
        //5
        sham.physicalAttack(war);
        System.out.println(war);
        //6
        pal.healHimself();
        System.out.println(pal);
        //7
        for(int i = 0; i<5; i++){
            war.physicalAttack(mag);
            System.out.println(mag);
        }
    }
}

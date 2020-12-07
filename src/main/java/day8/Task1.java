package day8;

public class Task1 {
    public static void main(String[] args) {
        int counter = 0;
        String result = "0";
        long start = System.currentTimeMillis();
        System.out.println(start);

//      Конкатенация
//        while(counter < 20000){
//            counter ++;
//            result+= (" "+counter);
//        }

//      Stringbuilder
        StringBuilder sb = new StringBuilder("0");
        while(counter < 20000){
            counter ++;
            sb.append((" "+counter));
        }

        System.out.println(sb);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(finish);
        System.out.println(timeConsumedMillis);
    }
}

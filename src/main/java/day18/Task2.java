package day18;

public class Task2 {
    public static void main(String[] args) {
        int num = 717771237;
        System.out.println(count7(num, 0));
    }

    public static int count7(int n, int sum) {
        if (n == 0)
            return sum;
        if (n % 10 == 7) {
            sum++;
        }
        return count7(n / 10, sum);
    }
}

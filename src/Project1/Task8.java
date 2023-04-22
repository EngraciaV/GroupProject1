package Project1;

public class Task8 {
    public static void main(String[] args) {

        int[] num = {1, 4, 10, 100, 20};

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

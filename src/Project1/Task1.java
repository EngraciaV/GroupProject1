package Project1;

public class Task1 {
    public static void main(String[] args) {

        int[] temperatures = {60, 67, 90, 89, -20, 70, 71};
        int min = temperatures[0];
        int max = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        System.out.println("The lowest tempeture is " + min);
        System.out.println("The highest temprature is " + max);
    }
}

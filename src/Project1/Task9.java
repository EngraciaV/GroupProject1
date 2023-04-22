package Project1;

public class Task9 {
    public static void main(String[] args) {

        int numbers[] = {88, 14, 72, 77, 15};
        int highest = numbers[0];
        int secondHighest = 0;

        for (int number : numbers) {
            if (highest < number) {
                highest = number;
            } else if (number < highest && number > secondHighest) {
                secondHighest = number;
            }
        }
        System.out.println(secondHighest);
    }
}
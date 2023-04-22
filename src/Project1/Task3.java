package Project1;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {2, 4, 5, 7, 9},
                {67, 3, 90, 3},
                {12, 4, 8, 10, 22, 0}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
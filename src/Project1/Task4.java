package Project1;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {2, 4, 5, 7, 9},
                {67, 3, 90, 3},
                {22, 12, 4, 8, 10}
        };

        int even = 0;
        int odd = 0;


        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    even += num;
                }
                if (num % 2 != 0) {
                    odd += num;
                }
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}

package Project1;

public class Task6 {
    public static void main(String[] args) {

        int num = 4;
        boolean isPrime = true;

        if (num > 1) {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
    }
}

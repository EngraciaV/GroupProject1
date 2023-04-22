package Project1;

public class Task7 {
    public static void main(String[] args) {

        int a, b, c;

        a = 0;
        b = 1;

        for (int i = 1; i <= 18; i++) {

            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;

        }
    }
}

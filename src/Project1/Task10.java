package Project1;

public class Task10 {
    public static void main(String[] args) {

        String[] colors = {"Blue", "Purple", "Blue", "Yellow", "White", "Purple", "Orange", "Green"};

        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i].equals(colors[j])) {
                    System.out.println("The word " + colors[i] + " is duplicated");
                }
            }
        }
    }
}


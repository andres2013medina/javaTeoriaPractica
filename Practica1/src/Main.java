import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int[] A;

    public static void main(String[] args) {


        int[] A = new int[]{51, 71, 17, 42};


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int number : A) {
            ArrayList<Integer> temp = new ArrayList<>();
            int total = 0;
            do {
                temp.add(number % 10);
                number = number / 10;
            } while (number > 0);

            for (int digit : temp) {
                total = digit + total;
            }
            numbers.add(total);
        }


        int[] sumDigitsArray = numbers.stream().mapToInt(n -> n).toArray();

        int max = -1;
        for (int i = 0; i < sumDigitsArray.length; i++) {
            for (int j = i + 1; j < sumDigitsArray.length; j++) {
                if (sumDigitsArray[i] == sumDigitsArray[j] && max < (A[i] + A[j])) {
                    max = A[i] + A[j];
                }
            }
        }


    }

}

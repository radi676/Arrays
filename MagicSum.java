package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().
                split(" "))
                .mapToInt( Integer::parseInt).
                toArray();
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {//комбинацията
                if (arr[i] + arr[j] == number) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
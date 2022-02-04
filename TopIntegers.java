package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < arr.length; i++) { //този гледа само първите
            boolean isBigger = false;


            for (int j = i + 1; j < arr.length; j++) { //този проверява за следващия
                if (arr[i] > arr[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }

            }
            if (isBigger) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.print(arr[arr.length - 1]);
    }
}

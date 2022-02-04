package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] line = sc.nextLine().split(" ");
            if (i % 2 != 0) {
                arr1[i - 1] = line[0];
                arr2[i - 1] = line [1];
            }else{
                arr1[i - 1] = line[1];
                arr2[i - 1] = line [0];
            }

        }
        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));

    }
}

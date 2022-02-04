package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = readArray(sc);
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            leftSum = getLeftSum(numbers, i, leftSum);
            rightSum = getRightSum(numbers, i, rightSum);
            if (extracted(numbers, i, leftSum, rightSum)) break;
        }
    }

     static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine()
               .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    static boolean extracted(int[] numbers, int i, int leftSum, int rightSum) {
        if (leftSum == rightSum) {
            System.out.println(i);//принтирай индекса, на който са достигнати еднаквите суми
            return true;

        } else if (i == numbers.length - 1) {
            System.out.println("no");
        }
        return false;
    }

    static int getRightSum(int[] numbers, int i, int rightSum) {
        for (int j = i + 1; j < numbers.length; j++) { // дясната страна
            rightSum += numbers[j];
        }
        return rightSum;
    }

    static int getLeftSum(int[] numbers, int i, int leftSum) {
            for (int j = i - 1; j >= 0; j--) {//лявата страна
                leftSum += numbers[j];
        }
        return leftSum;
    }
}








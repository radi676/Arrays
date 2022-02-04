package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine()
                        .split(" "))
                .mapToInt( Integer::parseInt)
                .toArray();
        int lengthOfTheSequence = 1;
        int max = 0;// пази колко еднакви  числа има
        int currentElement = array[0];


        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                lengthOfTheSequence++;

                if (lengthOfTheSequence > max) {
                    max = lengthOfTheSequence;//колко пъти  се повтаря елементът
                    currentElement = array[i];//кой е елементът, при който е започната тази редица

                }

            } else {
                lengthOfTheSequence = 1;
            }

        }
        //колко пъти ще повторим currentElement
        for (int i = 0; i < max; i++) {
            System.out.print(currentElement + " ");
        }


    }
}

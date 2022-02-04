package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array1 = sc.nextLine().split(" ");
        String[] array2 = sc.nextLine().split(" ");

        for (String elementFromTheSecondArray : array2) { //ходи по всички елементи от първия масив без да има значение индекса


            for (String elementFromTheFirstArray : array1) {
                if (elementFromTheSecondArray.equals(elementFromTheFirstArray)){
                    System.out.print(elementFromTheFirstArray + " ");
                }
            }

        }
    }
}
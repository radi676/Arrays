package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraysToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = Arrays
                .stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int repetitions = 0; repetitions < numbers.length - 1; repetitions++) {

            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];//в масива си пазя получените две поседни числа
            }
        }


            System.out.println(numbers[0]);


        }
    }

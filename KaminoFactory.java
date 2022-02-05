package Arrays;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        int counterDNA = 0;
        int bestIndex = 0;
        int maxSum = 0;
        int maxlength = 0;
        String bestLocalDNA = "";
        int bestCounterDNA = 0;
        String[] bestDna = new String[length];

        while (!line.equals("Clone them!")) {
            counterDNA++;
            String data = line.replaceAll("!", "");
            String[] dnaOfOnes = data.split("0");
            //създаваме масив, където си пазим само поредиците от единици
            int currentLength = 0;
            int currentSum = 0;

            for (int i = 0; i < dnaOfOnes.length; i++) {
                //compare the lengths of Ones
                currentSum += dnaOfOnes[i].length();//текущата сума от единици
                if (dnaOfOnes[i].length() > currentLength) {
                    currentLength = dnaOfOnes[i].length();
                    bestLocalDNA = dnaOfOnes[i];//най-добрата днк става тази на която дължината й от единици е най-дългата в съответната редица

                }
            }

            int currentIndex = data.indexOf(bestLocalDNA);

            if (currentLength > maxlength) {
                maxlength = currentLength;
                maxSum = currentSum;
                bestIndex = currentIndex;
                bestCounterDNA = counterDNA;
                bestDna = data.split("");
            } else if (currentLength==maxlength && bestIndex > currentIndex || currentSum > maxSum) {
            maxlength = currentLength;
                maxSum = currentSum;
               bestIndex = currentIndex;
                bestCounterDNA = counterDNA;
                bestDna = data.split("");
        } else if (counterDNA == 1) {
              maxlength = currentLength;
                maxSum = currentSum;
                bestIndex = currentIndex;
                bestCounterDNA = counterDNA;
                bestDna = data.split("");
        }

            line = sc.nextLine();

        }
        System.out.printf("%nBest DNA sample %d with sum: %d.%n", bestCounterDNA, maxSum);
        System.out.println(String.join(" ", bestDna));
    }
}

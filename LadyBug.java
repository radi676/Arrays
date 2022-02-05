package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class LadyBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fieldSize = Integer.parseInt(sc.nextLine());
        int[] bugsPositions = readTheBugPositions(sc);
        int[] field = new int[fieldSize];
        //Пълним полето с калинки
        for (int initialindex : bugsPositions) { //къде има калинки първо
            if (initialindex >= 0 && initialindex < field.length) { //проверка дали има калинка на съответнот място //не трябва калинката да е кацнала на място извън полето или да е орицателно число
                field[initialindex] = 1;//ако е сетната единица, то на съответния индекс от field има калинка
            }
        }
        String line = sc.nextLine();
        while (!line.equals("end")) { //четем как ще лети калинката и накъде
            String[] data = line.split(" ");
            int index = Integer.parseInt(data[0]); //от коя позиция ще лети калинката
            String direction = data[1]; //в коя посока ще лети
            int flyLength = Integer.parseInt(data[2]);//през колко индекса ще мине

            if (index < 0 || index >= field.length || field[index] != 1) { //калинката не може да е на отрицателна позиция. Трябва тя да е в рамките на полето и на съответното подадено място да има калинка
                line = sc.nextLine();
                continue;
            }
            field[index] = 0; //калинката отлита от полето и освобождава индекса
            switch (direction) {
                case "right" -> {
                    index += flyLength;//пресмятаме през колко индекса ще мине калинката
                    while (index < fieldSize && field[index] == 1) { //докато калинката е в полето и не може да кацне
                        index += flyLength;//продължава да лети надясно
                    }
                    if (index < fieldSize) { //ако калинката е в рамките на полето, калинката каца на съответния индекс. Ако не, не слагаме единица и калинката не каца и отива извън полето
                        field[index] = 1; //каца
                    }
                }
                case "left" -> {
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) { ///докато калинката е в полето и  не може да кацне.
                        index -= flyLength;//продължава да лети наляво
                    }
                    if (index >= 0) { //ако калинката е в рамките на полето, калинката каца на съответния индекс. Ако не, не слагаме единица и калинката не каца и отива извън полето
                        field[index] = 1; //каца
                    }
                }
            }
            line = sc.nextLine();
        }
        Arrays.stream(field).forEach(e -> System.out.print(e + " "));
    }
    private static int[] readTheBugPositions(Scanner sc) {
        int[] bugsPositions = Arrays//къде се намират калинките, на кои индекси на полето
                .stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return bugsPositions;
    }
}



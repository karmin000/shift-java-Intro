package homework22;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int start, end, step;

        System.out.print("Enter the first number: ");
        if (!console.hasNextInt()) {
            System.out.println("Error: please enter an integer.");
            return;
        }
        start = console.nextInt();

        System.out.print("Enter the second number: ");
        if (!console.hasNextInt()) {
            System.out.println("Error: please enter an integer.");
            return;
        }
        end = console.nextInt();

        System.out.print("Enter the step: ");
        if (!console.hasNextInt()) {
            System.out.println("Error: please enter an integer.");
            return;
        }
        step = console.nextInt();

        if (step == 0) {
            System.out.println("Error: step cannot be zero.");
            return;
        }

        if ((start < end && step < 0) || (start > end && step > 0)) {
            System.out.println("Error: step leads in the wrong direction.");
            return;
        }

        printTable(start, end, step);
    }


    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }


    public static void printTable(int start, int end, int step) {

        int maxCellWidth = 0;
        for (int x = start; x <= end; x += step) {
            for (int y = start; y <= end; y += step) {
                int product = x * y;
                int width = getCellWidth(product);
                if (width > maxCellWidth) {
                    maxCellWidth = width;
                }
            }
        }
        maxCellWidth += 1;

        System.out.printf("%" + maxCellWidth + "s", "");
        for (int x = start; x <= end; x += step) {
            System.out.printf("%" + maxCellWidth + "d", x);
        }
        if ((start - end) % step != 0) {
            System.out.printf("%" + maxCellWidth + "d", end);
        }

        System.out.println();

        for (int y = start; y <= end; y += step) {

            System.out.printf("%" + maxCellWidth + "d", y);

            for (int x = start; x <= end; x += step) {
                int product = x * y;
                System.out.printf("%" + maxCellWidth + "d", product);
            }
            if ((start - end) % step != 0) {
                int product = end * y;
                System.out.printf("%" + maxCellWidth + "d", product);
            }
            System.out.println();
        }
        if ((start - end) % step != 0) {
            System.out.printf("%" + maxCellWidth + "d", end);
            for  (int x = start; x <= end; x += step) {
                int product = x * end;
                System.out.printf("%" + maxCellWidth + "d", product);
            }
            int product = end * end;
            System.out.printf("%" + maxCellWidth + "d", product);
        }


    }
}

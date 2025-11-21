package homework232;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MultiplicationTableToFile {

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


        try {
            printTableToFile(start, end, step, "table.txt");
            System.out.println("\nTable was written into table.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error file writing: " + e.getMessage());
        }
    }


    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }


    public static void printTableToFile(int start, int end, int step, String filename)
            throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(filename);


        int numberMax = Math.max(Math.abs(start), Math.abs(end));
        int maxNumberSquare = -1 * numberMax * numberMax;
        int maxCellWidth = getCellWidth(maxNumberSquare) + 2;

        writer.printf("%" + maxCellWidth + "s", "");
        for (int x = start; x <= end; x += step) {
            writer.printf("%" + maxCellWidth + "d", x);
        }
        if ((start - end) % step != 0) {
            writer.printf("%" + maxCellWidth + "d", end);
        }
        writer.println();

        for (int y = start; y <= end; y += step) {

            writer.printf("%" + maxCellWidth + "d", y);

            for (int x = start; x <= end; x += step) {
                int product = x * y;
                writer.printf("%" + maxCellWidth + "d", product);
            }
            if ((start - end) % step != 0) {
                int product = end * y;
                writer.printf("%" + maxCellWidth + "d", product);
            }
            writer.println();
        }

        if ((start - end) % step != 0) {
            writer.printf("%" + maxCellWidth + "d", end);
            for  (int x = start; x <= end; x += step) {
                int product = x * end;
                writer.printf("%" + maxCellWidth + "d", product);
            }
            int product = end * end;
            writer.printf("%" + maxCellWidth + "d", product);
        }

        writer.close();
    }
}

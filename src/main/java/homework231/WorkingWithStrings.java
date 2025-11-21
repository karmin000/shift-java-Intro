package homework231;

import java.util.Scanner;

public class WorkingWithStrings {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String original = console.nextLine();

        if (original.length() <= 1) {
            System.out.println("Ошибка: строка должна содержать более одного символа");
            return;
        }

        String normalized = normalize(original);

        System.out.print("Введите символ: ");
        String chr = console.nextLine();

        while (chr.length() != 1 || chr.charAt(0) == ' ') {
            System.out.print("Введён неверный символ. Введите символ заново: ");
            chr = console.nextLine();
        }

        char target = chr.charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < normalized.length(); i++) {
            char c = normalized.charAt(i);
            sb.append(c == target ? ' ' : c);
        }

        String modified = normalize(sb.toString());

        if (modified.equals(normalized)) {
            System.out.print("Строка не изменилась: '" + normalized + "'\n");

        } else {
            System.out.printf("Исходная: '%s', Преобразованная: '%s'%n", normalized, modified);
        }
    }

    private static String normalize(String str) {
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        return str;
    }
}

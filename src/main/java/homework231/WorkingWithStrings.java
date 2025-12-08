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

        if (!original.matches("[a-zA-Zа-яА-ЯёЁ.,!?:; ]+")) {
            System.out.println("Ошибка: строка содержит недопустимые символы");
            return;
        }

        if (original.trim().isEmpty()) {
            System.out.println("Ошибка: строка не должна состоять только из пробелов");
            return;
        }

        if (original.contains("  ")) {
            System.out.println("В строке содержаться подряд идущие пробелы. Строка преобразуется к нормальному ввиду.");
        }

        String normalized = deleteExtraSpaces(original);

        System.out.print("Введите символ: ");
        String SymbolForReplace = console.nextLine();

        while (SymbolForReplace.length() != 1 || SymbolForReplace.equals(' ')) {
            System.out.print("Введён неверный символ.");
            return;
        }

        char target = SymbolForReplace.charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < normalized.length(); i++) {
            char c = normalized.charAt(i);
            sb.append(c == target ? ' ' : c);
        }

        String modified = deleteExtraSpaces(sb.toString());

        if (modified.equals(normalized)) {
            System.out.print("Строка не изменилась: '" + normalized + "'\n");

        } else {
            System.out.printf("Исходная: '%s', Преобразованная: '%s'%n", normalized, modified);
        }
    }

    private static String deleteExtraSpaces(String str) {
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        return str;
    }
}

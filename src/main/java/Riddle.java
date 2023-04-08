import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Заархивированный вирус";
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String hint = "Это не человек, а опасный файл!";
        String input;
        boolean usedHint = false;

        System.out.println(riddle);

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Попытка " + attempt + ":");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            } else if (input.equalsIgnoreCase("Подсказка")) {
                if (attempt == 1) {
                    System.out.println(hint);
                    usedHint = true;
                    attempt--;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
            } else if (attempt < 3 && !usedHint) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}

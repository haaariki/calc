import java.util.Scanner;

public class cal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи выражение (например: 5 + 3):");

        String input = sc.nextLine();
        String[] parts = input.trim().split(" ");


        if (parts.length != 3) {
            System.out.println("Неверный формат. Используй: число операция число (например: 4 * 2)");
            return;
        }

        try {
            int a = Integer.parseInt(parts[0]);
            char op = parts[1].charAt(0);
            int b = Integer.parseInt(parts[2]);

            if (a < 0 || a > 10 || b < 0 || b > 10) {
                System.out.println("Числа должны быть от 0 до 10");
                return;
            }

            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case '/':
                    if (b == 0 || a==0) {
                        System.out.println("На ноль делить нельзя!");
                    } else {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Неизвестная операция.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число.");
        }
    }
}
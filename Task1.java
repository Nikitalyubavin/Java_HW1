/*
1. Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

3. Реализовать простой калькулятор

4.*+Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет. */

package HW1;
import java.util.Scanner;

/**
 * Task1
 */
public class Task1 {

    static int summa(int input) {
        if (input <= 1) return 1;
        return input + summa(input - 1);
    }

    static int multiplication(int input) {
        if (input <= 1) return 1;
        return input * multiplication(input - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int input = sc.nextInt();
        sc.close();

        System.out.printf("Сумма с 1-го элемента по n-е: %s\n", summa(input));
        System.out.printf("Факториал n-го числа: %s\n", multiplication(input));
    }
}
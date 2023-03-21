/*
4.*+Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
*/

package HW1;
import java.util.Scanner;

public class Task4 {
    static int parse(String value) {
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    static char[] toArray(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число равенства: ");
        String q = sc.nextLine();
        char[] array1 = toArray(q);

        System.out.print("Введите второе число равенства: ");
        String w = sc.nextLine();
        char[] array2 = toArray(w);
        
        System.out.print("Чему равно выражение: ");
        int e = sc.nextInt();
        sc.close();

        array1[1] = (e / 10) - array1[0];
        array2[0] = (e % 10) - array2[1];
        System.out.println(array1);
        System.out.println(array2);

        //System.out.printf("%s%s + %s%s = %s", array1[0], x, y, array2[1], e);
    }
}

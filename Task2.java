/*
2. Вывести все простые числа от 1 до 1000
 */
package HW1;
public class Task2 {
    public static void main(String[] args) {
        System.out.print("1  2  3  5  7  ");
        for (int i = 8; i < 1000; i++) {
            if ((i % 2 == 0) | (i % 3 == 0) | (i % 5 == 0) | (i % 7 == 0)) continue;
            else System.out.printf("%s  ", i);
        }
    }
}

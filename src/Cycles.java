import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
//  1. При помози цикла for вывести на экран нечетные числа от 1 до 99.
//  При решении используйте операцию инкремента(++)
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
//  2. Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию (--)
        for (int i = 5; i >= 1; --i) {
            System.out.println(i);
        }
//  3. Напишите программу где пользователь вводит любое целое положительное число.
//  А программа суммирует все числа от 1 до введенного пользователем числа.
//  Для ввода числа воспользуйтесь классом Scanner.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumNumbers = 0;
        for (int i = 1; number > i; ++i) {
            sumNumbers += i;
        }
        System.out.println(sumNumbers);
//  4. Необъодимо, чтобы программа выводила на экран вот такую последовательность:
//  7,14..98. В решении используйте цикл while.
        while (number == 7) {
            for (number = 7; number <= 98; ) {
                System.out.println(number);
                number += 7;
            }
        }
//  5. Вывести десять первых чисел последовательности 0, -5, -10, -15...
        while (number == 0) {
            for (number = 0; number >= -45; ) {
                System.out.println(number);
                number -= 5;
            }
        }
//  6. Составьте программу, выводящую на экран квараты чисел от 10 до 20 включительно.
        for (int i = 10; i <= 20; ++i){
            System.out.println(i*i);
        }
    }
}
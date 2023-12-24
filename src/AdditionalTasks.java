import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
//  1. Выведите на кран первые 11 членов последовательности Фибоначчи.
        int[] numbers = new int[11];
        int a = 0;
        int b = 1;
        numbers[0] = a;
        numbers[1] = b;
        for (int i = 0; i < numbers.length; ++i) {
            if (i == 0) {
                System.out.println(numbers[i]);
            } else if  ( i == 1) {
                System.out.println(numbers[i]);
            } else {
                numbers[i] = numbers[i-1] + numbers[i-2];
                System.out.println(numbers[i]);
            }
        }
//  2.  За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//  Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
//  А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//  Для вычисления суммы с  учетом процентов используйте цикл for. Сумма вклада тип float.
        Scanner scanner = new Scanner(System.in);
        float valueOfMoney = scanner.nextFloat();
        int month = scanner.nextInt();
        for (int i = 1; i <= month; ++i) {
            valueOfMoney += (float) (valueOfMoney * 0.07);
        }
        System.out.println(valueOfMoney);
//  3. Напишите программу, которая вывыдит на консоль таблицу умножения.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

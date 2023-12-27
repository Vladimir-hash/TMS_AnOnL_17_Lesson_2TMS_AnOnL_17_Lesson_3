import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
//  1. Выведите на кран первые 11 членов последовательности Фибоначчи.
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i =0; i < 11; i++) {
            System.out.println(firstNumber);
            firstNumber = secondNumber - firstNumber;
            secondNumber = secondNumber + firstNumber;
        }
//  2.  За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//  Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
//  А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//  Для вычисления суммы с  учетом процентов используйте цикл for. Сумма вклада тип float.
        Scanner scanner = new Scanner(System.in);
        int valueOfMoney = scanner.nextInt();
        int month = scanner.nextInt();
        for (int i = 1; i <= month; ++i) {
            valueOfMoney *= 1.07F;
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

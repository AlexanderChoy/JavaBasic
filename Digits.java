package Samples;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;


public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int b = 0;
        while (number > 0) {
            b = number % 10;
            digits.add(b);
            number /= 10;
        }
// Отсортированный список цифр
        Collections.sort(digits);
        System.out.println("Отсортированный ряд цифр: " + digits);

// вычисление суммы цифр
        int sum = 0;
        for (int digit : digits) {
            sum += digit; // Добавляем текущий элемент к сумме
        }
        System.out.println("Сумма цифр: " + sum);

// вычисление суммы чётных чисел
        int sum2 = 0;
        for (int digit : digits) {
            if (digit % 2 != 0) {
                sum2 += digit;
            }
        }
        System.out.println("Сумма нечётных цифр: " + sum2);

// вычисление максимальной цифры
        int max = digits.get(0); // Предполагаем, что первый элемент - максимальный
        // Перебираем все элементы в ArrayList
        for (int digit : digits) {
            if (digit > max) {
                max = digit; // Обновляем max, если найдено большее значение
            }
        }
        System.out.println("Максимальная цифра числа: " + max);
    }
}


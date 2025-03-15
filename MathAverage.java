package Samples;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Инициализация списка для хранения введенных чисел
        List<Integer> numbers = new ArrayList<>(); // массив всех чисел
        List<Integer> numbers2 = new ArrayList<>(); // массив чётных чисел
        int sum = 0; //сумма для всех чисел
        int sum2 = 0; //сумма для чётных чисел
        // Запрашиваем числа у пользователя
        System.out.println("Ниже введите числа (от 4 до 19), введите 0 для завершения ввода.");
        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            // Выход из ввода
            if (number == 0) {
                break;
            }
            // Проверяем, что число в допустимом диапазоне
            while (number < 4 || number > 19) {
                System.out.print("Число должно быть от 4 до 19. Попробуйте снова: ");
                number = scanner.nextInt();
            }

            numbers.add(number); // Добавляем число в список
            sum += number; // Добавляем число к сумме
            // Проверяем, что число чётное
            if (number % 2 == 0) {
                numbers2.add(number);
                sum2 += number;
            }
        }
        // Проверка на случай, если не было введено ни одного числа
        if (numbers.size() == 0) {
            System.out.println("Вы не ввели ни одного числа.");
        } else {
            // Вычисляем среднее арифметическое
            double average = (double) sum / numbers.size();
            double average2 = (double) sum2 / numbers2.size();
            // Выводим результат
            System.out.println("Среднее арифметическое введенных чисел равно: " + new DecimalFormat("#.00").format(average));
            System.out.println("Среднее арифметическое чётных чисел равно: " + average2);
        }
    }
}


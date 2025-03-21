package Samples;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathAverage_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите левую границу диапазона больше 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите правую границу диапазона: ");
        int b = scanner.nextInt();

        if (a <= 1 || a >= b) {
            System.out.println("Некорректные границы. Проверьте значения границ");
            return;
        }

        int sum = 0;
        int sum2 = 0;
        int size = 0;
        int size2 = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            size++;

            if (i % 2 == 0) {
                sum2 += i;
                size2++;
            }
        }
        double average = (double) sum / size;
        double average2 = (double) sum2 / size2;

        System.out.println("Среднее арифметическое чисел из диапазона от " + a + " до " + b + " равно: " + new DecimalFormat("#.00").format(average));
        System.out.println("Среднее арифметическое чётных чисел из диапазона от " + a + " до " + b + " равно: " + average2);
        }
    }

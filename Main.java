package Samples;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение Ваше имя");
        String str = scanner.nextLine();
        System.out.println("Приве, " + str);

    }
}
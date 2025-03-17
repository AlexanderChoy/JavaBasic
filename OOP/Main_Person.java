package Samples.OOP;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Pavel";
        String middleName = "Pavlovich";
        String familyName = "Pavlov";
        int age = 20;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Имя человека: " + person.getName());
        System.out.println("Отчество человека: " + person.getMiddleName());
        System.out.println("Фамилия человека: " + person.getFamilyName());
        System.out.println("Возраст человека: " + person.getAge());

        System.out.println("Введите новое имя человека");
        person.setName(scanner.nextLine());
        System.out.println("Введите новый возраст человека");
        person.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Итого данные человека: " + person + ", рождённый в " + person.getBirthYear());
    }
}
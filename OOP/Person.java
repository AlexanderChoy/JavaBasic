package Samples.OOP;

import java.time.Year;

public class Person {
    private String name;

    private String middleName;

    private String familyName;

    private int age;

    public static final int MIN_AGE = 18;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + " " + age + " лет" + "}";
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено. Новое имя человека: " + name);
        } else {
            System.out.println("Имя не изменено, передано пустое имя");
        }
    }

    public void setAge(int age) {
        if (age < MIN_AGE) {
            System.out.println("Недопустимый возраст");
        } else {
            this.age = age;
            System.out.println("Возраст изменён. Новый возраст человека: " + age);
        }
    }

    public int getBirthYear() {
        int currentYear = Year.now().getValue(); // Получаем текущий год
        return currentYear - age;
    }
}
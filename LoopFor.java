package Samples;

public class LoopFor {
    //Функция для определения, что число делится на 4
    public static boolean isFour(int a) {
        return a % 4 == 0;
    }
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (isFour(i)) {
                System.out.println(i);
            }
        }
    }
}

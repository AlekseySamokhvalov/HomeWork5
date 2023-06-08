// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int clientOS = 0; // 0 для iOS, 1 для Android
/*
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение переменной clientOS");
        }
*/
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверное значение переменной clientOS");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
    }

}
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
        final int IOS = 0;
        final int ANDROID = 1;
        int clientOS = IOS; // по умолчанию используется iOS

        switch (clientOS) {
            case IOS:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case ANDROID:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверное значение переменной clientOS");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        final int IOS = 0;
        final int ANDROID = 1;
        final int checkYear = 2015;
        int clientOS = 1; // 0 для iOS, 1 для Android
        int clientDeviceYear = 2014; // год выпуска клиентского устройства

        if (clientDeviceYear < checkYear) {
            switch (clientOS) {
                case IOS:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case ANDROID:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неверное значение переменной clientOS");
                    break;
            }
        } else {
            switch (clientOS) {
                case IOS:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case ANDROID:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неверное значение переменной clientOS");
                    break;
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int year = 2010;
        // определяем, является ли год високосным
        if (year % 4 == 0) { // проверяем, делится ли год на 4 без остатка
            if (year % 100 == 0) { // если да, то проверяем, делится ли год на 100 без остатка
                if (year % 400 == 0) { // если да, то проверяем, делится ли год на 400 без остатка
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int deliveryDistance = 95; // расстояние до клиента в км

        int deliveryDays = 0; // количество дней доставки

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка невозможна");
            return; // выходим из программы, если доставка невозможна
            //Если бы ключевое слово return не было бы указано в последнем else-блоке,
            //то программа продолжила бы работу и выполнила бы последнюю строку System.out.println("Потребуется дней: " + deliveryDays);
        }

        System.out.println("Потребуется дней: " + deliveryDays);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        int monthNumber = 11;
        String season;

        switch(monthNumber) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                season = "зима";
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season = "весна";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = "лето";
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = "осень";
                break;
            default:
                System.out.println("Ошибка: некорректный номер месяца.");
                return; // выходим из программы, если номер месяца некорректен
        }

        System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season);
    }

}
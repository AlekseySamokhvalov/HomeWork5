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
        int clientOS = 1; // 0 для iOS, 1 для Android
        int clientDeviceYear = 2015; // год выпуска клиентского устройства
/*
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неверное значение переменной clientOS");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Неверное значение переменной clientOS");
            }
        }
 */
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неверное значение переменной clientOS");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
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
        int year = 2021;

        // определяем, является ли год високосным
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // выводим результат
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        /*
        // цикл по всем годам от 0 до 2100
        for (year = 0; year <= 2100; year++) {
            // определяем, является ли текущий год високосным
            boolean isLeapYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }

            // если текущий год високосный, выводим его
            if (isLeapYear) {
                System.out.println(year + " год является високосным");
            }
        }
        */
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
    }

}
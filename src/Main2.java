import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your operation system: 0 — iOS, 1 — Android");
        int clientOS = scanner.nextInt(2);

        switch (clientOS) {
            case 0 -> System.out.println("Install the iOS version of the app by following the link.\n");
            case 1 -> System.out.println("Install the Android version of the app by following the link.\n");
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your operation system: 0 — iOS, 1 — Android.");
        int clientOS = scanner.nextInt(2);
        System.out.println("Input device year:");
        int year = scanner.nextInt();

        if (clientOS == 0 && year < 2015) {
            System.out.println("Install the lite version of the iOS app by following the link\n");
        } else if (clientOS == 0 && year >= 2015) {
            System.out.println("Install the iOS version of the app by following the link\n");
        }
        if (clientOS == 1 && year < 2015) {
            System.out.println("Install the lite version of the Android app by following the link\n");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Install the Android version of the app by following the link\n");
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year:");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s is leap year%n%n", year);
        } else {
            System.out.printf("The %s year is not a leap year%n%n", year);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance:");
        int deliveryDistance  = scanner.nextInt();
        int days = 1;

        if (deliveryDistance  <= 20) {
            System.out.printf("It will take days: %d%n%n", days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
            System.out.printf("It will take days: %d%n%n", days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
            System.out.printf("It will take days: %d%n%n", days);
        } else {
            System.out.println("There is no delivery over 100 km.\n");
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month in numerical terms:");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> System.out.println("January refers to winter");
            case 2 -> System.out.println("February refers to winter");
            case 3 -> System.out.println("March refers to spring");
            case 4 -> System.out.println("April refers to spring");
            case 5 -> System.out.println("May refers to spring");
            case 7 -> System.out.println("July refers to summer");
            case 8 -> System.out.println("August refers to summer");
            case 9 -> System.out.println("September refers to autumn");
            case 10 -> System.out.println("October refers to autumn");
            case 11 -> System.out.println("November refers to autumn");
            case 12 -> System.out.println("December refers to winter");
            default -> System.out.println("Ошибка: неправильный номер месяца");
        }
    }
}

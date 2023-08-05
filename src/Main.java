import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age:");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.printf("You are %d years old, you're not reached the age of majority, you need to wait a little%n%n", age);
        } else {
            System.out.printf("You are %d years old and you're an adult%n%n", age);
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your temperature out where:");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.printf("Outside %d degrees. It's cold outside, you need to put on a hat%n%n", temperature);
        } else {
            System.out.printf("Outside %d degrees. It's warm today, you can go without a hat%n%n", temperature);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input speed:");
        int speed = scanner.nextInt();

        if (speed > 60) {
            System.out.printf("Your speed %d km/h. You will have to pay a fine%n%n", speed);
        } else {
            System.out.printf("Your speed %d km/h. You can drive without worry%n%n", speed);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age:");
        int age = scanner.nextInt();

        if (age < 2) {
            System.out.printf("You are %d years old. Go to sleep%n%n", age);
        } else if (age >= 2 && age <= 6) {
            System.out.printf("You are %d years old. Go to kindergarten.%n%n", age);
        } else if (age > 7 && age <= 18) {
            System.out.printf("You are %d years old. Go to school%n%n", age);
        } else if (age > 18 && age <= 24) {
            System.out.printf("You are %d years old. Go to university%n%n", age);
        } else if (age > 24 && age < 60) {
            System.out.printf("You are %d years old. Go to work%n%n", age);
        } else {
            System.out.printf("You are %d years old. Relax. Don't worry and be happy%n%n", age);
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age:");
        int childrenAge = scanner.nextInt();

        if (childrenAge < 5) {
            System.out.printf("You are %d years old. You can't ride the ride.%n%n", childrenAge);
        } else if (childrenAge >= 5 && childrenAge < 14) {
            System.out.printf("You are %d years old. You can ride the attraction only when accompanied by an adult.%n%n", childrenAge);
        } else {
            System.out.printf("You are %d years old. You can ride the attraction without an adult accompanying you.%n%n", childrenAge);
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        System.out.println("Capacity: 102 people");
        System.out.println("Number of seats: 60");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of passengers:");
        int passengers = scanner.nextInt();

        if (passengers < 60) {
            System.out.println("There are seats in the car");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("There are no seats, but there are places for standing in the car\n");
        } else {
            System.out.println("The car is completely full, there are no empty seats\n\n");
        }
    }

    private static void task7() {
        System.out.println("Задание 7");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number 1:");
        int one = scanner.nextInt();
        System.out.println("Input number 2:");
        int two = scanner.nextInt();
        System.out.println("Input number 3:");
        int three = scanner.nextInt();

        if (one >= two && one >= three) {
            System.out.printf("The number %d is greater than %d and %d.%n%n", one, two, three);
        } else if (two >= one && two >= three) {
            System.out.printf("The number %d is greater than %d and %d.%n%n", two, one, three);
        } else {
            System.out.printf("The number %d is greater than %d and %d.%n%n", three, one, two);
        }
    }

}
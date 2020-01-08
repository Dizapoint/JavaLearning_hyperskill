import java.util.Scanner;
import java.io.IOException;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        greet("Rock", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = "Your name";

        if (scanner.hasNext()) {
            name = scanner.nextLine();
        }
        else {
            name = "..don`t understand your name, sorry..";
        }
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        int rem3 = -2;
        int rem5 = -3;
        int rem7 = -4;
        int age = -10;

        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        try {
            if (scanner.hasNext()) {
                rem3 = scanner.nextInt();
            }
            if (scanner.hasNext()) {
                rem5 = scanner.nextInt();
            }
            if (scanner.hasNext()) {
                rem7 = scanner.nextInt();
            }
        }
        catch (Exception e) {
            System.out.println("This is not a number!");
            String clean = scanner.nextLine();
        }
        age = rem3 > 0 && rem5 > 0 && rem7 > 0 ? (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105 : age;
        if (age > 0)
            System.out.println("Your age is " + age + "; that's a good time to start programming!");
        else
            System.out.println("This was wrong input.");
    }

    static void count() {
        int num = 0;
        System.out.println("Now I will prove to you that I can count to any number you want.");
        try {
            if (scanner.hasNext()) {
                num = scanner.nextInt();
            }
            for (int i = 0; i <= num; i++) {
                System.out.printf("%d!\n", i);
            }
        }
        catch (Exception e) {
            System.out.println("This is not a number!");
            String clean = scanner.nextLine();
        }
    }

    static void test() {
        int answer = 0;

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        try {
            if (scanner.hasNext()) {
                answer = scanner.nextInt();
            }
            while (answer != 2) {
                System.out.println("Please, try again.");
                if (scanner.hasNext()) {
                    answer = scanner.nextInt();
                }
            }
            if (answer == 2)
                System.out.println("Congratulations!!!");
        }
        catch (Exception e) {
            System.out.println("This is not a number!");
            String clean = scanner.nextLine();
        }
    }

    static void end() {
        System.out.println("Have a nice day!");
    }
}
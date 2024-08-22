import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculator Project");

        //do-while loop different from 1
        int op = 0;
        do {
            System.out.println("Insert the first number :");
            int a = sc.nextInt();

            System.out.println("Insert the second number :");
            int b = sc.nextInt();
            System.out.println("Value 1 : " + a + " Value 2 : " + b + " \n");

            menu(a, b);
            System.out.println("Do you want to continue? 1 - Yes 2 - No");
            op = sc.nextInt();
        } while (op == 1); // end of loop

    }

    public static void menu(int a, int b) {

        System.out.println("** Escolha o tipo de operacao : **");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        int op = 0;
        do {
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(Operations.add(a, b));
                    break;
                case 2:
                    System.out.println(Operations.sub(a, b));
                    break;

                case 3:
                    System.out.println(Operations.multi(a, b));
                    break;

                case 4:
                    System.out.println(Operations.divi(a, b));
                    break;
            }

        } while (op < 4); // end of loop

    }
}

import Problems.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run(new Scanner(System.in));
    }

    public static void run(Scanner in) {

        boolean TF = true;
        while (TF) {

            System.out.println("Choise problem between 1 and 10 or 0 exit: ");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value for the task: ");
                    Task1.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.print("Enter a value for the task: ");
                    Task2.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.print("Enter a value for the task: ");
                    Task3.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.print("Enter a value for the task: ");
                    Task4.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.print("Enter a value for the task: ");
                    Task5.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.print("Enter a value for the task: ");
                    Task6.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 7:
                    System.out.print("Enter a value for the task: ");
                    Task7.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 8:
                    System.out.print("Enter a value for the task: ");
                    Task8.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.print("Enter a value for the task: ");
                    Task9.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 10:
                    System.out.print("Enter a value for the task: ");
                    Task10.run();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 0:
                    TF = false;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;

            }
        }
    }
}
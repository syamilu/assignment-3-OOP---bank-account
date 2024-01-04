import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        Boolean exit = false;
        do {
            Menu.mainMenu();
            choice = input.nextInt();// choice for main menu
            switch (choice) {
                case 1:
                    Menu.savingMenu(input);
                    break;
                case 2:
                    Menu.checkingMenu(input);
                    break;
                case 3:
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (!exit);
    }
}

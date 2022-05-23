import java.util.Scanner;

public class Menu {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);

        Seeder seeder = new Seeder ();
        MenuChoice menuChoice;
        int counter = 0;
        int selected;

        do {

            System.out.printf ("%d. Exit%n", counter++);

            do {
                menuChoice = seeder.getMenuChoice(counter - 1);

                if (menuChoice != null) {
                    System.out.printf("%d. %s%n", counter++, menuChoice.getName());
                }

            } while (menuChoice != null);

            System.out.println ();
            System.out.print ("Maak een keuze: ");
            selected = scanner.nextInt ();

            if (selected != 0) {

                MenuChoice choice = seeder.getMenuChoice(selected - 1);

                if (choice != null) {
                    choice.execute ();
                }
                else {
                    System.out.println ();
                    System.out.println (ANSI_RED + "Dit is een ongeldige menukeuze. Maak uw keuze opnieuw." + ANSI_RESET);
                    System.out.println ();
                }
            }

            counter = 0;

        } while (selected != 0);
    }
}

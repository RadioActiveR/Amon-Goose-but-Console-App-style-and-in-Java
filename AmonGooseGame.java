import java.util.Scanner;

public class AmonGooseGame {

    public static final String RESET = "\u001B[0m";
    public static final String BLUEVIOLET = "\u001B[35m";
    public static final String LIGHT_BLUE = "\u001B[36m";
    public static final String RED = "\u001B[31m";

    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        type("You wake up in a " + BLUEVIOLET + "Small Dark Room" + RESET + ". You have no memories of what happened or how you got here.\n");

        type(LIGHT_BLUE + "\n(1) Look Around\n\n" + RESET);

        boolean validChoice1 = false;
        while (!validChoice1) {

        System.out.print("> ");
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("Look Around")){

            clearScreen();

            type("\nYou look around you and observe the room.\n");

            type("\nOn the other side of the room you notice a " + BLUEVIOLET + "Rusty Metal Door" + RESET + ". Beside you a " + BLUEVIOLET + "Pile of Blankets " + RESET + "and a small pillow, you"); 
            type("\nassume it's supposed to be where you sleep. To one of the walls you see a " + BLUEVIOLET + "Boarded Window " + RESET + "with only small amounts of"); 
            type("\nlight beaming through the gaps. Beside the window is a lone " + BLUEVIOLET + "Crooked Cabinet " + RESET + "which looks very old.");

            type(LIGHT_BLUE + "\n\n(1) Rest on the Pile of Blankets");
            type("\n(2) Investigate the Rusty Metal Door");
            type("\n(3) Try looking through the gaps of the Boarded Window");
            type("\n(4) Check the Crooked Cabinet\n\n" + RESET);

            boolean validChoice2 = false;
            while (!validChoice2) {

            System.out.print("> ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("Rest on the Pile of Blankets")) {

                clearScreen();

                type("\nYou lie on the pile of blankets and cover yourself in one of them.\n");

                validChoice2 = true;

            } else if (choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("Investigate the Rusty Metal Door")) {

                clearScreen();

                type("\nYou walk towards the door.\n");

                validChoice2 = true;

            } else if (choice.equalsIgnoreCase("3") || choice.equalsIgnoreCase("Try looking through the gaps of the Boarded Window")) {
                
                clearScreen();

                type("\nYou try looking through one of the gaps in the window but can't seem to see anything other than you're in the middle of a desolate forest.\n");
                
                validChoice2 = true;

            } else if (choice.equalsIgnoreCase("4") || choice.equalsIgnoreCase("Check the Crooked Cabinet")) {

                clearScreen();

                type("\nYou check out the lone crooked cabinet. You open it to see if contains anything useful. Unfortunately it's " + RED + "empty" + RESET + "."); 
                type("\nHowever you think you can fit inside when the need to hide comes.\n");
                
                validChoice2 = true;

            } else {

                type(RED + "\nINVALID INPUT\n\n" + RESET);

            }
            }

        validChoice1 = true;

        } else {

            type(RED + "\nINVALID INPUT\n\n" + RESET);

        }
        }

        type("\n----- END OF DEMO -----\n\n");
        scanner.close();
    }

    public static void type(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}

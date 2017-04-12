import java.util.Scanner;

/**
 * A program that takes the user on a
 * Mystical Adventure in Ye Olde Detroit
 *
 * @author Sarah Guarino
 * @version 1.1
 */
public class BonusEighteen {
    private static Scanner scnr = new Scanner(System.in);
    private static int tempNum = 0;
    private static String myDiv = "\n********************\n";
    private static String adventClass = "";
    private static String adventName = "";
    private static boolean doAgain = true;

    /**
     * initializes the name question
     * asks the user for their name
     * then receives the user input
     */
    private static void setAdventName(){
        String namePrompt = "What is the name of our hero?: ";

        System.out.print(namePrompt);
        adventName = scnr.nextLine();
    }

    /**
     * initializes the class question
     * asks the user for their input
     * then receives the user input
     * and validates it
     */
    private static void setAdventClass() {
        String classPrompt = "What kind of hero are you?:\n\t(1) A Warrior\t-or-\t(2) An Enchanter\n\t";
        String questline1;
        System.out.print(classPrompt);

        // repeats the do .. while loop if the user enters something other than 1 or 2
        do {
            tempNum = scnr.nextInt();

            // actions depending on input
            if (tempNum == 1) {
                doAgain = false;
                adventClass = "Warrior";
                questline1 = "" + myDiv + "There is the foul feel to the air. Being the great " + adventClass + " that you\nare, you decide to grab your trusty sword and shield, and head to\nthe Palace. When you get there, the King tells you of the terrible\ndragon who is stealing all of the Kingdom's gold for themselves!" + myDiv + "";
                System.out.println(questline1);
            } else if (tempNum == 2) {
                doAgain = false;
                adventClass = "Enchanter";
                questline1 = "" + myDiv + "There is the foul feel to the air. Being the great " + adventClass + " that\nyou are, you decide to use your trusty crystal ball, and begin to\nscry. In it you see the great and terrible dragon and it's\nhenchmen forcing the good citizens from their homes!" + myDiv + "";
                System.out.println(questline1);
            } else {
                doAgain = true;
                System.out.print("That was not the right input! Please enter 1 or 2!\n\t");
            }
        }
        while(doAgain);
    }

    /**
     * the main() method of my program
     *
     * @param args passes the default main perimeters
     */
    public static void main(String[] args){
        String welcome = "" + myDiv + "Welcome to the Kingdom of Ye Olde Grand Circus." + myDiv + "";
        String moralDilemmaEnchanter = "Would you like to:\n\t(1) Help the citizens run the dragon out of town\t-or-\n\t(2) Help the dragon run the citizens out of town\n\t";
        String moralDilemmaWarrior = "Would you like to:\n\t(1) Reason with the dragon on behalf of the people\t-or-\n\t(2) Tell the King that rich dragons share their wealth,\n\tthen charge him a consultation fee\n\t";
        String adventTitle;

        // welcomes the user
        System.out.println(welcome);

        // asks the user for their name and chosen class
        setAdventName();
        setAdventClass();

        // asks the user to make a moral choice, depending on their class
        if (adventClass.equals("Enchanter")) {
            System.out.print(moralDilemmaEnchanter);

            // will repeat if the user does not enter 1 or 2
            do {
                doAgain = false;
                tempNum = scnr.nextInt();

                // ends the tory different if the character is good or bad, and repeats the question if input is incorrect
                if (tempNum == 1) {
                    doAgain = false;
                    adventTitle = adventName + " the Top Dog";
                    System.out.println(myDiv + "You subdue the beast by the force of your (calm and assertive TM)\nwill. You are now a local hero and know as " + adventTitle + "\nthroughout the land." + myDiv);
                } else if (tempNum == 2) {
                    doAgain = false;
                    adventTitle = adventName + " the Cheddar " + adventClass;
                    System.out.println(myDiv + "Your efforts are in vain, and the King's men drive you AND the\ndragon from the Kingdom. Later, the dragon stress-eats you with a\nbowl of Drag'N'Cheese. You are known as " + adventTitle + "\nfor the rest of forever." + myDiv);
                } else {
                    doAgain = true;
                    System.out.println("That was not the right input! Please enter either 1 or 2!");
                }
            }
            while(doAgain);
        }
        else if (adventClass.equals("Warrior")) {
            System.out.print(moralDilemmaWarrior);

            do {
                doAgain = false;
                tempNum = scnr.nextInt();

                if (tempNum == 1) {
                    adventTitle = adventName + " the Negotiator";
                    System.out.println(myDiv + "You have a heart-to-heart with the dragon, and it leaves after a\nsincere apology. You are hailed as a hero throughout the Kingdom,\nwhere they call you " + adventTitle + "." + myDiv);
                } else if (tempNum == 2) {
                    System.out.println(myDiv + "No dice! The King throws you AND the dragon in the dungeons - and\nthe dragon calls dibs on the top bunk. No one talks about you." + myDiv);
                } else {
                    doAgain = true;
                    System.out.println("That was not the right input! Game Over!");
                }
            }
            while(doAgain);
        }
        scnr.close();
    }
}

import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner is used to read the input of the user.
        String choiceMade; //string used for the player's choices

        System.out.println(" Welcome to Hishaam's choose your own adventure game! ");
        System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println(" You wake up in a decrepit old tomb...The sour air fills your lungs as you get up from the cold marble ground. ");
        System.out.println(" As you get up, you see two doors; a battered red door on your left and a molding yellow door on your right. ");
        System.out.println(" Which door would you like to go through? red or yellow? ");
        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" Your choice is: "); 
        System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------  ");

        choiceMade = sc.nextLine(); //with each choice the scanner is used to scan the next user input.
        if(choiceMade.equals("red")){ //the output below will be generated if the user input matches the object name, in this case it is red, for red door.
            System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------  ");
            System.out.println(" You enter the red door and find yourself in a room with a marble table. ");
            System.out.println(" On top of this table there are two weapons - A lightweight, quick attacking dagger and a heavy, hard hitting greatsword. "); 
            System.out.println(" Which weapon do you take? ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" Your choice is: ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        
        choiceMade = sc.nextLine();
        if(choiceMade.equals("dagger")){//if and else are used to create the user choices, if the user's input does not match "dagger" in this case, they will recieve the sword choice output.
        System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println(" You pick up the dagger and marvel at the jewel encrusted design ");
        System.out.println(" the dagger is extreemly sharp, you run a finger down the blade gently, drawing blood. ");
        System.out.println(" You hear a shuffling sound behind you...");
        System.out.println(" You turn around and see a mummy covered in blood soaked, moldy bandages. ");
        System.out.println(" You have two choices, you can either attack the mummy or run. Which will you do? attack or run? ");
        System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println(" Your choice is: ");
        System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

        choiceMade = sc.nextLine();
        if(choiceMade.equals("run")){
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" You run past the mummy and see a doorway, as you enter the doorway a heavy boulder rolls behind you, blocking the mummy from following you . ");
            System.out.println(" You look around you and see that there is a chest full of treasure, diamonds, precious metals etc infront of you and a crack in the wall which leads to the outside world. ");
            System.out.println(" ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ ");
            System.out.println(" Congratulations! you win the game! ");

        } else

        {
            choiceMade.equals("attack");
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" You attack the mummy with the dagger, you deal 15 damage... ");
            System.out.println(" The mummy has 75 HP left and starts dragging itself towards you ");
            System.out.println(" The mummy brings its heavy, bandaged covered arm above its head and hits you with an extreme amount of force. Dealing 65 damage. ");
            System.out.println(" You fall down to your knees in sheer agony. ");
            System.out.println(" The mummy hits you again, dealing an additional 35 damage and your vision fades to black... ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" GAME OVER:  Better luck next time! ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        
        }
        
        } else {
            choiceMade.equals("sword");{ 
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" You pick up the sword and marvel at black metal of the blade. ");
            System.out.println(" The sword is rather heavy, leading to you holding it using both hands. ");
            System.out.println(" You hear a shuffling sound behind you... ");
            System.out.println(" You turn around and see a mummy covered in blood soaked, moldy bandages. ");
            System.out.println(" You have two choices, you can either attack the mummy or run. Which will you do? attack or run? ");
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" Your choice is: ");
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

            choiceMade = sc.nextLine();
            if(choiceMade.equals("run")){
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" You attempt run past the mummy but your heavy greatsword causes you to trip, impaling yourself on the blade. ");
            System.out.println(" Your vision fades to black... ");
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" GAME OVER: Better luck next time! ");
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

            } else
            {
             if(choiceMade.equals("attack"));
             System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
             System.out.println(" You swing the heavy greatsword as hard as you can at the mummy.... ");
             System.out.println(" The mummy's head falls off its shoulders and hits the ground with a gut wrenching splat, dealing 100 damage. ");
             System.out.println(" You walk past the mummy's body and enter the doorway behind it. ");
             System.out.println(" You can't believe your eyes... ");
             System.out.println(" There is a big chest of treasures, treasures ranging from assorted jewelry to beautiful precious metals such as gold, silver and platinum. ");
             System.out.println(" there is a crack in the wall which leads to the outside world.");
             System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
             System.out.println(" Contratulations! You win the game! ");
             System.out.println(" ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            }
            }
        }
        
        } else {

            choiceMade.equals("yellow");

            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" You open the yellow door and hear a whistling sound from within.... ");
            System.out.println(" Suddenly, you feel a sharp pain in your stomach...you look down and see that there are a horde of arrows sticking out... ");
            System.out.println(" Your vision fades to black... ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(" GAME OVER: Better luck next time! ");
            System.out.println("  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        }

    
        


    }
    
}

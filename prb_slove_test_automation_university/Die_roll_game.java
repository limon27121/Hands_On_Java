package prb_slove_test_automation_university;

import java.util.Random;

public class Die_roll_game {
    public static void main(String[] args) {
        Random random = new Random();
        int totalSpaces = 20;
        int currentPosition = 0;
        int maxRolls = 5;
        System.out.println("Welcome to the 'Roll the Die' Game!");
        System.out.println("Your goal is to reach exactly space 20 in 5 rolls or less.");
        for (int i=0;i<=maxRolls;i++){
            int die_roll= random.nextInt(6)+1;
            currentPosition+=die_roll;
            if (currentPosition>totalSpaces){
                System.out.println("Roll " + i + ": You rolled a " + die_roll + ". You advanced to space " + currentPosition + ".");
                System.out.println("Oops! You went past 20. You lose!");
                return;
            } else if (currentPosition==totalSpaces) {
                System.out.println("Roll " + i + ": You rolled a " + die_roll + ". You advanced to space " + currentPosition + ".");
                System.out.println("Congrats! You won in " + i + " rolls!");
                return;
            }
            else {
                System.out.println("Roll " + i + ": You rolled a " + die_roll + ". You are now on space " + currentPosition +
                        " and have " + (totalSpaces - currentPosition) + " more to go.");
            }
        }
        System.out.println("😞 You’ve used all 5 rolls and didn’t reach space 20. You lose!");

    }

}

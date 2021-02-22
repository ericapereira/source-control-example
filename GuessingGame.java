import java.util.*;
/**
 * Game to allow user to guess random number.
 *
 * @author (bing)
 * @version ()
 * @source = https://gist.github.com/quanb19/63e4864496992dc4702d0c7bdb01fac1
 */
public class guessingGame
{

  public static void main(String[] args){
        int rnd; //random
        int guessInt;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("This is the one and only guessing game");
       
        boolean keepGoing = true;
        boolean playAgain = true;
        int guessCounter=0;
        int guess = 0;

        while(playAgain==true){
        int max = 10;
        int min = 1;
        int randomNum = (int)(Math.random() * ((max - min) + 1)) + min; //inclusive
        keepGoing = true;
        guessCounter=0;
        //--------------------- 
       while(keepGoing){
           System.out.println("Please guess a number between 1 and 10");
           int userInput = scan.nextInt();
           guessCounter++;
           System.out.println("UserInput: " + userInput);
           if(userInput==randomNum){
               System.out.println("WINNER");
               keepGoing=false;
            }else{
               if(guessCounter==3){
                  keepGoing=false; 
               }
               System.out.println("WRONG");
           }
            
        }//end of inner while loop
         System.out.println("Random number was " + randomNum);
         //-----------------
         System.out.println("Enter 1 to play again or 2 to exit");
         int play = scan.nextInt();
         if(play != 1){
             playAgain=false;
          }
     }   
}
}
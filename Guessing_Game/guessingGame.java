import java.util.*;

public class guessingGame {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int min = 1; 
        int max = 20; 
        
        System.out.println("WELCOME TO THE GUESSING GAME");
        
        while (true) {
            System.out.println("PRESS 1 OR 2");
            System.out.println("1. Let's play");
            System.out.println("2. Exit");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the number you guess between 1-20:");
                    int x = input.nextInt();
                    int y = r.nextInt(max - min + 1) + min;
                    
                    if (x != y) {
                        for (int i = 0; i < 3; i++) {
                            if (x < y) {
                                System.out.println("Your guess is too low. Guess again:");
                                x = input.nextInt();
                            } else if (x > y) {
                                System.out.println("Your guess is too high. Guess again:");
                                x = input.nextInt();
                            }
                        }
                        
                        if (x == y) {
                            System.out.println("Congratulations! You guessed it right.");
                        } else {
                            System.out.println("Sorry, you are out of luck!");
                        }
                    }
                    
                    break;
                    
                case 2:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
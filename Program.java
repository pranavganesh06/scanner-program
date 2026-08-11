// Import the Scanner class from the java.util package to handle user input
import java.util.Scanner;
// Import the IOException class from the java.io package to allow throwing the exception
import java.io.IOException;

public class JJKCharacters {
    
    // The main method signature now explicitly declares that it can throw an IOException
    public static void main(String[] args) throws IOException {
        
        // Initialize a new Scanner object to read input from the standard system input stream
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to type a Jujutsu Kaisen character name into the console
        System.out.println("Enter a Jujutsu Kaisen character name:");
        
        // Read the user input string, remove any leading/trailing blank spaces, and store it
        String character = scanner.nextLine().trim();
        
        // Check if the input matches "Sukuna", ignoring case sensitivity
        if (character.equalsIgnoreCase("Sukuna")) {
            System.out.println("Malevolent Shrine: Cuts everything within a specific radius down to dust.");
            
        // Check if the input matches "Naoya", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Naoya")) {
            System.out.println("Projection Sorcery: Divides one second into twenty-four frames to move at extreme speeds.");
            
        // Check if the input matches "Maki", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Maki")) {
            System.out.println("Heavenly Restriction: Grants immense physical strength and heightened senses in exchange for having zero cursed energy.");
            
        // Check if the input matches "Megumi", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Megumi")) {
            System.out.println("Ten Shadows Technique: Summons diverse shikigami from shadows to fight and trap opponents.");
            
        // Check if the input matches "Nanami", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Nanami")) {
            System.out.println("Ratio Technique: Creates a weak point on the target at a seven-to-three ratio line.");
            
        // Check if the input matches "Yuki", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Yuki")) {
            System.out.println("Star Rage: Adds overwhelming virtual mass to herself and her shikigami without slowing down.");
            
        // Check if the input matches "Nobara", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Nobara")) {
            System.out.println("Straw Doll Technique: Channels cursed energy through nails and a straw doll to damage targets from a distance.");
            
        // Check if the input matches "Todo", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Todo")) {
            System.out.println("Boogie Woogie: Swaps the positions of any two things with cursed energy by clapping hands.");
            
        // Check if the input matches "Gojo", ignoring case sensitivity
        } else if (character.equalsIgnoreCase("Gojo")) {
            System.out.println("Limitless: Manipulates space to bring infinity into reality for absolute defense and gravity distortion.");
            
        // Execute this block if the user input does not match any of the names listed above
        } else {
            System.out.println("Character not found in this specific roster.");
        }
        
        // Close the scanner object to free up system resources associated with it
        scanner.close();
    }
}

// Mahera Asin 
// October 08 2024 
// Creating a recursive solution to count the number of vowels in a string.



	import java.util.Scanner;

	public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
     
        // Prompt the user to enter a string
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the recursive method to count vowels	

        int vowelCount = Vowels.countVowels(inputString, 0);

        // Display the result
        
        System.out.println("Vowel count: " + vowelCount);

      
        scanner.close();
    }
}

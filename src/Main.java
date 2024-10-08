// Mahera Asin 
// October 08 2024 
// Creating a recursive solution to count the number of vowels in a string.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = Vowels.countVowels(inputString, 0);


        System.out.println("Vowel count: " + vowelCount);

      
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = Vowels.countVowels(inputString, 0);


        System.out.println("The number of vowels in the string is: " + vowelCount);

      
        scanner.close();
    }
}

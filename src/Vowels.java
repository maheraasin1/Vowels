public class Vowels {

	
	// Recursive method to count vowels in a string
	
    public static int countVowels(String str, int index) {

    	if (index == str.length()) {
            return 0;
        }

        // Convert the current character to lowercase and check if it is a vowel

        char currentChar = Character.toLowerCase(str.charAt(index));
        int count = (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') ? 1 : 0;

        // Recursive call 
        
        return count + countVowels(str, index + 1);
    }
}

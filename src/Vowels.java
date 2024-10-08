public class Vowels {

    
    public static int countVowels(String str, int index) {

    	if (index == str.length()) {
            return 0;
        }

        char currentChar = Character.toLowerCase(str.charAt(index));
        int count = (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') ? 1 : 0;

        return count + countVowels(str, index + 1);
    }
}

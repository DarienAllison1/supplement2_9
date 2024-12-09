

public class Main {

    public static void main(String[] args) {
        // Test getEvenNumbers function
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = Functions.getEvenNumbers(numbers);
        System.out.println("Even Numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println(); 

        // Test toUpperCase function
        String str = "wassup";
        String upperStr = Functions.toUpperCase(str);
        System.out.println("Uppercase: " + upperStr);

        // Test getLongestString function
        String[] words = {"Christmas", "Factory", "Elf"};
        String longestWord = Functions.getLongestString(words);
        System.out.println("Longest Word: " + longestWord);
    }
}

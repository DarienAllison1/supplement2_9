
public class Functions {

    /**
     * Returns an array of even numbers from the input array.
     */
    public static int[] getEvenNumbers(int[] numbers) {
        return java.util.Arrays.stream(numbers) // Stream the array
                .filter(n -> n % 2 == 0) // Keep only even numbers
                .toArray(); // Collect the even numbers into a new array
    }

    /**
     * Converts all characters of the input string to upper case.
     */
    public static String toUpperCase(String str) {
        return str.toUpperCase(); // Use String's built-in toUpperCase() method
    }

    /**
     * Returns the longest string from the input list of strings..
     */
    public static String getLongestString(String[] strings) {
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}

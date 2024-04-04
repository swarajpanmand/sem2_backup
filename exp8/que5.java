//use javac to compile still need to work on it

public class BackwardsCharSequence implements CharSequence {
    private String str;

    // Constructor to initialize the string
    public BackwardsCharSequence(String str) {
        this.str = str;
    }

    // Method to return the length of the string
    public int length() {
        return str.length();
    }

    // Method to return the character at the specified index from the end of the string
    public char charAt(int index) {
        return str.charAt(str.length() - 1 - index);
    }

    // Method to return a subsequence of the string starting from the specified start index and ending at the specified end index
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = end - 1; i >= start; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to return the string representation of the BackwardsCharSequence
    public String toString() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    
}
class que5{
    public static void main(String[] args) {
        // Main method to test the class
        String sentence = "Isn't the moon lovely!";
        BackwardsCharSequence backwards = new BackwardsCharSequence(sentence);
        System.out.println("Backwards string: " + backwards.toString());
    }
}
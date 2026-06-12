import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fixed: Changed System.class to System.in
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert string to character array to avoid using string methods in the loop
        char[] charArray = input.toCharArray();
        
        for (char ch : charArray) {
            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } 
            // Check if the character is a lowercase letter
            else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
            // All other characters (spaces, numbers, punctuation) are ignored
        }
        
        System.out.println("--- Results ---");
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        
        sc.close();
    }
}
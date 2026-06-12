public class ReverseString {
    public static void main(String[] args)  {
        String str = "5423ME";
        String rev = " ";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            
        }
        System.out.println("Reversed String: " + rev);
        
        if(str.equals(rev)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        
    }
}
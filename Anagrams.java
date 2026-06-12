public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        // Fixed string concatenation and spacing here
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Fixed array initialization syntax using 'new'
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        
        // Added the missing return statement
        return true; 
    }
}
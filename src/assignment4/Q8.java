import java.util.HashMap;

public class AssignmentQ8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }

        return charCountMap.isEmpty();
    }
}
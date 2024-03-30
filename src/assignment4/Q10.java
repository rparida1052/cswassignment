import java.util.HashMap;
import java.util.Map;

public class AssignmentQ10 {
    public static void main(String[] args) {
        String largeString = "Lorem ipsum dolor sit amet consectetur adipiscing elit " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua " +
                "Ut enim ad minim veniam quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur " +
                "Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia " +
                "deserunt mollit anim id est laborum";

        String[] words = largeString.split("\\s+");

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, 1);
            } else {
                int frequency = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, frequency + 1);
            }
        }
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Most occurring words in the string:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
import java.util.HashSet;

public class AssignmentQ9 {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        RepeatingIntegers(array);
    }

    public static void RepeatingIntegers(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }
        if (!repeating.isEmpty()) {
            System.out.println("Repeating integers in the array:");
            for (int num : repeating) {
                System.out.print(num+" ");
            }
        } else {
            System.out.println("No repeating integers found in the array.");
        }
    }
}
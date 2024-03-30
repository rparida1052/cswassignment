
import java.util.Scanner;
import java.util.TreeSet;

public class AssignmentQ6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements to TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // (a) Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b) Search for a number
        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        if (treeSet.contains(num)) {
            System.out.println(num + " is present in the TreeSet.");
        } else {
            System.out.println(num + " is not present in the TreeSet.");
        }
        // (c) Remove an element from tree
        System.out.print("Enter an element to remove: ");
        int removeNum = scanner.nextInt();
        if (treeSet.contains(removeNum)) {
            treeSet.remove(removeNum);
            System.out.println("Element " + removeNum + " removed from TreeSet.");
        } else {
            System.out.println("Element " + removeNum + " not found in the TreeSet.");
        }
        // Displaying TreeSet after removal
        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class User {
    private String name;
    private int age;
     User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
 class ArrayListUser {
    private ArrayList <User> users;

    public ArrayListUser() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }
}
public class AssignmentQ2 {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();
        arrayListUser.addUser(new User("priya", 25));
        arrayListUser.addUser(new User("pinki", 30));
        arrayListUser.addUser(new User("puja", 20));
        System.out.println("Before sorting:");
        arrayListUser.printUsers();
        arrayListUser.sortUsersByAge();
        System.out.println("After sorting by age:");
        arrayListUser.printUsers();
    }
}

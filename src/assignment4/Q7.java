import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

     Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String getPlotNo() {
        return plotNo;
    }
    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }
    public String getAt() {
        return at;
    }
    public void setAt(String at) {
        this.at = at;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    @Override
    public String toString() {
        return "Address [plotNo=" + plotNo + ", at=" + at + ", post=" + post + "]";
    }
}
public class AssignmentQ7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        addressMap.put("kohli", new Address("1A", "Banglore", "CityA"));
        addressMap.put("dohni", new Address("2B", "Ranchi", "CityB"));
        addressMap.put("Rohit", new Address("3C", "Mumbia", "CityC"));

        System.out.println("Addresses in the TreeMap:");
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name + ", Address: " + addressMap.get(name));
        }
    }
}

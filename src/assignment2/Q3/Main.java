package assignment2.Q3;

class SIM {
    private String carrierName;
    private String phoneNumber;

    public SIM(String carrierName, String phoneNumber) {
        this.carrierName = carrierName;
        this.phoneNumber = phoneNumber;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class MobileApp {
    private SIM sim;

    public void insertSIM(SIM sim) {
        this.sim = sim;
    }

    public void displaySIMInfo() {
        if (sim != null) {
            System.out.println("SIM Details:");
            System.out.println("Carrier: " + sim.getCarrierName());
            System.out.println("Phone Number: " + sim.getPhoneNumber());
        } else {
            System.out.println("No SIM card inserted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SIM sim1 = new SIM("Verizon", "123-456-7890");
        SIM sim2 = new SIM("AT&T", "987-654-3210");

        MobileApp mobileApp = new MobileApp();
        mobileApp.displaySIMInfo();

        mobileApp.insertSIM(sim1);
        mobileApp.displaySIMInfo();

        mobileApp.insertSIM(sim2);
        mobileApp.displaySIMInfo();
    }
}


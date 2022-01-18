package carRental;

public class Inventory extends UI {

    String[] type = {"Car","Truck", "SUV"};
    String[] make = {"Chevrolet", "Ford", "Honda"};
    String[] chevyCarModel = {"Cruise", "Volt", "Camaro"};
    String[] chevyTruckModel = {"Silverado", "Colorado"};
    String[] chevySUVModel = {"Trailblazer", "Equinox", "Tahoe"};
    String[] fordCarModel = {"Focus", "Taurus"};
    String[] fordTruckModel = {"F150", "F250"};
    String[] fordSUVModel = {"Explorer", "Escape", "Bronco"};
    String[] hondaCarModel = {"Civic", "Accord", "Insight"};
    String[] hondaTruckModel = {"Ridgeline"};
    String[] hondaSUVModel = {"Passport", "HR-V", "CR-V"};

    static boolean available = true;

    public static void carAvailable() {
        available = true;
    }

    public static void carRented() {
        available = false;
    }
}

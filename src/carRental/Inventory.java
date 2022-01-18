package carRental;

public class Inventory extends Cars {

    static boolean available = true;

    public static void carAvailable() {
        available = true;
    }

    public static void carRented() {
        available = false;
    }

    public static void main(String[] args) {

        new Cars();

    }

}

package variablesprogramme;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Declare the variables

        // True based
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;

        // Char related
        char condition;

        // Numeric-Related
        byte numberOfSimCards;
        byte randomAccessMemory;
        short productionYear;
        int numberOfCameras;
        long id;
        float operatingSystemVersion;
        double price;

        // initialize an Iphone
        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isStolen = false;
        isBlocked = true;
        isCharged = true;
        condition = 'A';

        numberOfSimCards = 2;
        randomAccessMemory = 4;
        productionYear = 2023;
        id = 3214254332141L;
        numberOfCameras = 3;
        operatingSystemVersion = 13.1F;
        price = 34555.5;

        System.out.println("The phone is charged " + isCharged);

        System.out.println("The phone price is " + price);
    }
}

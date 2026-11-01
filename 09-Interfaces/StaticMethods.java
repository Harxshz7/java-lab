public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(UnitConverter.kilometersToMiles(10));
        System.out.println(UnitConverter.milesToKilometers(6.2));
    }
}

interface UnitConverter {
    static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}

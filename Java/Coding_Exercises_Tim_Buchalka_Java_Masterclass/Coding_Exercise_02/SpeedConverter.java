package Coding_Exercise_02;

public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour < 0.0D ? - 1L : Math.round(kilometersPerHour / 1.609D);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0.0D) {
            System.out.println("Invalid value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

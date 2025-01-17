package Day2;

public class SecondChallenge {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        else return (long)Math.round((kilometersPerHour / 1.609));
    }
    public static void printConversion(double kilometersPerHour){
        if(toMilesPerHour(kilometersPerHour) != -1)
            System.out.print(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour)+" mi/h");
        else
            System.out.print("Invalid Value");
    }

    public static void main(String[] args) {
        printConversion(100);
    }
}

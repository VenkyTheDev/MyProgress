package Day2;

public class SixthChallenge {
    public static boolean areEqualByThreeDecimalPlaces(double a , double b){
        return (int) (a * 1000) == (int) (b * 1000);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.143 , 3.144)? "Equal up to 3 decimal places" : "Not Equal up to 3 decimal places");
    }
}

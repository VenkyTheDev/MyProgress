package Day2;

public class RemainingChallenges {
    public static boolean hasEqualSum(int a , int b , int c){ //Seventh Challenge
        return a + b == c;
    }
    //Eight Challenge
    public static boolean hasTeen(int a , int b , int c){
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }
    public static boolean isTeen(int a){
        return ((a >= 13) && (a <= 19));
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.print("Invalid Value");
        else{
            long year = (((minutes / 60L) / 24L) / 365L);
            long days = (minutes / 60L / 24L) - (year * 365L);
            System.out.print(minutes + " min = " + year + " y " + "and " + days + " d");
        }
    }
    public static void printEqual(int a , int b , int c){
        if(a < 0 || b < 0 || c < 0) System.out.print("Invalid Value");
        else if((a == b) && (a == c)) System.out.print("All numbers are equal");
        else if(((a != b) && (a != c)) && (b != c)) System.out.print("All numbers are different");
        else System.out.print("Neither all are equal or different");
    }
    public static boolean isCatPlaying(boolean summer , int temperature){
        if(summer && (temperature >= 25 && temperature <= 45)) return true;
        else return !summer && (temperature >= 25 && temperature <= 35);
    }
    public static void main(String[] args) {
        System.out.println();
    }
}

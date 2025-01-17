package Day2;

public class FifthChallenge {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2100)? "Leap Year" : "Not a Leap Year");
    }
}

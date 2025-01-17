package Day2;

public class FourthChallenge {
    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else return (hourOfDay < 8 || hourOfDay > 22) && barking;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false , 6) ? "Wakeup" : "Ignore");
    }
}

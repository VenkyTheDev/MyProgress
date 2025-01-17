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

    public static void main(String[] args) {
        System.out.println();
    }
}

package Day2;

public class DebuggingLoops {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;
        for(int loopCount = 1 ; loopCount <= 100 ; loopCount++){
            if((loopCount % 3 == 0) && (loopCount % 5 == 0)){
                countOfMatches++;
                sumOfMatches += loopCount;
                System.out.printf("A Number %d found \n" , loopCount);
            }

        }
        System.out.printf("Total Sum is: %d \nTotal Count is: %d" , sumOfMatches , countOfMatches);
    }
    /*
        Debugging in Intellij (line 9);
        Also separate the watches for a better understanding about the code
     */
}

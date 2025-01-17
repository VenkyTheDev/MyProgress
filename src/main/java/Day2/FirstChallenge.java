package Day2;

public class FirstChallenge {
    public static void checkNumber(int number){
        if(number > 0){
            System.out.print("positive");
        }
        else if(number == 0){
            System.out.print("zero");
        }
        else{
            System.out.print("negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(1024);
    }
}

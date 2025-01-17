package Day2;

public class ThirdChallenge {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0) System.out.print("Invalid Value");
        else
            System.out.print(kiloBytes+" KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes - ((kiloBytes / 1024) * 1024)) + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}

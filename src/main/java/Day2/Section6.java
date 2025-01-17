package Day2;

public class Section6 {
    //  Challenge 1 in Section 6
    public static void printNumberInWord(int number){
        switch(number){
            case 0 -> System.out.print("ZERO");
            case 1 -> System.out.print("ONE");
            case 2 -> System.out.print("TWO");
            case 3 -> System.out.print("THREE");
            case 4 -> System.out.print("FOUR");
            case 5 -> System.out.print("FIVE");
            case 6 -> System.out.print("SIX");
            case 7 -> System.out.print("SEVEN");
            case 8 -> System.out.print("EIGHT");
            case 9 -> System.out.print("NINE");
            default -> System.out.print("OTHER");
        }
    }
    //   Challenge 2 in Section 6
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

    public static int getDaysInMonth(int month , int year){
        if(month < 1 || month > 12) return -1;
        if(year < 1 || year > 9999) return -1;
        return switch(month){
            case 1 , 3, 5, 7 , 8, 10, 12 -> 31;
            case 2 -> (isLeapYear(year)? 29 : 28);
            default -> 30;
        };
    }
    //
    public static void main(String[] args) {
        System.out.println();
    }
}

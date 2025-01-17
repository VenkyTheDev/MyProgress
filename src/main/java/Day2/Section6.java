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
    // sumOdd Challenge
    public static boolean isOdd(int number){
        if(number < 0 || (number % 2) == 0) return false;
        return true;
    }
    public static int sumOdd(int start , int end){
        if(start < 0 || end < 0 || start > end) return -1;
        int sum = 0;
        for(int i = start ; i <= end ; i ++){
            sum += (isOdd(i))? i : 0;
        }
        return sum;
    }
    //palindrome Number challenge
    public static boolean isPalindrome(int number){
        if(number < 0) return isPalindrome(-1 * number);
        int revNumber = 0;
        int original = number;
        while(number > 0){
            revNumber = (revNumber * 10) + (number % 10);
            number /= 10;
        }
        return revNumber == original;
    }
    //firstAndLast challenge
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;
        int sum = 0;
        sum += number % 10;
        while(number >= 10){
            number /= 10;
        }
        sum += number;
        return sum;
    }//evenDigitSum
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum += (rem % 2 == 0)? rem : 0;
            number /= 10;
        }
        return sum;
    }
    //sharedDigit challenge
    public static boolean hasSharedDigit(int a , int b){
        if(a < 10 || b > 99 || a > 99 || b < 10) return false;
        int q = a % 10;
        int w = a / 10;
        int e = b % 10;
        int r = b / 10;
        return (q == e || q == r || w == e || w == r);
    }
    //lastDigitChecker challenge
    public static boolean hasSameLastDigit(int a , int b , int c){
        if(!(isValid(a) && isValid(b) && isValid(c))) return false;
        int q = a % 10;
        int w = b % 10;
        int e = c % 10;
        return(q == w || q == e || w == e);
    }
    public static boolean isValid (int a){
        return (a >= 10 && a <= 1000);
    }
    //printFactors challenge
    public static void printFactors(int number){
        if(number < 1) System.out.print("Invalid Value");
        for(int i = 1 ; i <= number ; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
    //G.C.D Challenge
    public static int getGreatestCommonDivisor(int a , int b){
        if(a < 10 || b < 10) return -1;
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    //Perfect Number
    public static boolean isPerfectNumber(int number){
        int sum = 1;
        for(int i = 2 ; i <= Math.sqrt(number); i++){ // i < Math.sqrt(number) also works as no perfect square
                                                        // is a perfect number
            if(number % i == 0) {
                sum += i;
                sum += (i == (number) / i)? 0 : (number) / i;
            }
        }
        return sum == number;
    }
    //NumberToWords
    public static void numberToWords(int number){
        if(number < 0) System.out.print("Invalid Value");
        if(number == 0){
            System.out.print("Zero");
            return;
        }
        int task = reverse(number);
        int diff = getDigitCount(number) - getDigitCount(task);
        while(task > 0){
            switch(task % 10){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                default -> System.out.println("Nine");
            }
            task /= 10;
        }
        if(getDigitCount(number) != getDigitCount(task)){
            for(int i = 0 ; i < (diff) ; i++){
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        if(number < 0) return -1 * reverse(-1 * number);
        int rev = 0;
        while(number > 0){
            rev = (rev * 10) + (number % 10);
            number /= 10;
        }
        return rev;
    }
    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number == 0) return 1;
        int c = 0;
        while(number > 0){
            c++;
            number /= 10;
        }
        return c;
    }
    //flourPackProblem challenge
    public static boolean canPack(int bigCount , int smallCount , int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if(goal / 5 > bigCount){
            if(goal - bigCount * 5 <= smallCount){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            if(goal % 5 <= smallCount){
                return true;
            }
            else {
                return false;

            }
        }
    }
    //getLargestPrime challenge
    public static int getLargestPrime(int number){
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;

        while (number % 2 == 0) { //Removing all the even factors
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) { //Removing all the odd factors
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number; //The number itself is the Largest Prime
        }

        return largestPrime;
    }
    //SquareStar challenge
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.print("Invalid Value");
            return;
        }
        for(int i = 0 ; i < number ; i++){
            for(int j = 0 ; j < number ; j++){
                if(i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || j == number - i - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}

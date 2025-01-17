package Day2;

public class Section5 {
    public  static void main(String[] args){
        double firstNumber = 80.0 , secondNumber = 20.0 , result;
        //result = (firstNumber + secondNumber) * 100; // Precedence is more for the parenthesis
        result = firstNumber + secondNumber * 100; //Here * has the highest precedence
        System.out.println(result); // 2080 for 7th line and 10000 for the 6th line
        boolean isRemainder = ((result % 1000) != 0)? true : false; //Ternary Operator
        // Here unlike Cpp the implicit conversion of the numbers into boolean won't happen so we need
        //to explicitly compare them

        if(isRemainder){
            System.out.println("There is a Remainder");
        }
        else{
            System.out.println("There is no Remainder");
        }

//        {
//            /*
//                Here is the block of code which is used to execute multiple lines of the code
//            */
//        }
//        if(condition); //This will end the if block and executes the next lines
    }
}

package Day2;

public class Switch {
    public static void main(String[] args) {
        String month = "January";
        System.out.println(Quarter(month));
    }
    public static String Quarter(String month){
        return switch (month){
            case "January" , "February" , "March" -> "1st"; //Same as {yield "1st";} and it should be inside
                                                            // the code block {} always;
            case "April" , "May" , "June" -> "2nd";
            case "July" , "August" , "September" -> "3rd";
            case "October" , "November" , "December" -> "4th";
            default -> "Bad Month";
        };
    }
    /*
        It uses Jump tables and Binary Search for optimization and if there are complex statements then if-else
        is more preferred and for the scenarios where we have a limited number of cases
     */
}

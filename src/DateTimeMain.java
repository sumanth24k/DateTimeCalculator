public class DateTimeMain {

    public static void main(String[] args){
        DateTimeCalculator calculator = new DateTimeCalculator();
        System.out.println("Duration between now and the given date");
        System.out.println(calculator.CalculateDuration("24-JUL-1998 5:40 PM"));

        System.out.println("Duration between two different date times");
        System.out.println(calculator.CompareTwoDates("24-JUL-1998 5:40 PM", "07-SEP-2000 12:40 AM"));
    }

}

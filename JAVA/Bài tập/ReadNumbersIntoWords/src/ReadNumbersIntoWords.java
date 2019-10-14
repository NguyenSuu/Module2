import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        int ones = number % 10;
        String result = "";
        switch (ones) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }


        String result1 = "";
        switch (number%100) {
            case 10:
                result1 = "ten";
                break;
            case 11:
                result1 = "eleven";
                break;
            case 12:
                result1 = "twelve";
                break;
            case 13:
                result1 = "thirteen";
                break;
            case 14:
                result1 = "fourteen";
                break;
            case 15:
                result1 = "fifteen";
                break;
            case 16:
                result1 = "sixteen";
                break;
            case 17:
                result1 = "seventeen";
                break;
            case 18:
                result1 = "eightteen";
                break;
            case 19:
                result1 = "nineteen";
                break;
        }


        String result2 = "";
        int tens = (number % 100) / 10;
        switch (tens) {
            case 2:
                result2 = " twelvety ";
                break;
            case 3:
                result2 = " thirty ";
                break;
            case 4:
                result2 = " forty ";
                break;
            case 5:
                result2 = " fifty ";
                break;
            case 6:
                result2 = " sixty ";
                break;
            case 7:
                result2 = " seventy ";
                break;
            case 8:
                result2 = " eightty ";
                break;
            case 9:
                result2 = " ninety ";
                break;
        }

        String result3="";
        int hund = number / 100;
        switch (hund) {
            case 1:
                result3 = "one ";
                break;
            case 2:
                result3 = "two ";
                break;
            case 3:
                result3 = "three ";
                break;
            case 4:
                result3 = "four ";
                break;
            case 5:
                result3 = "five ";
                break;
            case 6:
                result3 = "six ";
                break;
            case 7:
                result3 = "seven ";
                break;
            case 8:
                result3 = "eight ";
                break;
            case 9:
                result3 = "nine ";
                break;
        }
        if(number < 10){
            System.out.println(result);
        }else if(number <20){
            System.out.println(result1);
        }else if(number<100 && number%10==0){
            System.out.println(result2);
        }else if(number<100){
            System.out.println(result2+result);
        }else if(number%100==0){
            System.out.println(result3+ "hundred");
        }else if(number%10==0){
            System.out.println(result3+ "hundred and "+result2);
        }else if(number >100 && number <110){
            System.out.println(result3+"hundred and "+result);
        }else if(number >110 && number <120){
            System.out.println(result3+"hundred and "+result1);
        }else if(number >120){
            System.out.println(result3+"hundred and "+result2+result);
        }


    }


}

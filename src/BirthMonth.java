import java.util.Scanner;
public class BirthMonth {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int month;
        System.out.println("Enter your birth month as an integer (1-12)");

        if(in.hasNextInt()) {
            month = in.nextInt();
            if (month >= 1 && month <= 12) {

                System.out.println("So, your birth month is number "+month);
            }else{
                System.out.println("Seems like you entered "+month + ", which isn't a month integer.");
            }
        }else{
            System.out.println("You need to enter a number");
        }
    }
}

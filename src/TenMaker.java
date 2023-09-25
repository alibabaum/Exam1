import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Enter your first integer:");
        int integer1 = inScanner.nextInt();
        System.out.println("Enter your second integer:");
        int integer2 = inScanner.nextInt();

        if (sumNumbers(integer1, integer2) ==10){
            System.out.println("A perfect 10!");
        } else {
            System.out.println("Your chosen integers do not make 10.");
        }
    }
    public static int sumNumbers(int integer1, int integer2){
        return integer1+integer2;
    }

}

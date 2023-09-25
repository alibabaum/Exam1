import java.util.Scanner;
public class Summer {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int firstInt = inScanner.nextInt();
        System.out.println("What would you like to add:");
        int newInt = inScanner.nextInt();
        int fullSum= firstInt+newInt;
        System.out.println("Your sum is " + fullSum);

        while (newInt != 0){
            System.out.println("Enter an new integer.");
            newInt = inScanner.nextInt();
            fullSum = fullSum + newInt;
            System.out.println("You're new sum is: " + fullSum);
        } if (newInt == 0) {
            System.out.println("Your total sum is: " + fullSum);
        }
    }
}

import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Please select a beverage by typing the appropriate number:");
        System.out.println("1. Water");
        System.out.println("2. Coke");
        System.out.println("3. Coffee");

        int selection = inScanner.nextInt();

        if (selection == 1) {
            System.out.println("You have selected water.");
        } else if ( selection == 2) {
            System.out.println("You've selected coke.");
        } else if (selection == 3){
            System.out.println("You've selected coffee.");
        } else{
            System.out.println("You did not select a beverage we have. Goodbye.");
        }

    }
}

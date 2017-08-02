import java.util.ArrayList;
import java.util.Scanner;

public class TruckApp {


    public static void main(String[] args) {
        int menuNum;
        int quantity;
        String userAnswer = "";
        double grandTotal = 0.0;
        double itemSubTotal;
        double grandSubTotal = 0.0;
        double SALESTAX = 1.06;
        String paymentMethod;
        String ccNum;
        String expireDate;
        String cvvNum;
        int checkNum;
        ArrayList<Food> userChoices = new ArrayList<Food>(); //use to store user choices

        Scanner scan = new Scanner(System.in);
        MenuReader transferMenu = new MenuReader(); // object created to get menu from MenuReader class
        ArrayList<Food> finalMenuList = transferMenu.readFile("./MenuItems.txt"); //created new AL to store menu from MR class


        System.out.println();


        do {
            for (Food menuItem : finalMenuList){
                System.out.println(menuItem);
            }
            System.out.print("Please select a menu item from 1-20: ");
            menuNum = scan.nextInt();
            System.out.println(finalMenuList.get(menuNum - 1));
            System.out.print("How many of this item would you like?: ");
            quantity = scan.nextInt();
            itemSubTotal = quantity * (finalMenuList.get(menuNum - 1).getPrice());
            grandSubTotal += itemSubTotal;
            System.out.println(grandSubTotal);
            System.out.print("Would you like to order another item? Please enter 'yes' or 'no: ");
            scan.nextLine();
            userAnswer = scan.nextLine();

        } while (userAnswer.equalsIgnoreCase("Yes"));

        grandTotal = grandSubTotal * SALESTAX;
        System.out.println(grandTotal);

        System.out.println("What form of payment would you like to use: C=CASH, CC= CREDIT CARD, CHK= CHECK");
        paymentMethod = scan.nextLine();

        if (paymentMethod.equalsIgnoreCase("C")){
            System.out.println("How much cash are you tendering?: ");
            double amountTendered = scan.nextDouble();
            MoneyHandler.cashTrans(amountTendered,grandTotal);
        } else if (paymentMethod.equalsIgnoreCase("CC")){

        }


    }

}

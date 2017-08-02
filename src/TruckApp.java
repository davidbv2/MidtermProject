import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        double amountTendered;
        String ccNum;
        String expireDate;
        String cvvNum;
        boolean notValid = false;
        String checkNum;
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

        if (paymentMethod.equalsIgnoreCase("C")) {
            do {
                System.out.println("So.....how much money you got?: ");
                amountTendered = scan.nextDouble();
                if (amountTendered < grandTotal){
                    double owed = grandTotal - amountTendered;
                    System.out.println("Run me my money! You owe US! $" + owed);
                }
            } while (notValid == MoneyHandler.cashTrans(amountTendered, grandTotal));


            if (MoneyHandler.cashTrans(amountTendered,grandTotal) == true){
                double change = amountTendered - grandTotal;
                System.out.println("I guess we'll give you back $ " + change + " in change.");
            }

        } else if (paymentMethod.equalsIgnoreCase("CC")) {

            System.out.println("Helpful hint - if you do not enter the correct number of digits, you will be prompted to "
                    + "re-enter all your payment information. Count with your fingers, if necessary.");
            do {
                System.out.print("Please enter your 16 digit credit card number: ");
                ccNum = scan.nextLine();
                System.out.print("Please enter your 4 digit expiration date (xx/xx): ");
                expireDate = scan.nextLine();
                System.out.print("Please enter your 3 digit CVV number: ");
                cvvNum = scan.nextLine();

            } while (notValid == MoneyHandler.creditTrans(ccNum, expireDate, cvvNum));

            if (MoneyHandler.creditTrans(ccNum,expireDate,cvvNum) == true){
                System.out.println("Your transaction was not declined!");
            }
        } else if (paymentMethod.equalsIgnoreCase("CHK")){

            System.out.println("Helpful hint - if you do not enter a 4 digit check "
                    + "number, you will be prompted to re-enter your check number. Count with your toes, if necessary.");

            do {
                System.out.print("Please enter your 4 digit check number: ");
                checkNum = scan.nextLine();
            } while (notValid == MoneyHandler.checkTrans(checkNum));

            if (MoneyHandler.checkTrans(checkNum) == true){
                System.out.println("Your check didn't bounce!");
            }
        }


    }

}

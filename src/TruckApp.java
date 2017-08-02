import java.util.ArrayList;
import java.util.Scanner;

public class TruckApp {


    public static void main(String[] args) {
        int userWants;
        int menuNum;
        int quantity;
        double grandTotal;
        double itemSubTotal;
        double grandSubTotal;
        double SALESTAX;
        String paymentMethod;
        String ccNumber;
        String expDate;
        String CVV;
        int checkNum;
        ArrayList<Food> userChoices = new ArrayList<Food>(); //use to store user choices

        Scanner scan = new Scanner(System.in);
        MenuReader transferMenu = new MenuReader(); // object created to get menu from MenuReader class
        ArrayList<Food> finalMenuList = transferMenu.readFile("./MenuItems.txt"); //created new AL to store menu from MR class


        for (int i = 0; i < finalMenuList.size() ; i++) {
            System.out.println(finalMenuList.get(i));

        }

        System.out.println();

        System.out.print("How many items would you like?: ");
        userWants = scan.nextInt();

        for (int i = 0; i <= userWants ; i++) {
            System.out.print("Please select a menu item from 1-20: ");
            menuNum = scan.nextInt();
            System.out.println(finalMenuList.get(menuNum-1));
            System.out.print("How many of this item would you like?: ");
            quantity = scan.nextInt();
            itemSubTotal = 



        }

        System.out.println("Please select a menu item: 1-20 ");

        System.out.println("What form of payment would you like to use: C=CASH, CC= CREDIT CARD, CHK= CHECK");


    }

}

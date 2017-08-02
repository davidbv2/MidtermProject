public class MoneyHandler {


        public static double cashTrans(double amountTendered, double grandTotal, double change){
            amountTendered = 20.00;
            grandTotal = 15.00;
            change = amountTendered - grandTotal;

            System.out.println("Your change is: " + change);
            return  change;

        }
        public void creditTrans(String ccNum, String expireDate, String cvvNum){

            if (ccNum.length() != 16) {
                System.out.println("Invalid card number, please reenter your card number");
            }
            if (expireDate.length() != 5){
                System.out.println("Invalid expiration date, please reenter");
            }
            if (ccNum.length() != 3){
                System.out.println("Invalid CVV, please reenter the number");
            }


            else System.out.println("Payment Accepted");





        }




    }



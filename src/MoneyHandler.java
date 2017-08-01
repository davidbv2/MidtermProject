public class MoneyHandler {


        public static double cashTrans(double amountTendered, double grandTotal, double change){
            amountTendered = 20.00;
            grandTotal = 15.00;
            change = amountTendered - grandTotal;

            return  change;

        }
        public static String creditTrans(String ccNum, String expireDate, String cvvNum){

            if (ccNum.length() != 16 || expireDate.length() != 5 ||cvvNum.length() != 3)
                System.out.println("Invalid number");
            else System.out.println("Payment Accepted");

            return ccNum;

        }




    }



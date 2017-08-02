public class MoneyHandler {


        public static boolean cashTrans(double amountTendered, double grandTotal){

            if (amountTendered < grandTotal){
                return false;
            } else return true;

        }

        public static boolean creditTrans(String ccNum, String expireDate, String cvvNum) {

            if ((ccNum.length() != 16) || (expireDate.length() != 5) || (cvvNum.length() != 3)) {
                return false;
            } else return true;
        }

        public static boolean checkTrans (String checkNum){

            if ((checkNum.length() != 4)){
                return false;
            }else return true;

        }

//
//            if (ccNum.length() != 16) {
//                System.out.println("Invalid card number, please reenter your card number");
//            }
//            if (expireDate.length() != 5){
//                System.out.println("Invalid expiration date, please reenter");
//            }
//            if (ccNum.length() != 3){
//                System.out.println("Invalid CVV, please reenter the number");
//            }
//




    }



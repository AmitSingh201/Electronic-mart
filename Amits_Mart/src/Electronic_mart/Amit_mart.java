package Electronic_mart;

import java.net.CacheRequest;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class colour {
    public void co() {
        System.out.println(" Please choose colour ");
        System.out.println("----------------------");
        System.out.println("1 For red");
        System.out.println("2 For Black");
        System.out.println("3 For White");
        try {
        Scanner re1 = new Scanner(System.in);
        int Choose = re1.nextInt();
        switch (Choose) {

            case 1:
                System.out.println("Great chooice 😀");
                System.out.println("press 1 to see the product");
                return;

            case 2:
                System.out.println("Excellent chooice 😀");
                System.out.println("press 2 to see the product");
                return;

            case 3:
                System.out.println("Great chooice 😀");
                System.out.println("press 3 to see the product");
                return;

            default:
                System.err.println("Enter the valid No");
                this.co();
                break;

        }
        }catch (Exception e) {
			// TODO: handle exception
        	 System.out.println("OOPs you have Enterd invalid input");
             this.co();
		}
    }
    
}

class Customer_details extends colour {

    private String Name;
    private String Mail;
    private String Mob_no;

    Customer_details(String name, String email, String phone) {
        this.Name = name;
        this.Mail = email;
        this.Mob_no = phone;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {

        this.Name = name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        this.Mail = mail;
    }

    public String getMob_no() {
        return Mob_no;
    }

    public void setMob_no(String mob_no) {
        this.Mob_no = mob_no;
    }

    // Constructor

}
interface hide3{
	void rockgame();
}

class Game {
    public void rockgame() {
        Scanner choose = new Scanner(System.in);
        System.out.println();
        System.out.println("you will get 3 chance");
        System.out.println();
        System.out.println("Enter your move by using r, p, s.if you want to exit the game use E");
        
        // quit statement
        int count = 0;
        int won = 0;
        int losses = 0;
       
        	 
            while (count!=3) {
            	
                String myMove = choose.nextLine();
                System.out.println("yourMove:" + myMove);
                if (myMove.equals("E")) {
                    break;
                }

                // write our move
                if (!myMove.equals("r") && !myMove.equals("p") && !myMove.equals("s")) {
                    System.out.println("your move isn't correct🤬🤬");
                } else {

                    // genrate random number (0,1,2) in 3 nunber

                    int rand = (int) (Math.random() * 3);
                    String oppenentMove = " ";
                    if (rand == 0) {
                        oppenentMove = "rock";
                    } else if (rand == 1) {
                        oppenentMove = "paper";
                    } else {
                        oppenentMove = "scissor";
                    }

                    System.out.println("OppnentMove:" + oppenentMove);

                    if (myMove.equals(oppenentMove)) {
                        System.out.println("Match Draw");

                    } else if ((myMove.equals("r") && oppenentMove.equals("scissor"))
                            || (myMove.equals("p") && oppenentMove.equals("rock"))
                            || (myMove.equals("s") && oppenentMove.equals("paper"))) {
                        System.out.println("You win 🤑🤑");
                        won++;

                    }

                    else {
                        System.out.println("you have lost the game🤮🤮🤮");
                        losses++;
                    }
                }
                count++;
            }
        

            if (won > losses) {
                System.out.println("you have won " + won + " game than losse " + losses + ":)");
            } else if (won < losses) {
                System.out.println("you have losse " + losses + " game than won " + won + ":(");
            } else {
                System.out.println("you have losse " + losses + " and won " + won + " equal games");
            }
            System.out.println("Thanks for playing :)");
            System.out.println("-----------------------------------------------");

        
    }
}

interface hide {

    void Allitem();
}

///////////////////////////////////////////////// FAN
///////////////////////////////////////////////// COLECTION//////////////////////////////////////////////////////////////////////////////
// this is the Fan class
class Fan extends colour implements hide {

    public void UPI() {
        System.out.println();
        System.out.println("*** ENTER YOUR DETAILS ***");
        System.out.println();
        System.out.println("enter your name  ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("enter your phone ");
        String phone = scan.nextLine();
        System.out.println("enter your email [don't write @gmail.com]");
        String email = scan.nextLine();
        System.out.println("enter your UPI ");
        String UPI = scan.nextLine();
        System.out.println();
        System.out.println("thnx for entering the your details");
        System.out.println();
        System.out.println("while system generating your bill, do you want to play one simple and FUN game");
        System.out.println();
        System.out.println("if yes press 1 else press 2 to get your bill");

        Scanner n1 = new Scanner(System.in);
        int choose = n1.nextInt();
        switch (choose) {
            case 1:
                System.out.println("============================");
                System.out.println("Here we go, game is rock, paper, scissor");
                System.out.println();
                System.out.println("For rock write r and for paper write p and for Scissor write S");
                System.out.println();
                System.out.println("**ALL SET, WISH YOU VERY LUCK**");
                Game ref = new Game();
                ref.rockgame();
                break;
            case 2:
                Customer_details detail = new Customer_details(name, email, phone);
                System.out.println("Name:  " + detail.getName());
                System.out.println("Email: " + detail.getMail() + "@gmail.com");
                System.out.println("Phone: " + detail.getMob_no());

                System.out.println("paid Amt including GST & TAX : 10000");
                System.out.println("***************************THANKS FOR SHOPPING*********************************");
                break;
            default:
                System.err.println("You have enter invaild input 🤬🤬 ");
                UPI();
                break;
        }
        if (choose != 1 || choose != 2) {
            System.out.println("***===Here your Bill===***");
            Customer_details detail = new Customer_details(name, email, phone);
            System.out.println("Name:  " + detail.getName());
            System.out.println("Email: " + detail.getMail() + "@gmail.com");
            System.out.println("Phone: " + detail.getMob_no());
            System.out.println("paid Amt including GST & TAX : 10000");
            System.out.println();
            System.out.println("***************************THANKS FOR SHOPPING*********************************");
            System.out.println();
        }

        // System.out.println("total paid");

    }

    public void cash() {

    }

    // this contain all the detail of product of fan
    public void Allitem() {
        try {
            System.out.println("====***====");
            System.out.println("1 For Bajaj");
            System.out.println("2 For Usha");
            System.out.println("=============");
            Scanner secound = new Scanner(System.in);
            int choose = secound.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Wellcome to Bajaj");
                    Fan re1 = new Fan();
                    re1.Bajaj_Table();
                    break;
                case 2:
                    System.out.println("Wellcome to Usha");
                    this.Usha();
                    break;

                default:
                    System.err.println("please enter vaild No");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // This is the bajaj Brand
    public void Bajaj_Table() {

        System.out.println("=============");
        System.out.println("1 For Table Fan");
        System.out.println("2 For Wall Mount Fan");
        System.out.println("3 For Exhaust Fans");
        System.out.println("4 For Celling Fan");
        try {
            Scanner input3 = new Scanner(System.in);
            int choose = input3.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("You have selected Table Fan");
                    System.out.println();
                    // Fan re5=new Fan();
                    this.Bajaj_table();
                    break;
                case 2:
                    System.out.println("You have selected Wall Mount Fan");
                    System.out.println();
                    this.Bajaj_Wall();
                    break;

                case 3:
                    System.out.println("You have selected Exhaust Fan");
                    System.out.println();
                    this.Bajaj_Exhaust();
                    break;

                case 4:
                    System.out.println("You have selected Celling Fan");
                    this.Bajaj_Celling();
                    break;

                default:
                    System.err.println("Please enter valid No");
                    this.Bajaj_Table();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Bajaj_Table();
        }

    }

    // this is bajaj_table
    public void Bajaj_table() {
        int price = 2499;
        /*
         * System.out.println("........................");
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        // Fan r1=new Fan();

        try {
            Scanner input4 = new Scanner(System.in);
            this.co();
            int choose = input4.nextInt();
            switch (choose) {
                case 1:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Table Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 2:
                    price = 3000;
                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Table Fan (White)");
                    System.out.println("Sweep :     4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :  2 years on product");
                    System.out.println("Price:" + price);

                    this.billing();
                    break;
                case 3:
                    price = 4000;
                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Table Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    break;
                default:
                    System.err.println("please Enter valid No");

                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void Bajaj_Wall() {
        int price = 4999;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        try {
            Scanner input4 = new Scanner(System.in);
            this.co();
            int choose = input4.nextInt();
            switch (choose) {
                case 1:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Wall Fan (Red)");
                    System.out.println("Sweep :       4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :  2 years on product");
                    System.out.println("Price:      " + price);

                    this.billing();
                    break;
                case 2:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Wall Fan (White)");
                    System.out.println("Sweep :        4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out.println(
                            "High Speed :    Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :     2 years on product");
                    System.out.println("Price:" + price);

                    this.billing();
                    break;
                case 3:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Wall Fan (Black)");
                    System.out.println("Sweep :     4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :  2 years on product");
                    System.out.println("Price:" + price);
                    System.out.println("------------------------------------------");
                    this.billing();
                    break;

                default:
                    System.err.println("Please enter valid No");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void Bajaj_Exhaust() {
        int price = 1109;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        this.co();
        try {
            Scanner input4 = new Scanner(System.in);
            int choose = input4.nextInt();
            switch (choose) {
                case 1:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Exhaust Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    System.out.println("------------------------------------------");
                    System.out.println("=>Bajaj TF Table Fan(RED)");
                    System.out.println("RPM:1350");
                    System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300 (Toll Free)");
                    this.billing();
                    break;
                case 2:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Exhaust Fan (White)");
                    System.out.println("Sweep :     4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:     " + price);
                    System.out.println("------------------------------------------");
                    System.out.println("=>Bajaj TF Table Fan(Black)");
                    System.out.println("RPM:     1350");
                    System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300 (Toll Free)");
                    price = 2000;
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 3:

                    System.err.println("--------------------------");
                    System.out.println("Bajaj Midea BT 07 400mm Exhaust Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    // System.err.println("------------------------------------------");
                    // System.out.println("Bajaj TF Table Fan(Black)");
                    // System.out.println("RPM:1350");
                    // System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300
                    // (Toll Free)");
                    // price=3000;
                    // System.out.println("Price:"+price);
                    this.billing();
                    break;
                default:
                    System.err.println("Please enter valid No");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
        }
    }

    public void Bajaj_Celling() {
        int price = 2999;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        try {
            Scanner input4 = new Scanner(System.in);
            this.co();
            int choose = input4.nextInt();
            switch (choose) {
                case 1:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Exhaust Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    // System.out.println("------------------------------------------");
                    // System.out.println("=>Bajaj TF Table Fan(RED)");
                    // System.out.println("RPM:1350");
                    // System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300
                    // (Toll Free)");
                    this.billing();
                    break;
                case 2:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Exhaust Fan (White)");
                    System.out.println("Sweep :     4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :  2 years on product");
                    System.out.println("Price:" + price);
                    // System.out.println("------------------------------------------");
                    // System.out.println("=>Bajaj TF Table Fan(Black)");
                    // System.out.println("RPM: 1350");
                    // System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300
                    // (Toll Free)");
                    // price=5999;
                    // System.out.println("Price:" +price);
                    this.billing();
                    break;
                case 3:

                    System.err.println("--------------------------");
                    System.out.println("=>Bajaj Midea BT 07 400mm Exhaust Fan (Black)");
                    System.out.println("Sweep :     4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty :   2 years on product");
                    System.out.println("Price:" + price);
                    // System.out.println("------------------------------------------");
                    // System.out.println("=>Bajaj TF Table Fan(Black)");
                    // System.out.println("RPM: 1350");
                    // System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300
                    // (Toll Free)");
                    // price=7000;
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                default:
                    System.err.println("Please enter valid No");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }

    }

    // payment start from here
    public void payment() {
        System.out.println("1 For UPI");
        System.out.println("2 For Debit Card");
        System.out.println("3 For Credit Card");
        System.out.println("4 For Cash on Delivery");
        try {
            Scanner use = new Scanner(System.in);

            // String call=use.nextLine();
            int choose = use.nextInt();
            switch (choose) {
                case 1:
                    UPI();

                    break;
                case 2:
                    UPI();
                    break;
                case 3:
                    UPI();
                    break;
                case 4:
                    UPI();
                    break;

                default:
                    System.err.println("Please enter vaild No");
                    this.UPI();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.payment();
        }

    }

    public void billing() {
        System.out.println("===============================");
        System.out.println("Do you want to Continue Payment ");
        System.out.println("---------------------------");
        System.out.println("1 For Yes");
        System.out.println("2 For Return to main Menu");
        try {
            Scanner re2 = new Scanner(System.in);
            int choose = re2.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Payment option");
                    this.payment();
                    break;
                case 2:
                    this.Allitem();
                    break;

                default:
                    System.err.println("Please enter valid No");
                    this.billing();// rollback
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.billing();
        }

    }

    ////////////////////////////////////////////////////// USHA
    ////////////////////////////////////////////////////// COLLECTION//////////////////////////////////////////////////////////////////
    // this is the Usha table
    public void Usha() {
        System.out.println("=============");
        System.out.println("1 For Table Fan");
        System.out.println("2 For Wall Mount Fan");
        System.out.println("3 For Exhaust Fans");
        System.out.println("4 For Celling Fan");
        System.out.println("enter the value for Usha brand name");
        try {
            Scanner input3 = new Scanner(System.in);
            int choose = input3.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("You have selected Table Fan");
                    // Fan re5=new Fan();
                    this.Usha_table();
                    break;
                case 2:
                    System.out.println("You have selected Wall Mount Fan");

                    this.Usha_Wall();
                    break;

                case 3:
                    System.out.println("You have selected Exhaust Fan");
                    this.Usha_Exhaust();
                    break;

                case 4:
                    System.out.println("You have selected Celling Fan");
                    this.Usha_Celling();
                    break;

                default:
                    System.err.println("Please enter valid No❎❎❎");
                    System.out.println("Select one of the given options ");
                    this.Usha();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
        }
    }

    public void Usha_table() {
        int price = 2499;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        try {
            Scanner input4 = new Scanner(System.in);
            this.co();
            int choose = input4.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Table Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 2:
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Table Fan (White)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 3:
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Table Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;

                default:
                    System.err.println("Please enter valid No❎❎❎");
                    System.out.println("Select one of the given options ");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
        }
    }

    public void Usha_Wall() {
        int price = 4999;
        System.out.println("........................");
        try {
            Scanner input5 = new Scanner(System.in);
            this.co();
            int choose = input5.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Wall Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 2:
                    price = 5999;
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Wall Fan (White)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);

                    this.billing();
                    break;
                case 3:
                    price = 6999;
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Wall Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    // System.err.println("------------------------------------------");
                    // System.out.println("Usha TF Table Fan(Black)");
                    // System.out.println("RPM:1350");
                    // System.out.println("2 YEAR WARRANTY & PAN-INDIA SERVICE NETWORK 1800-103-1300
                    // (Toll Free)");
                    // price=3000;
                    // System.out.println("Price:"+price);
                    this.billing();
                    break;

                default:
                    System.err.println("Please enter valid No ❎");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
        }
    }

    public void Usha_Exhaust() {

        int price = 1109;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        this.co();
        try {
            Scanner input4 = new Scanner(System.in);
            int choose = input4.nextInt();
            switch (choose) {
                case 1:

                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 2:
                    price = 2000;
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (White)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 3:

                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                default:
                    System.err.println("Please enter valid No ❎");
                    ;
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
            ;
        }
    }

    public void Usha_Celling() {
        int price = 2999;
        System.out.println("........................");
        /*
         * System.out.println("1 for Red");
         * System.out.println("2 for White");
         * System.out.println("3 for Black");
         */
        try {
            Scanner input4 = new Scanner(System.in);
            this.co();
            int choose = input4.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (Red)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                case 2:
                    price = 10000;
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (White)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);

                    this.billing();
                    break;
                case 3:
                    price = 7000;
                    System.out.println("Great chooise 😀");
                    System.err.println("--------------------------");
                    System.out.println("Usha Midea BT 07 400mm Exhaust Fan (Black)");
                    System.out.println("Sweep : 4mm, Power : 55W, Air Delivery : 75CMM, RPM: 13");
                    System.out
                            .println("High Speed : Provides high RPM, Product dimensions (LxBxH)cm - 46 x 2.5 x 51.5");
                    System.out.println("Warranty : 2 years on product");
                    System.out.println("Price:" + price);
                    this.billing();
                    break;
                default:
                    System.err.println("Please enter valid No ❎");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Usha();
        }
    }
}
//////////////////////////////////////////////////////////////// TV
//////////////////////////////////////////////////////////////// SECTION//////////////////////////////////////////////////////////////////////////

interface hide2 {
    void price();
}

class amt extends Fan {
    public int price(int total) {
        return total;
    }

}

// this is the Tv class
class Tv extends amt {

    public void Allitem() {
        System.out.println("====***====");
        System.out.println("1 For SAMSUNG");
        System.out.println("2 For SONY");
        System.out.println("=============");
        try {
            Scanner secound = new Scanner(System.in);
            int choose = secound.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Wellcome to SAMSUNG");
                    this.samsung_display();
                    ;
                    break;
                case 2:
                    System.out.println("Wellcome to SONY");
                    this.Sony_dispaly();
                    break;
                default:
                    System.err.println("please enter vaild No");
                    this.Allitem();// rollBack
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }

    }

    public void samsung_display() {
        System.out.println("=============");

        System.out.println("1 For LCD DISPLAY");
        System.out.println("2 For AMOLED DISPLAY");
        System.out.println("Select one of the given options ");
        System.out.println();
        try {
            Scanner input3 = new Scanner(System.in);
            int choose = input3.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("You have selected LCD DISPLAY");
                    // Fan re5=new Fan();
                    this.LCD();
                    break;
                case 2:
                    System.out.println("You have selected AMOLED DISPLAY");
                    this.Amoled();
                    break;

                default:
                    System.err.println("Please enter valid No❎❎❎");
                    this.samsung_display();// rollBack
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.samsung_display();
        }
    }

    public void LCD() {
        System.out.println("-------------------------------");
        System.out.println("1 For 32 inch");
        System.out.println("2 For 64 inch");
        System.out.println(" press 3 for menu");
        amt re3 = new Tv();
        try {
            Scanner tv2Scanner = new Scanner(System.in);

            int choose = tv2Scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("SAMSUNG Series 4 80 cm (32 inch) HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: LCD HD Ready, 1366 x 768 pixels, 60 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + re3.price(16000));
                    this.billing();

                    break;
                case 2:
                    System.out.println("SAMSUNG Series 4 160 cm (64 inch) Full HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: LCD HD Ready, 1366 x 768 pixels, 90 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + re3.price(30000));
                    this.billing();
                    break;
                case 3:
                    Allitem();
                    break;
                default:
                    System.err.println("please enter valid NO");
                    this.LCD();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void Amoled() {
        System.out.println("-------------------------------");
        System.out.println("1 For 32 inch");
        System.out.println("2 For 64 inch");
        System.out.println(" press 3 for menu");
        try {
            Scanner tv2Scanner = new Scanner(System.in);

            int choose = tv2Scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("SAMSUNG Series 4 80 cm (32 inch) HD Ready  ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: AMOLED HD Ready, 1366 x 768 pixels, 90 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + this.price(35000));
                    this.billing();
                    break;
                case 2:
                    System.out.println("SAMSUNG Series 4 160 cm (64 inch) Full HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: AMOLED HD Ready, 1366 x 768 pixels, 120 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + this.price(51999));
                    this.billing();
                    break;
                case 3:
                    Allitem();
                    break;
                default:
                    System.err.println("please enter valid NO");
                    this.LCD();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void Sony_dispaly() {

        System.out.println("=============");

        System.out.println("1 For LCD DISPLAY");
        System.out.println("2 For AMOLED DISPLAY");
        System.out.println("Select one of the given options ");
        System.out.println();
        // try block
        try {
            Scanner input4 = new Scanner(System.in);
            int choose = input4.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("You have selected LCD DISPLAY");
                    // Fan re5=new Fan();
                    this.LCD_2();
                    break;
                case 2:
                    System.out.println("You have selected AMOLED DISPLAY");
                    this.AMOLED_2();
                    break;

                default:
                    System.err.println("Please enter valid No❎❎❎");
                    this.Sony_dispaly();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void LCD_2() {
        System.out.println("-------------------------------");
        System.out.println("1 For 32 inch");
        System.out.println("2 For 64 inch");
        System.out.println(" press 3 for menu");
        amt re3 = new Tv();
        // try block
        try {
            Scanner tv2Scanner = new Scanner(System.in);
            int choose = tv2Scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("SONY Series 5 80 cm (32 inch) HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: LCD HD Ready, 1366 x 768 pixels, 60 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + re3.price(30000));
                    this.billing();
                    break;
                case 2:
                    System.out.println("SONY Series 5 160 cm (64 inch) Full HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: LCD HD Ready, 1366 x 768 pixels, 90 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + re3.price(45000));
                    this.billing();
                    break;
                case 3:
                    Allitem();
                    break;
                default:
                    System.err.println("please enter valid NO");
                    this.LCD_2();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }

    public void AMOLED_2() {
        System.out.println("-------------------------------");
        System.out.println("1 For 32 inch");
        System.out.println("2 For 64 inch");
        System.out.println(" press 3 for menu");
        try {
            Scanner tv2Scanner = new Scanner(System.in);

            int choose = tv2Scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("SONY Series 7 80 cm (32 inch) HD Ready  ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: AMOLED HD Ready, 1366 x 768 pixels, 90 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + this.price(45999));
                    this.billing();
                    break;
                case 2:
                    System.out.println("SONY Series 8 160 cm (64 inch) Full HD Ready ");
                    System.out.println("Connectivity: 2 HDMI | 1 USB | Wi-Fi");
                    System.out.println("Display: AMOLED HD Ready, 1366 x 768 pixels, 120 Hz Refresh Rate");
                    System.out.println("SMART TV");
                    System.out.println("Price: " + this.price(59999));
                    this.billing();
                    break;
                case 3:
                    Allitem();
                    break;
                default:
                    System.err.println("please enter valid NO");
                    this.LCD();
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            this.Allitem();
        }
    }
}

class AC {
    public void Allitem() {
        try {
            System.err.println("WORKING IN PROGRESS");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception handled");
        }

    }
}

// All types in here

// Driver class
public class Amit_mart {
    static {
        System.out.println("Welcome to my mart");
        System.out.println();
        System.out.println("Here all the product");
        System.out.println("1 For Fan");
        System.out.println("2 For TV");
        System.out.println("3 For AC");
        System.out.println();

    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value");
            int choose = input.nextInt();

            do {

                switch (choose) {
                    case 1:
                        System.out.println("Welcome to Fan Collection.");
                        Fan ref1 = new Fan();
                        ref1.Allitem();
                        break;
                    case 2:
                        System.out.println("Welcome to TV Collection.");
                        Tv ref2 = new Tv();
                        ref2.Allitem();
                        break;
                    case 3:
                        System.out.println("Welcome to Washing Machine Collection");
                        AC ref3 = new AC();
                        ref3.Allitem();
                        break;
                    default:
                        System.err.println("Enter valid No");// rollBack
                        main(args);
                        break;
                }

            } while (choose == 3);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPs you have Enterd invalid input");
            main(args);
        }
    }

}


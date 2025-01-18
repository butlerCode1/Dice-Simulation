import java.text.DecimalFormat;
import java.util.Scanner;

public class week1_srb349_Lab1 {
        public static void main(String args[]) {

                int friends;
                double bill;
                double tax = .07;
                double tipPerc = .20;
                double divAmt;

                System.out.println("Hello, welcome to Bill Splitting Program, where I will assist you in\n"
                                                + "Splitting your bill evenly among you and your pals! First, I will ask\n"
                                                + "you a few questions if you don't mind. Once all of my questions are\n"
                                                + "answered I will be able to provide you with the exact amount each pal\n"
                                                + "must pay.");

                Scanner key = new Scanner(System.in);
                System.out.print("First, what is the total of your bill before tax? ");
                bill = key.nextDouble();

                if (bill <= 100) {
                System.out.println("Wow! Great deal!");
                } else if (bill > 100 && bill <= 300) {
                        System.out.println("Okay, decent price considering we are splitting even.");
                } else {
                        System.out.println("Ooowee thats a hefty one. Lets get this sorted out!");
                }

                System.out.println("Second, How many people are attending including yourself?:");
                friends = key.nextInt();

                if (friends <=3 ) {
                        System.out.println("Tight circle! You all must be close.");
                } else {
                        System.out.println("Wow! Somebody is popular!");
                }

                bill = bill * tax + bill;

                double grandTotal = bill * tipPerc + bill;
                grandTotal = Double.parseDouble(new DecimalFormat("##.##").format(grandTotal));
                divAmt = grandTotal / friends;
                divAmt = Double.parseDouble(new DecimalFormat("##.###").format(grandTotal));

                System.out.println("Your final total is: " + "$" + grandTotal + " and therefore all "
                                                 + friends + " people should pay " + "$ " + divAmt);
                // System.out.println("The amount that you all should contribute evenly is: " + "$" + divAmt);

                // System.out.println(bill);

        }
}
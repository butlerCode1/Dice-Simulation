import java.util.Scanner;
import java.util.Random;

/*
 * I was having problems using the math class because my two dice were doubles
 * and the arguments entered in the exact methods of the math class require doubles
 * therefore I created my own methods from the diceSimulation class that would be able to grant 
 * the output needed to complete the assignment
 * 
 */

public class diceSimulation {

        public static double combineDice(double d1, double d2) {
                return d1 + d2;
        }
        public static double subDice(double d1, double d2) {
                double sub;
                if (d1 > d2) {
                        sub = d1 - d2;
                } else {
                        sub = d2 -d1;
                }
                return sub;
        }
        public static double prodDice(double d1, double d2) {
                return d1 * d2;
        }
        public static double divDice(double d1, double d2) {
                int quotient = (int) Math.floor(d1 % d2) ;
                return quotient;
        }

        public static double raisedDice(double d1, double d2) {
                return Math.pow(d1, d2);
        }
        
        public static void main(String args[]) {

                Scanner key = new Scanner(System.in);

                Random random = new Random();

                boolean input = true;
                String Queue;
                // diceSimulation d1 = new diceSimulation();     
                // diceSimulation d2 = new diceSimulation(); 
                double min = 1;
                double max = 10;
                double d1;
                double d2;        

                while (input = true) {
                        System.out.println("Hello welcome to the Dice Simulation game \n would you like to begin? Y for yes N for no:");
                        Queue = key.nextLine();
                        if (Queue.equalsIgnoreCase("y")) {
                        d1 = Math.floor(min + (random.nextDouble() * (max - min) + 1)); 
                        d2 = Math.floor(min + (random.nextDouble() * (max - min) + 1));
                        System.out.println(" Die 1 rolled a " + d1 + "\n Die 2 rolled a " + d2);

                        //Sum
                        double dice = diceSimulation.combineDice(d1, d2);
                        System.out.println(dice);

                        //Diference
                        dice = diceSimulation.subDice(d1, d2);
                        System.out.println(dice);

                        //Product
                        dice = diceSimulation.prodDice(d1, d2);
                        System.out.println(dice);

                        //Quotient
                        dice = diceSimulation.divDice(d1, d2);
                        System.out.println(dice);

                        //Raised to the power
                        dice = diceSimulation.raisedDice(d1, d2);
                        System.out.println(dice);

                        } else { 
                       break;
                        }
                } 




        }

}

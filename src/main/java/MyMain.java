import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a decimal between 0.0 and 1000000.0: ");
        double user_input = scan.nextDouble();
        while (user_input > 1000000.0 || user_input < 0.0) {
            System.out.println("Please enter a valid input");
            user_input = scan.nextDouble();
            return user_input;
        }

        return user_input;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int quarters = 0;
        while (money - .25 >= 0){
            money = money - .25;
            quarters++;
        }

        return quarters;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int dimes = 0;
        while (money - .10 >= 0){
            money = money - .10;
            dimes++;
        }

        return dimes;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        int nickels = 0;
        while (money - .05 >= 0){
            money = money - .05;
            nickels++;
        }

        return nickels;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        int pennies = 0;
        while (money - .01 >= 0){
            money = money - .01;
            pennies++;
        }

        return pennies;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();

        // Some code to test numQuarters
//        System.out.println("\nnumQuarters tests:");
        System.out.println("$" + d + " in quarters would be: " + numQuarters(d) + " quarters.");
        System.out.println("$" + d + " in dimes would be: " + numDimes(d) + " dimes.");
        System.out.println("$" + d + " in nickels would be: " + numNickels(d) + " nickels.");
        System.out.println("$" + d + " in pennies would be: " + numPennies(d) + " pennies.");

//        // Some code to test numDimes
//        System.out.println("\nnumDimes tests:");
//        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
//        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
//        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502


        scan.close();
    }
}
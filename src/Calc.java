import java.util.Scanner;
public class Calc {
    public static void main() throws InterruptedException {
        boolean validCalc = false;
        while(!validCalc) {
            int calcChoice;
            System.out.println("Please choose between 1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Divide evenly with remainder");
            try {
                Scanner calcInput = new Scanner(System.in);
                calcChoice = calcInput.nextInt();
            }
            catch(Exception e) {
                System.out.println("Please enter a valid integer for a choice");
                Thread.sleep(2000);
                continue;
            }
            if(calcChoice == 1) {
                add();
                validCalc = true;
            }
        }
    }
    private static void add() throws InterruptedException {
        boolean validNums = false;
        while(!validNums) {
            try {
                Scanner numberInput = new Scanner(System.in);
                System.out.print("Enter your first number: ");
                Long num1 = numberInput.nextLong();
                System.out.print("\nEnter your second number: ");
                Long num2 = numberInput.nextLong();
                if ((num1 + num2) <= num1 || (num1 + num2) <= num2) {
                    System.out.println("Please enter a number that doesn't overflow");
                    Thread.sleep(2000);
                    continue;
                }
                System.out.printf("Your numbers added together are %d", (num1 + num2));
                validNums = true;
            }
            catch(Exception e) {
                System.out.println("Please enter values of the long data type, values over this will not be accepted");
                Thread.sleep(2000);
            }
        }
    }
}

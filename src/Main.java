import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean validChoice = false;
        //Fib fib = new Fib();
        int programChoice = 0;
        while (!validChoice) {
            System.out.println("Please enter a choice between\n1) Fibonnaci\n2) Calculator\n");
            Scanner programInput = new Scanner(System.in);
            try {
                programChoice = programInput.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a valid integer to choose an option");
                Thread.sleep(2000);
            }
            if (programChoice == 1) {
                Fib.main();
                validChoice = true;
            }
            if(programChoice == 2) {
                Calc.main();
                validChoice = true;
            }
            else {
                System.out.println("You have used an integer but have not selected an available choice");
                Thread.sleep(2000);
            }
        }
    }
}

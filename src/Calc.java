import java.util.Scanner;


public class Calc {
    public static void main() throws InterruptedException {
        long num1 = 0, num2 = 0;
        boolean validCalc = false, validNums = false;
        while (!validCalc) {
            int calcChoice;
            System.out.println("""
                    Please choose between
                    1) Add
                    2) Subtract
                    3) Multiply
                    4) Divide
                    5) Divide evenly with remainder""");
            try {
                Scanner calcInput = new Scanner(System.in);
                calcChoice = calcInput.nextInt();
                try {
                    Scanner numberInput = new Scanner(System.in);
                    System.out.print("Please enter your first number: ");
                    num1 = numberInput.nextLong();
                    System.out.print("Please enter your second number: ");
                    num2 = numberInput.nextLong();
                } catch (Exception e) {
                    System.out.println("Please enter values of the long data type, values over this will" +
                            "not be accepted!");
                    Thread.sleep(2000);
                }
                

                switch (calcChoice) {
                    case 1 -> add(num1, num2);
                    case 2 -> sub(num1, num2);
                    case 3 -> mult(num1, num2);
                    case 4 -> div(num1, num2);
                    case 5 -> divLong(num1, num2);
                }
                validCalc = true;
            }
            catch(Exception e) {
                if (e instanceof ArithmeticException) {
                    System.out.println("An overflow, underflow, or other Arithmetic exception has been thrown," +
                            " please ensure this calculation is valid using the long data type\n");
                    Thread.sleep(2000);
                } else {
                    System.out.println("Please enter a valid integer for a choice");
                    Thread.sleep(2000);
                }
            }
        }
    }


    private static void add(long num1, long num2) throws InterruptedException {
        boolean validSum = false;
        while (!validSum) {
            try {
                System.out.printf("Your numbers added together are %s", (Math.addExact(num1, num2)));
                validSum = true;
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    throw e;
                } else {
                    System.out.printf("An error has been encountered:\n%s\n", e);
                    Thread.sleep(2000);
                    break;
                }
            }
        }
    }

    private static void sub(long num1, long num2) throws InterruptedException {
        boolean validSum = false;
        while (!validSum) {
            try {
                System.out.printf("Your numbers subtracted from one another (number 1 - number 2) are %s", +
                        Math.subtractExact(num1, num2));
                validSum = true;
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    throw e;
                } else {
                    System.out.printf("An error has been encountered:\n%s\n", e);
                    Thread.sleep(2000);
                    break;
                }
            }
        }
    }

    private static void mult(long num1, long num2) throws InterruptedException {
        boolean validSum = false;
        while (!validSum) {
            try {
                System.out.printf("Your numbers multiplied together are %s", Math.multiplyExact(num1, num2));
                validSum = true;
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    throw e;
                }
                System.out.printf("An error has been encountered:\n%s\n", e);
                Thread.sleep(2000);
                break;
            }
        }
    }


    private static void div(long num1, long num2) throws InterruptedException {
        try {
            System.out.printf("Your numbers divided by each other (number 1 / number 2) are %s", ((double) num1 / num2));
        }
        catch (Exception e) {
            System.out.printf("An error has been encountered:\n%s\n", e);
            Thread.sleep(2000);
        }
    }

    private static void divLong(long num1, long num2) throws InterruptedException, ArithmeticException {
        boolean validSum = false;
        while (!validSum) {
            try {
                if (num1 == Long.MIN_VALUE) {
                    throw new ArithmeticException("Overflow due to MIN_VALUE/1 being > MAX_VALUE");
                }
                System.out.printf("Your numbers divided by each other (number 1 / number 2) are %s r%s", (num1 / num2), (num1 % num2));
                validSum = true;
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    throw e;
                } else {
                    System.out.printf("An error has been encountered:\n%s\n", e);
                    Thread.sleep(2000);
                    break;
                }
            }
        }
    }
}


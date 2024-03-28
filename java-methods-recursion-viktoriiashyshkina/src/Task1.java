import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();
        scanner.close();
        int factorial = Values.calculateFactorial(number);
        System.out.println("The result is: "+ number + "!=" + factorial);

    }

}



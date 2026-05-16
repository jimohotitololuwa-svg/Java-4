import java.util.*;


public class Main{
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println("The value is: " + i);
        }
    // while loop 
        int j = 0;
        while (j < 11){
            System.out.println("The value is: " + j);
            j++;
        }

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter you lucky Number: ");
        int luckyNumber = sc.nextInt();
        System.out.println("Hello " + name + " Your lucky number is: " + luckyNumber);
    }

}
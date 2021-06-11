import java.util.Scanner;

//CHALLENGE: https://edabit.com/challenge/E9AHcnWg7fDfardLF
public class Main {

    public static boolean almostPalindrome(String str) {
        int holder = 0;

        for (int i = 0; i < str.length() / 2; i++) {                        //splitting the string size and see if one side equals to the other (numeric value)

            if (str.charAt(i) != str.charAt(str.length() - 1 - i))           //it's like adding to one side and reducing the other so when it's equal, both sides of the string would have already counted
                holder++;

        }

        if (holder > 1 || holder == 0)                  //if there's more than one element to be changed, or none for that matter, it means it's not an almost palindrome
            return false;
        else
            return true;

    }

    public static void main(String[] args) {

        Scanner prompt = new Scanner (System.in);
        //so testing could be easier
        System.out.println("Type -1 to start the program.");
        System.out.println("Type -2 to stop the program.");
        int choice = prompt.nextInt();

        while (choice == -1) {
            System.out.print("Type a string: ");
            String string = prompt.next();

            System.out.println("almostPalindrome(" + string + ") -> " + almostPalindrome(string));

            System.out.println("Type -1 to continue the program.");
            System.out.println("Type -2 to stop the program.");
            choice = prompt.nextInt();

            if (choice == -2) {
                System.out.println("Program ended!");
                break;
            }
        }

    }



}

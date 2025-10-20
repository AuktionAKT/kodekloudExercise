package t1KE1_2;

import java.util.Scanner;

public class T1KE1_2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int wholeNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter a floatingpoint");
        double floatNumber = Double.parseDouble(sc.nextLine());
        System.out.println("please enter a character");
        char character = sc.nextLine().charAt(0);
        System.out.println("please enter a string");
        String word = sc.nextLine();

        System.out.println("User typed " + wholeNumber + " " + floatNumber + " " + character + " " + word);
    }

}

package t102;

import java.util.Scanner;

//Implementieren Sie ein Programm zum Quadrieren einer Zahl, die über die Konsole eingegeben wird.
public class T102 {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("please insert a number");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("The quadrat from the number is " + (number * number));
        sc.close();

    }
}

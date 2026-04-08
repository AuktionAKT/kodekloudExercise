package t103;
//Implementieren Sie ein Programm zur Berechnung von Umfang und Fläche eines Rechtecks. Die
//Seitenlängen des Rechtecks werden über Konsole eingegeben.
import java.util.Scanner;
public class T103 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert side length");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Please insert other side length");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("The area of the rectangle is " + (a * b));
        System.out.println("The Perimeter of the rectangle is " + (2 * (a+b)));
        sc.close();
    }

}

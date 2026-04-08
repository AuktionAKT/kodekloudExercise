package t104;

//Implementieren Sie ein Programm zur Berechnung von Umfang (U) und Fläche (A) eines Kreises. Der
//Radius des Kreises wird über Konsole eingegeben.

import java.util.Scanner;

public class T104 {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the radius");
        int radius = Integer.parseInt(sc.nextLine());

        System.out.format("Radius des Kreises %d\n", radius);
        double circumference = (2 * Math.PI * radius);
        System.out.println(circumference);

    }
}

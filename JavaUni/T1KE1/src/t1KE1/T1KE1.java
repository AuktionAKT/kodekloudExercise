package t1KE1;
//import scanner
import java.util.Scanner;
/*T1KE1 – Eingabe
Implementieren Sie ein Programm, welches einen String, ein einzelnes Zeichen, einen Integerwert
und eine Fließkommazahl von der Konsole einliest.*/
public class T1KE1 {
    static void main(String[] args) {
    //Scanner for collecting input
    Scanner sc = new Scanner(System.in);
        //getting input as wholenumber
        System.out.println("Please input a Wholenumber");
        //in.nextLine() reads a whole expression from the console as String
        //Integer.parseInt() - converts string to int
        int wholeNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Entered input is " + wholeNumber);

        //getting floatpoint input
        System.out.println("please input a float or double");
        double floatPoint = Double.parseDouble(sc.nextLine());
        System.out.println("Entered input is " + floatPoint);

        //getting single character input
        System.out.println("Please enter a single character");
        char single = sc.nextLine().charAt(0);
        System.out.println("The input is " + single);

        //getting string input
        System.out.println("give me that kelime bro");
        String kelime = sc.nextLine();
        System.out.println("input kelime is " + kelime);

        //close the scanner
        sc.close();
    }
}

package t1O1;

import java.util.Scanner;

public class T1O1 {
    static void main(String[] args) {

        //Scanner preparation
        Scanner sc = new Scanner(System.in);

        //Input number of Tickets
        System.out.println("Please type number of tickets");

        //Parsing the input
        int numberT = Integer.parseInt(sc.nextLine());

        //Please input the standart price
        System.out.println("Please input Standartprice");

        //Parsing the price input
        double priceS = Double.parseDouble(sc.nextLine());

        //Input the discount
        System.out.println("Please input the discount");

        //Parsing input discount
        int discount = Integer.parseInt(sc.nextLine());

        //Calculating the price
        double reduPrice = priceS - priceS * discount / 100;

        //Calculating the wholeprice
        double redTotalPrice = numberT * reduPrice;

        //printing output
        System.out.println("Number of tickets " + numberT);
        System.out.println("Reduced price of one Ticket " + reduPrice);
        System.out.println("Reduced whole price " + redTotalPrice);

    }
}

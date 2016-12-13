package us.nauvil.starworlds.text;

import java.util.Scanner;


public class ReadInputTest {


    public static void main(String[] args) {

        int i = 1;
        Scanner scan = new Scanner(System.in);

        while (i > 0) {
            System.out.print("Enter a number: ");

            String s = scan.next();
            // i = scan.nextInt();

            System.out.println("\t\tyou entered: " + s);
        }
    }
}

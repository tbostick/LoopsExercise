package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
/*    { for (int a = 1; a < 11; a++) {
        System.out.println("Count is:" + a);
    }
        for (int i = 10; i > 0; i--) {
            System.out.println("Count is: " + i);
        }
        System.out.println();
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println("Odd numbers are " + i);
        }
        System.out.println();
        for (int i = 2; i < 21; i = i + 2) {
            System.out.println("Even numbers are " + i);
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = keyboard.nextInt();

        for (int i = x; i >= 1; i--){
            System.out.println(i);
        }*/

//        int sum = 0;
//        for (int i = 1; i <11 ; i++) {
//            sum = sum + i;
//            System.out.println(sum);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int sum=0;for (int i=1; i<=x ; i++){
            sum = sum + i;
           System.out.println(sum);
        }


        for (int i=1; i<5; i++){
            for (int column = 1; column <=9; column++)
            System.out.print("*");
            System.out.println("*");
        }
        for (int i=1; i<5; i++){
            for (int column = 1; column <=6; column++)
                System.out.print("*");
            System.out.println("*");
        }

    }

}

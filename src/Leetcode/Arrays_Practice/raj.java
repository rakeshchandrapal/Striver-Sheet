package Leetcode.Arrays_Practice;

import java.util.Scanner;
import java.util.Random;
public class raj{

    public static void getLess(int less){
        System.out.println("The number you entered is lesser than i guessed");
    }

    public static void getGreater(int greater){
        System.out.println("The number you entered is greater than i guessed");
    }

    public static void getLesserThan(int x,int y){
        System.out.println("The number i guessed is lesser than "+x+ " and greater than "+y);
    }
    public static void getGreaterThan(int x,int z){
        System.out.println("The number i guessed is greater than "+x+ " and less than "+z);
    }
    public static void direct(int n){
        System.out.println("Congrats you got in the first try...");
    }

    public static void derect(int n){
        System.out.println("Congrats you got answer ");
    }

    public static void stillGreater(int n){
        System.out.println("It is still greater than "+n );

    }

    public static void stillLesser(int n){
        System.out.println("It is still lesser than "+n);

    }


    public static void main(String[]args) {

        Random ra = new Random();
        int r = ra.nextInt(100);
           System.out.println(r);

        System.out.println("Hi, i am Rajveer ");
        System.out.println("You have to predict a number i selected from 0-100");
        System.out.println("You only have 7 chances,with each chance you will get certain hint ");
        System.out.print("Enter 1 number: ");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
////            if(no<r){
////                getLess(no);
////             //   int a=no;
////            }
////
////            if(no>r){
////                getGreater(no);
////                //int b=no;
////            }
////            if(no==r){
////               direct (no);
////            }
//
//            for(int i=2;i<20;i++) {
//                System.out.print("Enter "+i+" number: ");
//                int num= sc.nextInt();
//            //    int x=num;
//                if(num==r){
//                    derect (num);
//                }
//
//                if (no<r && r<num) {
//                    getGreaterThan(no,num);
//                }
//                if (no>r && r>num) {
//                    getLesserThan(no,num);
//                }
//                if (num>r){
//                    getGreater(no);
//                }
//                if(num<r){
//                    getLess(num);
//                }
////                if (r<num && num<no) {
////                    getGreaterThan(num,no);
////                }
////                if (r>num && num>no) {
////                    getGreaterThan(num,no);
////                }
//
//
//
//            }
//        int b=0;
//        int c=0;

        for (int m=0;m<1;m++) {
            if (no > r) {
                getGreater(no);

            }
            if (no < r) {
                getLess(no);

            } if(no==r){
                direct(no);
                break;
            }


            for (int i = 2; i < 8; i++) {
                System.out.print("Enter " + i + " number: ");
                int num = sc.nextInt();
                //    int x=num;
                if (num == r) {
                    derect(num);
                    break;
                }
                if (r < num) {
                    stillLesser(num);
                }
                if (r > num) {
                    stillGreater(num);
                }
                if (no < r && r < num) {
                    getGreaterThan(no, num);
                }
                if (no > r && r > num) {
                    getLesserThan(no, num);
                }

                if (i == 7) {
                    System.out.println("Bad luck,you are not smarter than me...");
                }

            }
        }
    }
}
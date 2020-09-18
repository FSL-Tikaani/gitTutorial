package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int num1 = cons.nextInt();
        int num2 = cons.nextInt();
        int otvet;

        char operation = cons.next().charAt(0);

        switch (operation) {
            case '+':
                otvet = num1+num2;
                System.out.println(num1 + " + " + num2 + " = " + otvet);
                break;

            case '-':
                otvet = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + otvet);
                break;

            case '*':
                otvet = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + otvet);
                break;

            case '/':
                otvet = num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + otvet);
                break;
        }


    }
}

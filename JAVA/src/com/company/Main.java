package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        String[] scStrings = scString.split(" ");
        int num1 = Integer.parseInt(scStrings[0]);
        int num2 = Integer.parseInt(scStrings[1]);
        System.out.println(num1 + num2);


    }
}

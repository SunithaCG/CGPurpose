package org.example.sunitha.BasicPrgrms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner rev= new Scanner(System.in);
        System.out.println("Number to be reveresed");
        int number= rev.nextInt();
        int reverse=0;
        while(number!=0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;

        }
        System.out.println("Reverse of entered number is:" +reverse);

    }
}

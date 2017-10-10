
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {


    public static void main(String[] args) {
        float m=1852;
        Scanner sc= new Scanner(System.in);
        float millas,metros;
        System.out.println("Teclea las millas :");
        millas=sc.nextFloat();
        metros=millas*m;
        System.out.println(millas+" millas son "+metros+" metros");

    }
    
}

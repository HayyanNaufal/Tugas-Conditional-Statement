package no2;

import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        int beli ;
        try (Scanner belanja = new Scanner(System.in)){
            System.out.println("Ingin Beli berapa ?");
            beli = belanja.nextInt();
        } if (beli > 500){
            System.out.println("anda mendapatkan diskon = 75 ");
            System.out.println("hanya perlu membayar " + (beli - 75));
        } else if (beli > 300){
            System.out.println("anda mendapatkan diskon = 50");
            System.out.println("hanya perlu membayar " + (beli - 50));
        } else if (beli > 100){
            System.out.println("anda mendapatkan diskon = 20");
            System.out.println("hanya perlu membayar " + (beli - 20));
        }
        
    }
}

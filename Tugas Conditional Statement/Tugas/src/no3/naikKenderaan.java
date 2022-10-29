package no3;

import java.util.Scanner;

public class naikKenderaan {
    public static void main(String[] args){
        int orang;
        try (Scanner kendaraan = new Scanner (System.in)) {
            System.out.println("jumlah orang");
            orang = kendaraan.nextInt();
        }
        
        switch(orang){
            case 1 :
                System.out.println("Naik sepeda");
                break;
            case 2 :
                System.out.println("Naik motor");
                break;
            case 3 :
                System.out.println("Naik Becak");
                break;
            case 4 :
                System.out.println("Naik Mobil");
                break;
            default :
                System.out.println("Naik bus");
        }
    }
}

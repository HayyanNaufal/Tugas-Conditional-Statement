package no6;

import java.util.Scanner;

public class pinjamBuku {
    public static void main(String[] args) {
        int pinjam;
        double bayar;
        try(Scanner buku = new Scanner(System.in)){
            System.out.println("Ingin pinjam berapa ?");
            pinjam = buku.nextInt();
            bayar = 10000;
        }
        switch(pinjam){
            case 1 :
                System.out.println("Bayar Rp " + bayar);
            break;
            case 2 :
                System.out.println("Bayar Rp " + bayar * 2);
            break;
            case 3 :
                System.out.println("Bayar Rp " + bayar * 3);
            break;
            case 4 :
                System.out.println("kamu mendapatkan diskon 2,5 %");
                System.out.println("Bayar Rp " +( ( bayar * 4 ) - ( bayar * 4 * 2.5 / 100) ) );
            break;
            case 5 :
                System.out.println("kamu mendapatkan diskon 5 %");
                System.out.println("Bayar Rp "+ ( ( bayar * 5 ) - ( bayar * 5 * 5 / 100 ) ) );
            break;
            case 10 :
                System.out.println("Kamu mendapatkan diskon 10 %");
                System.out.println("Bayar Rp "+ ( ( bayar * 10 ) - ( bayar * 10 * 10 / 100 ) ) ) ;
            break;
        }
    }
}

package no1;

import java.util.Scanner;

public class programKelulusan {
    public static void main(String[] args) {
        int nilai;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("masukan nilai = ");
            nilai = input.nextInt();
        } if (nilai > 100){
            System.out.println("Anda terlalu Jenius");
        } else if (nilai >= 70){
            System.out.println("Selamat Anda lulus");
        } else {
            System.out.println("Mohon maaf Anda tidak lulus ");
        }
    }
}

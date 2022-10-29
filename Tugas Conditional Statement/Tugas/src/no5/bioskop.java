package no5;

import java.util.Scanner;

public class bioskop {

    public static void main(String[] args) {
        String umur;
        try (Scanner bioskop = new Scanner(System.in)) {
            System.out.println("Umur");
            umur = bioskop.nextLine();
        }

        switch(umur){
            case "anak" :
                System.out.println("Bisa menonton film dengan rating = SU, A, BO-A, BO-SU, BO");
            break;
            case "remaja" :
                System.out.println("Bisa menonton film dengan rating = SU, A, BO-A, BO-SU, BO, R");
            break;
            case "dewasa" :
                System.out.println("BIsa menonton semua film");
            break;
        }
    }
}

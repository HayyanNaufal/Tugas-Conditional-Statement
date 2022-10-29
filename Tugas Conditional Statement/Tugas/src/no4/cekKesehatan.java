package no4;

import java.util.Scanner;

public class cekKesehatan {
    public static void main(String[] args) {
        String kepunyaan;

        try (Scanner cek = new Scanner(System.in)) {
            System.out.println("Cek Kepunyaan ");

            // ketentuan = Pasien punya KIS , total bayar 0
            // 	Pasien tidak punya KIS , tapi warga setempat , bayar Rp.7.500
            // 	Pasien tidak punya kis , bukan warga setempat bayar Rp.10.000
            // 	Tidak punya kewarganegaraan , tidak boleh berobat

            kepunyaan = cek.nextLine();
            
        } if(kepunyaan.equals("punya kis")){
            System.out.println("Gratis");
        } else if(kepunyaan.equals("warga setempat")){
            System.out.println("Bayar Rp 7,500");
        } else if(kepunyaan.equals("bukan warga setempat")){
            System.out.println("Bayar Rp 10,000");
        } else{
            System.out.println("Tidak boleh berobat");
        }
    }
}

package Exam;

import java.util.Scanner;

public class FinalSorusu2b {
    public static boolean ozelKarakterMi(String sifre) {
        String ozelKarakterler = "!@$#%&+";
        boolean ozelkarektermi = false;

        for (int i = 0; i < sifre.length(); i++) {
            char harf = sifre.charAt(i);

            if (ozelKarakterler.indexOf(harf) != -1) {
                ozelkarektermi = true;
                break;
            } else {
                ozelkarektermi = false;
            }
        }

        return ozelkarektermi;
    }

    public static void guclulukbul(String sifre) {
        boolean kucukharfmi = false;
        boolean rakammi = false;
        boolean buyukharfmi = false;
        int sayac = 0;

        for (int i = 0; i < sifre.length(); i++) {
            char harf = sifre.charAt(i);

            if (harf >= 97 && harf <= 122) {
                kucukharfmi = true;
            } else if (harf >= 48 && harf <= 57) {
                rakammi = true;
            } else if (harf >= 65 && harf <= 90) {
                buyukharfmi = true;
            }
        }

        if (kucukharfmi)
            sayac++;
        if (buyukharfmi)
            sayac++;
        if (rakammi)
            sayac++;
        if (ozelKarakterMi(sifre))
            sayac++;

        System.out.println("Şifrenizin güvenlik oranı: " + sayac + "/4");
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz:");
        String sifre = klavye.nextLine();
        guclulukbul(sifre);
        klavye.close();
    }
}
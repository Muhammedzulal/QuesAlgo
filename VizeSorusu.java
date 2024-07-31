package Exam;

import java.util.Scanner;

public class VizeSorusu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girişi istenir
        System.out.print("Lütfen 1000 ile 2000 arasında bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Girilen sayının 1000 ile 2000 arasında olup olmadığı kontrol edilir
        if (sayi < 1000 || sayi > 2000) {
            System.out.println("Girdiğiniz sayı 1000 ile 2000 arasında olmalıdır.");
        } else {
            // Basamak sayıları toplanır ve sayıda kaç basamak olduğu bulunur
            int toplam = 0;
            int basamakSayisi = 0;
            int tempSayi = sayi;

            while (tempSayi > 0) {
                toplam += tempSayi % 10;
                tempSayi /= 10;
                basamakSayisi++;
            }

            // Ortalama hesaplanır ve ekrana yazdırılır
            double ortalama = (double) toplam / basamakSayisi;
            System.out.println("Girilen sayının basamaklarındaki sayıların ortalaması: " + ortalama);
        }

        scanner.close();
    }
}

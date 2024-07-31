package Exam;

import java.util.Scanner;

public class FinalSorusu2a {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Gir :");
            char karakter = keyboard.next().charAt(0);
            boolean sonuc = OzelKarakterMi(karakter);
            System.out.println("Özel karakter mi: " + sonuc);
        }
    }

    public static boolean OzelKarakterMi(char karakter) {
        String OzelKarakterler = "!@#$%*&+";

        // Özel karakterlerin bulunduğu string üzerinde döngü
        for (int i = 0; i < OzelKarakterler.length(); i++) {
            // Karakter özel karakterler içinde bulunursa true döndür
            if (karakter == OzelKarakterler.charAt(i)) {
                return true;
            }
        }

        // Özel karakterler içinde bulunmazsa false döndür
        return false;
    }
}

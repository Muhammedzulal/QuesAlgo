package Exam;

import java.util.Scanner;

public class FinalSorusu4 {

  public static String seslisil(String kelime) {
    String sesliharfler = "aeiouAEIOU";
    StringBuilder sonuc = new StringBuilder();

    for (int i = 0; i < kelime.length(); i++) {
      boolean isSesli = false;

      for (int j = 0; j < sesliharfler.length(); j++) {
        if (kelime.charAt(i) == sesliharfler.charAt(j)) {
          isSesli = true;
          break;
        }
      }

      if (!isSesli) {
        sonuc.append(kelime.charAt(i));
      }
    }

    return sonuc.toString();
  }

  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in)) {
      System.out.print("Bir kelime gir :");
      String kelime = keyboard.nextLine();

      String sonuc = seslisil(kelime);
      System.out.println("Sesli harfler silindikten sonra: " + sonuc);
    }
  }
}

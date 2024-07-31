package Exam;

public class FinalSorusu3 {
    public static void diziolustur(int rast1, int rast2) {
        int array[] = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (rast2 - rast1 + 1)) + rast1;
        }

        System.out.println("Oluşturulan Dizi:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = maxbul(array);
        System.out.println();
        System.out.println("Dizideki en büyük eleman: " + max);

    }

    public static int maxbul(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int rast1 = (int) (Math.random() * 11);
        int rast2 = (int) (Math.random() * 51) + 50;
        System.out.println("Aralık:(" + rast1 + "-" + rast2 + ")");
        diziolustur(rast1, rast2);
    }
}

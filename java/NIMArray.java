import java.util.*;

public class NIMArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        int[] digit = new int[nim.length()];

        for (int i = 0; i < nim.length(); i++) {
            digit[i] = Character.getNumericValue(nim.charAt(i));
        }

        int total = 0;
        int maks = digit[0];
        int min = digit[0];

        for (int d : digit) {
            total += d;
            if (d > maks) maks = d;
            if (d < min) min = d;
        }

        double rata = (double) total / digit.length;

        System.out.print("\nReverse array: ");
        for (int i = digit.length - 1; i >= 0; i--) {
            System.out.print(digit[i] + " ");
        }

        System.out.println("\nTotal: " + total);
        System.out.println("Maksimum: " + maks);
        System.out.println("Minimum: " + min);
        System.out.println("Rata-rata: " + rata);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(Sytem.in);
        System.out.print("Masukkan nilai tugas:");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS:");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS:");
        double uas = sc.nextDouble();

        double nilaiAkhir = (0.3*tugas) + (0.3*uts) + (0.4*uas);

        System.out.printl("Nilai Akhir="+nilai akhir);
        if (nilaiAkhir>=60)
        System.out.printl("Status: LULUS");
        else
        System.out.printl("Status: TIDAK LULUS");

    }
}

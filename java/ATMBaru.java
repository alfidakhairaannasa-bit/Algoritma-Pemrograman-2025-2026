import java.util.Scanner;

public class ATMBaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        boolean valid = false;

        // Validasi nama
        do {
            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();

            if (!nama.equals("")){
                valid = true;
            } else {
                System.out.println("Nama tidak boleh kosong!\n");
            }
        } while (!valid);

        System.out.print("Masukkan NIM (angka saja): ");
        String nim = input.nextLine();

        long saldo = Long.parseLong(nim);

        int pilihan;
        long jumlah;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nSaldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah tarik: ");
                    jumlah = input.nextLong();

                    if (jumlah <= saldo) {
                        saldo -= jumlah;
                        System.out.println("Tarik tunai berhasil");
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jumlah setor: ");
                    jumlah = input.nextLong();
                    saldo += jumlah;
                    System.out.println("Setor tunai berhasil");
                    break;

                case 4:
                    System.out.print("Masukkan jumlah transfer: ");
                    jumlah = input.nextLong();

                    if (jumlah <= saldo) {
                        saldo -= jumlah;
                        System.out.println("Transfer berhasil");
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
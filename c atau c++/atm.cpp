#include <iostream>
using namespace std;

int main() {
    string nama;
    bool valid = false;

    while (!valid) {
        cout << "Masukkan Nama: ";
        getline(cin, nama);

        if (!nama.empty()) {
            valid = true;
        } else {
            cout << "Nama tidak boleh kosong, coba lagi!\n\n";
        }
    }

    string nim;
    cout << "Masukkan NIM (Angka Saja): ";
    cin >> nim;

    long saldo = stol(nim);

    int pilihan;
    long jumlah, transfer;

    do {
        cout << "\n===== MENU ATM =====\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
        cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";
        cout << "Pilih: ";
        cin >> pilihan;

        switch (pilihan) {
            case 1:
                cout << "Saldo Anda : Rp " << saldo << endl;
                break;

            case 2:
                cout << "Jumlah tarik: ";
                cin >> jumlah;
                if (jumlah <= saldo) {
                    saldo -= jumlah;
                    cout << "Berhasil menarik uang\n";
                } else {
                    cout << "Saldo tidak cukup\n";
                }
                break;

            case 3:
                cout << "Jumlah setor: ";
                cin >> jumlah;
                saldo += jumlah;
                cout << "Berhasil setor tunai\n";
                break;

            case 4:
                cout << "Jumlah transfer: ";
                cin >> transfer;
                if (transfer <= saldo) {
                    saldo -= transfer;
                    cout << "Transfer berhasil\n";
                } else {
                    cout << "Saldo tidak cukup\n";
                }
                break;

            case 5:
                cout << "Terima kasih...\n";
                break;

            default:
                cout << "Pilihan tidak valid\n";
        }

    } while (pilihan != 5);

    return 0;
}
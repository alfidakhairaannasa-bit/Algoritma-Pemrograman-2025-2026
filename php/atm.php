<?php

$valid = false;

while(!$valid){
    echo "Masukkan nama: ";
    $nama = trim(fgets(STDIN));

    if(!empty($nama)){
        $valid = true;
    } else {
        echo "Nama tidak boleh kosong!\n\n";
    }
}

echo "Masukkan NIM (angka saja): ";
$nim = trim(fgets(STDIN));

$saldo = (int)$nim;

do {
    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih: ";
    $pilihan = trim(fgets(STDIN));

    switch($pilihan){
        case 1:
            echo "Saldo Anda : Rp $saldo\n";
            break;

        case 2:
            echo "Jumlah tarik: ";
            $jumlah = trim(fgets(STDIN));
            if($jumlah <= $saldo){
                $saldo -= $jumlah;
                echo "Tarik tunai berhasil\n";
            } else {
                echo "Saldo tidak cukup\n";
            }
            break;

        case 3:
            echo "Jumlah setor: ";
            $jumlah = trim(fgets(STDIN));
            $saldo += $jumlah;
            echo "Setor tunai berhasil\n";
            break;

        case 4:
            echo "Jumlah transfer: ";
            $jumlah = trim(fgets(STDIN));
            if($jumlah <= $saldo){
                $saldo -= $jumlah;
                echo "Transfer berhasil\n";
            } else {
                echo "Saldo tidak cukup\n";
            }
            break;

        case 5:
            echo "Terima kasih...\n";
            break;

        default:
            echo "Pilihan tidak valid\n";
    }

} while($pilihan != 5);

?>
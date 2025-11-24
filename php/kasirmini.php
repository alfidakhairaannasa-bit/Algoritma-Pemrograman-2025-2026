<?php

$nama = readline("Masukkan nama barang: ");
$harga = floatval(readline("Masukkan harga barang: "));
$jumlah = intval(readline("Masukkan jumlah beli: "));

$total = $harga * $jumlah;

if ($total > 200000) {
    $diskon = $total * 0.2;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

echo "\n===== STRUK PEMBELIAN =====\n";
echo "Nama Barang   : $nama\n";
echo "Harga Satuan  : $harga\n";
echo "Jumlah Beli   : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";
echo "============================\n";
?>

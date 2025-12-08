<?php

$nim = readline("Masukkan NIM: ");

$digit = [];

for ($i = 0; $i < strlen($nim); $i++) {
    $digit[] = (int)$nim[$i];
}

$total = array_sum($digit);
$max = max($digit);
$min = min($digit);
$rata = $total / count($digit);

$reverse = array_reverse($digit);

echo "\nArray Reverse: ";
foreach ($reverse as $d) {
    echo $d . " ";
}

echo "\nTotal: $total";
echo "\nMaksimum: $max";
echo "\nMinimum: $min";
echo "\nRata-rata: $rata";

?>
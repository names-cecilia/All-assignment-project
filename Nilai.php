<?php

$bil = readLine('Masukkan nilai : ');

if ($bil>60 && $bil<=100){
    if ($bil>80 && $bil<=100)
        echo "Nilai anda A \n";
    else
        echo "Nilai anda B \n";
    echo "Keterangan : Lulus";
}else{
    echo "Nilai Anda C \n";
    echo "Keterangan : Tidak lulus";
}

?>
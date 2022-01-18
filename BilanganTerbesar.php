<?php

echo " Menentukan nilai terbesar 3 bilangan";
echo "\r\n ==================================== \r\n";

$bil1 = readline("\r\n Masukkan bilangan pertama : ");
$bil2 = readline("\r\n Masukkan bilangan kedua : ");
$bil3 = readline("\r\n Masukkan bilangan ketiga : ");

$terbesar = $bil1;

if($bil2>$terbesar){
    $terbesar =  $bil2;
}
if($bil3>$terbesar){
    $terbesar =  $bil3;
}
    echo "\r\n Bilangan ".$terbesar." adalah yang terbesar";

if ($bil1==$bil2){
    echo "\r\n Bilangan pertama sama dengan bilangan kedua";
}
if ($bil2==$bil3){
    echo "\r\n Bilangan kedua sama dengan bilangan ketiga";
}
if ($bil1==$bil3){
    echo "\r\n Bilangan pertama sama dengan bilangan ketiga";
}

?>


<?php
$n="T";

do {
    
    $bil = readline("\nMasukkan bilangan : \n");
        if ($bil%2 == 0){
            echo "merupakan bilangan genap\n";
        }else{
            echo "merupakan bilangan ganjil\n";
        }
    $n = readline("\nInput bilangan lagi? [Y/T] : \n");    
}while ($n=="Y");
<?php
$i=1;

$batas = readline("Masukkan batas perulangan : ");

while($i<=$batas){
    
    $bil = readline("Masukkan bilangan : ");
        if ($bil%2==0){
            echo "merupakan bilangan genap\n";
        }else{
            echo "merupakan bilangan ganjil\n";
        }
        
    $i++;
}
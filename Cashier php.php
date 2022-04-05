<?php

//function
function disc($totalPrice){
    if ($totalPrice > 100){
        echo "\nYou just purchased more than $100!";
        echo "You've got discount 15%! Now your total is $".$totalPrice*0.85;
        echo "\n\nTHANK YOU!";
    } else {
        echo "\n\nTHANK YOU!";
    }
}

echo "      BOOKSTORE CASHIER\n";
echo "=============================\n\n";
echo "Book list :\n";

//array
$books = array ("Children book", "Parenting book", "Educational book", "Science book", "Novel");
$price = array (20, 40, 30, 45, 35);

//looping
for ($i = 0 ; $i <= 4 ; $i++){
    echo "  ".$books[$i]." : $".$price[$i]."\n";
}
echo "\nDISCOUT 15% IF PURCHASE MORE THAN $100";
echo "\n========================================\n\n";

$item = readline("\nInput book item number [0 to 4] : ");

//conditional
if ($item>=0 && $item<=4){
    
    $n = readline("How many book : ");
    $name = $books[$item];
    $totalPrice = $price[$item]*$n;
    
    echo "\n-------------------------";
    echo "\nYou just bought ".$n." book(s) of ".$name;
    echo "\nfor $".$totalPrice;
    disc();
    
} else {
    echo "Please enter the number between 0 and 4";
}

print("Menentukan nilai terbesar 3 bilangan")
print("===================================== \n")

bil1 = int(input("Masukkan bilangan pertama : "))
bil2 = int(input("Masukkan bilangan kedua : "))
bil3 = int(input("Masukkan bilangan ketiga : "))

terbesar = int
terbesar = bil1

if (bil2>terbesar):
    terbesar = bil2
    
if (bil3>terbesar):
    terbesar = bil3
    
print("\nBilangan terbesar adalah " + str(terbesar))

if (bil1==bil2):
    print("Bilangan pertama sama dengan bilangan kedua")
if (bil2==bil3):
    print("Bilangan kedua sama dengan bilangan ketiga")
if (bil1==bil3):
    print("Bilangan pertama sama dengan bilangan ketiga")

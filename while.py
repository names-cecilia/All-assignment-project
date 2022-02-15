n = int(input("Masukkan batas perulangan: "))
print("\n")
i=1

while i<=n :
    bil = int(input("Masukkan bilangan: "))
    
    if bil % 2 == 0:
        print("Bilangan " + str(bil) + " merupakan bilangan genap \n")
    else:
        print("Bilangan " + str(bil) + " merupakan bilangan ganjil \n")
    
    i+=1


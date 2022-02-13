x=int(input("Masukkan nilai : "))

if x>60 and x<=100:
    if (x>80 and x<=100):
        print("Nilai anda A")
    else:
        print("Nilai anda B")
    print("Keterangan : Lulus")
else:
    print("Nilai anda C")
    print("Ketarangan : Tidak Lulus")
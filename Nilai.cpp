#include <iostream>
using namespace std;

int main () {
    int x = 0;
    
    cout<<" Masukkan Nilai : ";
    cin>>x;
    if (x>60 && x<=100) {
        if (x>80 && x<=100)
            cout << "Nilai anda A"<<endl;
        else
            cout<< "Nilai anda B"<<endl;
        cout << "Keterangan : Lulus";
    }else {
        cout << "Nilai anda C"<<endl;
        cout<< "Keterangan : Tidak lulus";
    }
     return 0;       
}
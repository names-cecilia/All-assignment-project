#include <iostream>
using namespace std;

int main()
{
    int bil;
    int batas;
    int i=1;
    char n='T';

    
    do {
    
        cout<< "Masukkan Bilangan : "<<endl;
        cin>>bil;
        cout<<endl;
        
        if (bil%2==0)
        {
            cout<<"merupakan bilangan genap"<<endl;
        }
        else
        {
            cout<<"merupakan bilangan ganjil"<<endl;
        }
        
        cout<<"Masukkkan bilangan lagi? [Y/T] :"<<endl;
        cin>>n;
    } while (n=='Y');

    return 0;
}

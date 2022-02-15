#include <iostream>
using namespace std;

int main()
{
    int bil;
    int batas;
    int i=1;
    
    cout<<"Masukkan batas perulangan : "<<endl;
    cin>>batas;
    
    while (i<=batas){
    
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
    i++;
    }

    return 0;
}

#include <iostream>
using namespace std;

int main()
{
    int bil;
  
    for (int i=1; i<=3; i++){
    
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
    }

    return 0;
}

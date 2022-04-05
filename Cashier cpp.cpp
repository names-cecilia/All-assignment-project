#include <iostream>
using namespace std;

int i, item, n, totalPrice;
string name;

//fuction    
void disc(){
    if (totalPrice > 100){
        cout<<"You just purchase more than $100!"<<endl;
        cout<<"You've got discount 15%! Now, you total is $"<<totalPrice*0.85<<endl<<endl;
        cout<<"THANK YOU!"<<endl;
    }else{
        cout<<"THANK YOU!"<<endl;
    }
}

int main(){
    
    //array
    string books[] = {"Children book", "Parenting book", "Educational book", "Science book", "Novel"};
    int price[] = {20, 40, 30, 45, 35};
    
    cout<<"    BOOKSTORE CASHIER"<<endl;
    cout<<"=========================="<<endl<<endl;
    cout<<"Book List : "<<endl;
    
    //looping
    for (i=0 ; i<= 4; i++){
        cout << "  " << books[i] << " : " << "$" << price[i] << endl;
    }
    
    cout<<"\nDISCOUT 15% IF PURCHASE MORE THAN $100"<<endl;
    cout<<"=========================="<<endl<<endl;
    cout<<"Input book item number [0 to 4] : ";
    cin>>item;
    
    //conditional
    if (item>=0 && item<=4){
        cout<<"How many book : ";
        cin>>n;
        name = books[item];
        totalPrice = price[item]*n;
        
        cout<<"---------------------"<<endl;
        cout<<"You just bought " << n << " book(s) of " << name <<endl;
        cout<<"for $"<<totalPrice<<endl<<endl;
        disc();
        
    } else {
        cout<<"Please enter the number between 0 and 4"<<endl;
    }
    
}

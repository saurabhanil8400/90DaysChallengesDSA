#include<bits/stdc++.h>
using namespace std;

int sumElement(int arr[],int num){
    int sum=0;
    for(int i=0;i<num;i++){
        sum=sum+arr[i];
    }
    return sum;
}


int main(){
    // sum of all element
    int num;
    cin>>num;
    int arr[num];
    for(int i=0;i<num;i++){
        cin>>arr[i];

    }
    for(int i=0;i<num;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Sum of all element "<<sumElement(arr,num)<<endl;


return 0;
}
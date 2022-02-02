#include<bits/stdc++.h>
using namespace std;

int uniqueNo(int arr[],int n){
    int ans=0;
    for(int i=0;i<n;i++){
        ans=ans^arr[i];
    }
    return ans;


}
// find unique number in array
// ex =arr{1, 2,1, 2,4}
// out=4its unique no which present in array

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<uniqueNo(arr,n);
    

return 0;
}
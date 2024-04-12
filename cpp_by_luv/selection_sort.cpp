#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
    {
        cin>>ar[i];
    }
    for(int i=0;i<n;i++)
    {
        int minmindex=i;
        for(int j=i+1;j<n;j++)
        {
            if(ar[j]<ar[minmindex]){
                minmindex=j;
            }
        }
        swap(ar[i],ar[minmindex]);
    }
    for(int i=0;i<n;i++)
    {
        cout<<ar[i]<<" ";
    }
    return 0;
}
#include<bits/stdc++.h>
using namespace std;
 //constant int N =1e5+10;
 
int main()
{
	int N =1e5+10;
	int a[N];
    int n;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    int q;
    cin>>q;
    while(q--)
    {
        int l,r;
        cin>>l>>r;
        long long int sum=0;
    for(int i=l;i<=r;i++)
    {
        sum += a[i];
    }
    cout<<sum<<endl;
    }

    return 0;

}